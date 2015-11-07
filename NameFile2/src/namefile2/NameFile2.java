package namefile2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.naming.InvalidNameException;
public class NameFile2 {

    /**
     * the command line arguments
     *
     * @param s
     * @throws javax.naming.InvalidNameException
     */
    public static void hasOnlyLetters(String s) throws InvalidNameException {

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(s.charAt(i))) {
                throw new InvalidNameException("invalid name");
            }
        }
    }

    public static void isFemaleName(String s) throws InvalidNameException {
        char lastChar = s.charAt(s.length() - 1);

        if (lastChar == 'a') {
            throw new InvalidNameException("female name");
        }
    }

    public static void getFromFile(File output, File input) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(input));
        PrintWriter pw = new PrintWriter(new FileWriter(output));

        String line = null;

        while ((line = br.readLine()) != null) {
            try {
                hasOnlyLetters(line);
                isFemaleName(line);

                pw.println(line);
            } catch (InvalidNameException ex) {

                pw.println("Null");
            }
        }
        pw.close();
        br.close();
    }

    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        try {
            getFromFile(outputFile, inputFile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

}

/*
 * da se napishe programa , koqto 4ete nizove ot fail na vseki red .s ReadLine()
, i vika funkciq koqto gi 
 * prevrushta v int ( bez gotovi)   i zapisva chislata vuv fail
 * @param args
 */
package writeandreadfile;

import java.io.*;

/**
 *
 * @author Terax
 */
public class WriteAndReadFile {

    public static void main(String[] args) throws IOException {
        BufferedReader input = null;
        BufferedWriter output = null;
        String current = new java.io.File(".").getCanonicalPath();
        System.out.println("dir : " + current);
        try {
            input = new BufferedReader(new FileReader("text1.txt"));
            output = new BufferedWriter(new FileWriter("text2.txt"));
            int c;
            String s;
            while ((s = input.readLine()) != null) {
                System.out.println(s);
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if ((int) ch >= (int) '0' && (int) ch <= (int) '9') {

                        output.write(s.charAt(i));

                    }
                }
                output.newLine();
            }
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }

    }

}

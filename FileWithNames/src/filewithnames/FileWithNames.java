/* Да се напише функция която чете от файл имена и проверява дали имат:
1: Само символи 
2: Дали са женски (да завършват на 'а' или 'я')
3: Да се запосват във файл всики имена, 
ако не са женски записваме по default male name
 */
package filewithnames;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWithNames {
    public static void getName (File name) throws IOException{
     BufferedReader br = new BufferedReader (new FileReader(name));
     String thisLine;
     File outputFile = new File("output.txt");
     PrintWriter pw = new PrintWriter (new FileWriter(outputFile));
     while ((thisLine = br.readLine()) != null){
     System.out.println (thisLine);
     boolean onlyLetters = true;
     boolean femaleName = false;
     for (int i = 0; i < thisLine.length(); i++){
         if (!Character.isAlphabetic(thisLine.charAt(i))){
             onlyLetters = false;
             break;
         }
     }
     char lastLetter = thisLine.charAt(thisLine.length() - 1);
     if (lastLetter == 'a' || lastLetter == 'q'){
         femaleName = true;
     }
     if (onlyLetters == false || femaleName == false ){
         pw.println("MALE NAME");
     }else{
         pw.println(thisLine);
     }
    } //END 
     br.close();
     pw.close();
     
    }
    public static void main(String[] args) throws IOException {
        File fl = new File ("Names.txt");
        try{
            getName(fl);
        }catch(IOException ex){
            System.out.println("The file is missing");
        }
    }
}

//Write in file numbers from 1 to 20 
package writeinfile20numbers;
import java.io.*;
public class WriteInFIle20Numbers {
    public static void main(String[] args) throws Exception {
        File file = new File("temp.txt"); 
        FileOutputStream stream = new FileOutputStream(file);
        PrintWriter write = new PrintWriter("temp.txt");
        for(int i = 1; i < 21; i++){
                write.println(i);
                }
                write.close();
            }
}   


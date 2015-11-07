package calculator;
//import java.io.*;
/**
 *
 * @author Terax
 */
public class Calculator {
	public static void main (String[] args) {
//	   File dir = new File (System.getProperty("user.dir"));
//	   if (dir.isDirectory()) {
//	      System.out.println("Directory of " + dir);
//	      String[] listing = dir.list();
//	      for (int i = 0; i < listing.length; i++)
//	         System.out.println ("\t" + listing[i]);
//              
//	   }
           
    int i=1, j=1;
        try {
            i++; 
            j--;
            if(i/j > 1)
                i++;
        }
        catch(ArithmeticException e) {
            System.out.println(0);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(1);
        }
        catch(Exception e) {
            System.out.println(2);
        }
        finally {
            System.out.println(3);
        }
        System.out.println(4);
        }
}





/*
1. Напишете програма, която чете от конзолата три числа от тип int 
и отпечатва тяхната сума.
 */
package readandwrite;
import java.util.Scanner;
public class ReadandWrite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();
        System.out.println(" The sum of the numbers is " + (a + b + c));
    }
    
}

/*
5. Напишете програма, която чете от конзолата две цели числа и отпечатва
по-голямото от тях. Реализирайте програмата без използването на сравнение. 
Забележка: задачата изисква малко да помислите!
5. Нека числата са a и b. Използвайте следните преобразувания:
a=a-b; b=b+a; a=b-a.
 */
package thebiggernumber;
import java.util.Scanner;
public class TheBiggerNumber {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int a = imput.nextInt();
        System.out.print("Enter second number: ");
        int b = imput.nextInt();
        System.out.println("The bigger number is " + Math.max(a, b));
      }
    
}

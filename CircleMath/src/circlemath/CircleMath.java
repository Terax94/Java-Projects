/*
2. Напишете програма, която чете от конзолата радиуса "r" на кръг
и отпечатва неговия периметър и обиколка.
 */
package circlemath;
import java.util.Scanner;
public class CircleMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radious of the circle: ");
        int radius = input.nextInt();
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + circleArea);
        
    }
    
}

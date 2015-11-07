/*
7. Силата на гравитационното поле на луната е приблизително 17% 
от това на земята. Напишете програма, която да изчислява тежестта на човек
на луната, по дадената тежест на земята.
 */
package weightonmoon;
import java.util.Scanner;
public class WeightonMoon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight;
        System.out.print("Enter your weigh (kg): "); 
        weight = input.nextInt();
        //The weight ot a person on the moon is 1/6 of his weight on the Earth.
        float weightOnMoon = weight/6f;
        System.out.println("The weight of a person on the Moon is " + weightOnMoon + "!");
    }
    
}

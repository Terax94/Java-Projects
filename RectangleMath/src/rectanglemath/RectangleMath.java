/*
5. Напишете програма, която за подадени дължина и височина на правоъгълник, 
изкарват на конзолата неговият периметър и лице.
 */
package rectanglemath;
public class RectangleMath {
    public static void main(String[] args) {
        int lenght = 5;
        int height = 6;
        int rectPerson = lenght * height;
        int rectPerimeter = (2*lenght)+(2*height);
        System.out.println("The person of the resctagle is " + rectPerson + 
        " and the perimeter is " + rectPerimeter + ".");
    }
    
}

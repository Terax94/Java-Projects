/*
10. Декларирайте две променливи от тип int. Задайте им стойности съответно 
5 и 10. Разменете стойностите им и ги отпечатайте.
 */
package changenumbers;
public class ChangeNumbers {
    public static void main(String[] args) {
        int numbOne = 5;
        int numbTwo = 10;
        int temp = numbOne;
        numbOne = numbTwo;
        numbTwo = temp;
        System.out.println("Numbers befor swap are " + numbOne + " and " + numbTwo);        
    }
    
}

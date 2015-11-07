/*
3. Напишете израз, който да проверява дали дадено цяло число 
съдържа 7 за трета цифра (отдясно на ляво).
 */
package numbercheck;
public class NumberCheck {
    public static void main(String[] args) {
        int numbFirst = 10741;
        int numbNext = numbFirst / 100;
        int numbRest = numbNext % 10;
        if (numbRest == 7){
            System.out.println("The number (" + numbFirst + ") contains number 7.");
        }else{
            System.out.println("The number (" + numbFirst + ") don't contains number 7.");
        }
    }
    
}

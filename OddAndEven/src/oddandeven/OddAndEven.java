/*
1. Напишете израз, който да проверява дали дадено цяло число е четно или нечетно.
 */
package oddandeven;
public class OddAndEven {
    public static void main(String[] args) {
        int numb = 6;
        int residue = numb%2;
        if (residue == 0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }
    }
    
}

/*
4. Напишете израз, който да проверява дали 
третия бит на дадено число е 1 или 0.
4. Използвайте побитово "И" върху числото и число, 
което има 1 само на третия бит. Ако върнатият резултат е различен от 0,
то третия бит е 1.
 */
package bitnumbercheck;
public class BitNumberCheck {
    public static void main(String[] args) {
        int numbBit = 100100;
        int numbTestBit = 001000;
        if ((numbBit & numbTestBit) != 0) {
            System.out.println("The third bit is 1.");
        }else{
            System.out.println("The third bit is 0.");
        }
    }
    
}

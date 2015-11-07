/*
2. Напишете булев израз, който да проверява дали дадено цяло число
се дели на 5 и на 7 без остатък.
 */
package delenena5i7;
public class DeleneNa5i7 {
    public static void main(String[] args) {
        int numb = 35;
        int deleneEdno = numb%5;
        int deleneDve = numb%7;
        if ((deleneEdno == 0) && (deleneDve == 0)){
            System.out.println("Chesloto se deli na 5 i na 7 bez ostatuk.");
        }else{
            System.out.println("Chisloto ne se deli na 5 i na 7 bez ostatuk.");
        }
    }
}

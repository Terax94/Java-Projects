/*
3. Дадена фирма има име, адрес, телефонен номер, факс номер, уеб сайт и мениджър.
Мениджърът има име, фамилия и телефонен номер. Напишете програма, която чете 
информацията за компанията и нейния мениджър и я отпечатва след това на конзолата.
 */
package firmdata;
public class FirmData {
    public static void main(String[] args) {
        String name = "BSK";
        String addres = "64 Gurko Street";
        long phoneNumber = +359887665559L; 
        int faxNumber = +359658945;
        String website = "www.kuche.com";
        String firstName = "Georgi";
        String secondName = "Ivanov";
        long menagerNumber = +35988755669L;
        System.out.printf("%S is on %s the firm phone number and fax are %d and %d."
                + " The website of firm is "
                + "%s. The main menager is %s %s. his number is %d ", name, addres, phoneNumber, faxNumber, website, firstName, secondName, menagerNumber);
    }
    
}

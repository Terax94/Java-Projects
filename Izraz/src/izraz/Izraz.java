/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izraz;

/**
 *
 * @author Terax
 */
public class Izraz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p = 1;
        int c = 1;
        int b = 1;
        double a;
        double x = (Math.sqrt(Math.pow(p, 2) + 3));
        double y = p + (c / b);
        double z = (Math.sqrt(b + (4 * Math.pow(c,2))));
        a = x / (y * z );
        System.out.println(a);
    }
    
}

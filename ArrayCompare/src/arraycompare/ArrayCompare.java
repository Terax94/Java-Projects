
package arraycompare;

import java.util.Arrays;

public class ArrayCompare {
    
    public static void main(String[] args) {
        int [] arrayA = new int [] {1,2,3,4,5,6};
        int [] arrayB = new int [] {1,2,3,4,5,6};
        boolean compare = Arrays.equals (arrayA, arrayB);
        System.out.println("Arrays are equale -> " + compare);
    }
    
}

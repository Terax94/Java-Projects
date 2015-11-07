/*
6. Напишете израз, който изчислява площта на трапец по дадени a, b и h.
 */
package faceoftrapeze;
public class FaceOfTrapeze {
    public static void main(String[] args) {
        int face;
        int a = 4;
        int b = 2;
        int h = 3;
        face = ((a + b) / 2) * h;
        System.out.println("The face of the trapeze is " + face + ".");
        
    }
    
    
}

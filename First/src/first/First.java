package first;
public class First {
    public static void main(String[] args){
        int a = 10;
        int[] b = new int[10];
        int counter = 0;
        //10=1*8+0*4+1*2+0*1
        //1010
        while(a>0){
            //a = 10 b[0]=0, a = 5, b[1]=1
            //
            b[counter] = a%2;
            a/=2;
            System.out.println("a= " + a + "!" + "b[]" + b[counter] + "counter: " + counter);
            counter++;
        }
        System.out.println("Binary: ");
        for(int i = counter-1; i>=0; i--){
            System.out.print(b[i]);
        }
        long number = 34546548;
        //max1 > max2
        byte max1 = 0;
        byte max2 = 0;
        while(number > 0){
            byte t = (byte)(number % 10);
            number /= 10;
            if(t > max2){
                max2 = t;
                byte tmp;
                if(max1 < max2){
                tmp = max1;
                max1 = max2;
                max2 = tmp;
            }
        }
        System.out.println(max1 + "!" + max2);
    }
    }
}
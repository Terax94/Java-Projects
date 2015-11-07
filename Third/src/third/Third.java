package third;
public class Third {
     public static int strCompare(String one, String two){
        int a;
        if(one.length() > two.length()){
            a = one.length();
        }else{
            a = two.length();
        }
        for(int i = 0; i < a; i++){
            if(one.charAt(i) < two.charAt(i)){
                return -1;
            }else if(one.charAt(i) > two.charAt(i)){
                return 1;
            }
        }
        if(two.length() < one.length()){
            return 1;
        }else if(two.length() > one.length()){
            return -1;
        }
        return 0;
    }
    public static void main(String[] args){
        String a = "abcd";
        String b = "abdc";
        System.out.println(strCompare(a, b));
    }
}

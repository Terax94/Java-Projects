/*
 * Conver letter from lower to upper and from upper to lower.
 */
package letterslowertoupper;

public class LettersLowerToUpper {
    public static String convertToCapital(String s){
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                result.append((char)(s.charAt(i) + 'a' - 'A'));
            }else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
        
    }
    public static void main(String[] argv){
        System.out.println(convertToCapital("AbKnU"));
    }
}
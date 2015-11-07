package lesson10zadacha1;
public class Lesson10Zadacha1{
	public static String longestSubstring(String a,String b){
		String result = "";
		String big;
		String small;
		if(a.length() >  b.length()){
			big = a;
			small = b;
		}else{
			big = b;
			small = a;
		}
		//  123456     ln = 6;
		//  y  do  ln - lenght =  6-6=0
		//  0 6
        	// 6  > = 1?     0 < 0;
		for(int ln = small.length() ; ln >=1  ; ln-- ){
			boolean tr = true;
			for(int ind = 0 ; ind <= small.length()-ln ; ind++){
				String temp = small.substring(ind,ind+ln); // 0  0+6  ,   
				int isSubstr = big.indexOf(temp);
				if(isSubstr >= 0){
					result = temp;
					tr=false;
					break;
				}				
			}
			if(!tr){
			break;
			}
		}
			
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "weaint";
		String b = "fainsd";
		String c = longestSubstring(a,b);
		//System.out.println(a.substring(1, 1+(a.length()-1)));
		System.out.println(c);
		
		
	}

}
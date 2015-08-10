package math;

public class AddBinary {
	public static void main(String[] args) {
		String s1 ="1010" ;
		String s2="1011" ;
		addBinary(s1, s2) ;
	}
	public static String addBinary(String a, String b) {
		  if(a==null||b==null) return null ;
	        StringBuffer sb = new StringBuffer() ;
	        int carry =0 ;
	        int i=a.length()-1 ;
	        int j=b.length()-1 ;
	        while(i>=0||j>=0){
	            int sum=carry ;
	           if(i>=0){
	                int ai =a.charAt(i)-'0' ;
	                sum+=ai ;
	           } 
	           if(j>=0){ 
	                int bi =b.charAt(j)-'0' ;
	               sum+=bi  ;
	               
	           }
	           sb.append(sum%2) ;
	           carry = sum/2 ;
	            i-- ;
	            j-- ;
	        }
	       
	        if(carry>0) sb.append(carry) ;
	        return sb.reverse().toString() ;
   }
}

package math;

public class Multiply {
	public static void main(String[] args) {
		multiply("99","8") ;
	}
	 public static String multiply(String num1, String num2) {
		 StringBuffer sb = new StringBuffer() ;
	        String res="" ;
	        int carry =0 ;
	        int i =num1.length()-1 ;
	        int j =num2.length()-1 ;
	        while(i>=0){
	             sb = new StringBuffer() ; 
	             carry = 0 ;
	             int num1_i =num1.charAt(i)-'0' ;
	             int num2_i =0 ;
	             j =num2.length()-1 ;
	            while(j>=0){
	                num2_i =num2.charAt(j)-'0' ;
	                sb.append((num1_i*num2_i+carry)%10) ;
	                carry =(num1_i*num2_i+carry)/10 ;
	                j-- ;
	            }
	            if(carry>0) sb.append(carry) ;
	            String temp =sb.reverse().toString();
	            int k =num1.length()-1- i ;
	            while(k>0){
	                temp+="0" ;
	                k--;
	            }
	            res =add(temp,res) ;
	            i--;
	        }
	        i=0 ;
	        while(res!=null&&i<res.length()-1&&res.charAt(i)=='0'){
	            i++;
	        }
	        return res.substring(i) ;
	    }
	    private static String add(String a,String b){
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
	           sb.append(sum%10) ;
	           carry = sum/10 ;
	            i-- ;
	            j-- ;
	        }
	       
	        if(carry>0) sb.append(carry) ;
	        return sb.reverse().toString() ;
	    }
}

package math;

public class PalindromeNumber {
	 public boolean isPalindrome(int x) {
	        if(x<0) return false ;
	        int div = 1 ;
	        int len = 1 ;
	        while(x/div>=10){
	            len++ ;
	            div *=10 ;
	        }
	       for(int i=0 ;i<len/2;i++){
	            int high = x/div ;
	            int low = x%10 ;
	            if(high!=low){
	                return false ;
	            }
	            x=(x%div)/10 ;
	            div /=100 ;
	        }
	        return true;
	    }
}

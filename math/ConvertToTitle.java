package math;

public class ConvertToTitle {
	 public String convertToTitle(int n) {
	        StringBuffer sb= new StringBuffer() ;
	        while(n>0){
	            int num =(n-1)%26 ;
	            char c =(char)('0'+17+num) ;
	            sb.append(c) ;
	            n =(n-1)/26 ;
	        }
	        return  sb.reverse().toString() ;
	    }
}

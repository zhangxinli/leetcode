package math;

public class NumberofDigitOne {
	  public int countDigitOne(int n) {
	        int res=0 ;
	        if(n<=0) return 0 ;
	        if(n<10) return 1 ;
	        int i =1 ;
	        int j=n ;
	        while(j/10>0){
	            i*=10 ;
	            j/=10 ;
	        }
	        int high =n/i ;
	        int left =n%i ;
	        if(high==1) res+=(left+1)+countDigitOne(left)+countDigitOne(i-1) ;
	        if(high>1){
	          res+= count(i,high-1)+countDigitOne(left) ;
	        }
	        return res ;
	        
	    }
	    private int count(int i,int j){
	        if(i<10) return 1 ;
	        return (j+1)*count(i/10,9)+i ;
	    }
}

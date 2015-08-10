package math;

public class Pow {
	public double myPow(double x, int n) {
        double res =1 ;
        while(n!=0){
           if(n%2==0){
               x=x*x ;
               n/=2 ;
           }else{
               if(n>0){
                   res *=x ;
                   n-- ;
               }else{
                   res /=x ;
                   n++ ;
               }
           }
        }
        return res ;
    }
}

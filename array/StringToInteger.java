package restart.array;

public class StringToInteger {
	private int maxDiv10 =Integer.MAX_VALUE/10 ;
	public int solution(String nums){
		if(nums==null||nums.length()==0) return 0 ;
		int i =0 ;
		while(nums.charAt(i)==' ') i++ ;
		int sign =1 ;
		if(nums.charAt(i)=='+'){
			sign=1 ;
		}else if(nums.charAt(i)=='-'){
			sign=-1 ;
		}
		i++ ;
		int res=0 ;
		while(i<nums.length()){
			int digit =nums.charAt(i)-'0' ;
			if(res>maxDiv10||res==maxDiv10&&digit>=8){
				return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE ;
			}
			res=res*10+digit ;
			i++ ;
		}
		return res*sign ;
	}
}

package restart.array;


public class LongestPalindomeString {
	public String solution(String str){
		int start =0 ;
		int max =0 ;
		for(int i=0 ;i<str.length();i++){
			int len1= expend(str, i, i) ;
			int len2 = expend(str, i, i+1) ;
			int len =Math.max(len1, len2) ;
			if(len>max){
				max =len ;
				start=i-(len-1)/2 ;
			}
		}
		
		return str.substring(start, start+max) ;
	}
	private int expend(String str,int start,int end){
		int L =start ;
		int R =end ;
		while(L>=0&&R<str.length()&&str.charAt(L)==str.charAt(R)){
			L--;
			R++ ;
		}
		return R-L+1 ;
	}
	
}

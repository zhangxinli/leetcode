package restart.array;

public class VaildPalindrome {
	public boolean isPalindrome(String str){
		if(str==null||str.length()==0) return true ;
		int i =0 ;
		int j=str.length()-1 ;
		while(i<j){
			while(i<j&&!Character.isLetterOrDigit(str.charAt(i))) i++ ;
			while(j>i&&!Character.isLetterOrDigit(str.charAt(j))) j-- ;
			if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(j))){
				return false ;
			}
			j--;i++ ;
		}
		return true ;
	}
}

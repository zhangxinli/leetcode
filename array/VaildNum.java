package restart.array;

public class VaildNum {
	public boolean sulution(String str){
		int i =0 ;
		int n = str.length() ;
		while(i<n&&str.charAt(i)==' ') i++ ;
		if(i<n&&(str.charAt(i)=='+'||str.charAt(i)=='-')) i++ ;
		boolean isDigit =false ;
		while(i<n&&Character.isDigit(str.charAt(i))){
			i++ ;
			isDigit=true ;
		}
		if(str.charAt(i)=='.'){
			i++ ;
			while(i<n&&Character.isDigit(str.charAt(i))){
				i++ ;
				isDigit=true ;
			}
		}
		if(str.charAt(i)=='e'){
			i++ ;
			isDigit =false ;
			while(i<n&&Character.isDigit(str.charAt(i))){
				i++ ;
				isDigit=true ;
			}
		}
		if(i<n&&(str.charAt(i)=='+'||str.charAt(i)=='-')) i++ ;
		return isDigit&&i==n ;
	}

}

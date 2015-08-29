package restart.array;

public class reverseWords {
	public String reverse(String str){
		if(str==null||str.length()==0) return "" ;
		StringBuffer sb = new StringBuffer();
		int j =str.length() ;
		for(int i = str.length()-1 ;i>=0 ;i++){
			if(str.charAt(i)==' '){
				j=i ;
			}else{
				if(i==0||str.charAt(i-1)==' '){
					if(sb.length()!=0){
						sb.append(' ') ;
					}
					sb.append(str.substring(i, j)) ;
				}
			}
		}
		return sb.toString() ;
	}
}

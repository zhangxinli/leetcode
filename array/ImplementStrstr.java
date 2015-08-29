package restart.array;

public class ImplementStrstr {
	public int solution(String str1,String str2){
		for(int i=0 ;;i++){
			for(int j=0 ;;j++){
				if(j==str2.length()) return i ;
				if(i+j==str1.length()) return -1 ;
				if(str1.charAt(i+j)!=str2.charAt(j)) break ;
			}
		}
	}
}

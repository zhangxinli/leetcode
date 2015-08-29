package restart.array;

public class OneEditDistance {
	public boolean solution(String s1,String s2){
		int m1 =s1.length() ;
		int m2 =s2.length() ;
		if(m1>m2) solution(s2, s1) ;
		int i=0 ;
		int shift =m2-m1 ;
		while(i<m1&&s1.charAt(i)==s2.charAt(i)) i++ ;
		if(i==m1) return shift>0 ;
		if(shift==0) i++ ;
		while(i<m1&&s1.charAt(i)==s2.charAt(i+shift)) i++ ;
		return i==m1 ;
	}
}

package restart.array;

public class kMP {
	private static int[] getNext(char[] nums){
		int len =nums.length ;
		int i =0 ;
		int k=0 ;
		int[] next =new int[len] ;
		next[0]=0 ;
		for(i=1; i<len;i++){
			while(k>0&&nums[i]!=nums[k]){
				k= next[k-1] ;
			}
			if(nums[i]==nums[k])k++ ;
			next[i] =k ;
		}
		return next;
	}
	public static int KMP(char[] a,char[] b){
		int i = 0 ;
		int j =0 ;
		int[] next = getNext(b) ;
		for( ;i<a.length;i++){
			while(j>0&&a[i]!=b[j]){
				j=next[j-1] ;
			}
			if(a[i]==b[j]){
				j++ ;
			}
			if(j==b.length) return i-j+1 ;
		}
		return -1 ;
	}
	public static void main(String[] args) {
		String str="bbcabababaabb" ;
		String str2="abb" ;
		
		char[] chars1 = str.toCharArray() ;
		char[] chars2 = str2.toCharArray() ;
		int res = KMP(chars1, chars2) ;
		System.out.println(res);
	}
}

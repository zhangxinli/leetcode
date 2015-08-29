package restart.array;

import java.util.HashMap;
import java.util.Map;

public class LongestStr {
	public static void main(String[] args) {
		solution("aab") ;
	}
	public static int solution(String s) {

        Map<Character,Integer> map = new HashMap<Character,Integer>() ;
        int rightPoint =0 ;
        int leftPoint =rightPoint -1 ;
        int res = 0 ;
        while(rightPoint<s.length()){
           Integer pre = map.put(s.charAt(rightPoint),rightPoint) ;
           if(pre!=null){
               leftPoint = Math.max(leftPoint,pre) ;
           }
           res = Math.max(res,rightPoint-leftPoint) ;
           rightPoint++ ;
        }
        return res ;
	}
}

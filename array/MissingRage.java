package restart.array;

import java.util.ArrayList;
import java.util.List;

public class MissingRage {
	public static void main(String[] args) {
		solution(new int[]{1,2,3,4,5,7,80,90,99}) ;
	}
	public static List<String> solution(int[] nums){
		List<String> res = new ArrayList<String>() ;
		if(nums==null||nums.length==0) return res ;
		for(int i=0 ;i<nums.length-1;i++){
			if(nums[i+1]-nums[i]==1){
				continue ;
			}else if(nums[i+1]-nums[i]==2){
				res.add((nums[i]+1)+"") ;
			}else{
				res.add((nums[i]+1)+"->"+(nums[i+1]-1)) ;
			}
		}
		return res ;
	}
}

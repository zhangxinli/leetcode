package restart.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] solution(int[] nums,int target){
		if(nums==null||nums.length==0||nums.length==1) return null ;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>() ;
		int[] res =new int[2] ;
		for(int i=0 ;i<nums.length;i++){
			if(!map.containsKey(target-nums[i])){
				map.put(nums[i], i+1) ;
			}else{
				res[0] =map.get(target-nums[i]) ;
				res[1] =i+1 ;
				break ;
			}
		}
		return res;
	}
}

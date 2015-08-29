package restart.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum3 {
	private Map<Integer,Integer> map =new HashMap<Integer,Integer>() ;
	
	public void add(Integer value){
		if(map.containsKey(value)){
			map.put(value, map.get(value)+1) ;
		}else{
			map.put(value, 1) ;
		}
	}
	public boolean find(Integer value){
		if(map.size()<2){
			return false ;
		}else{
			for(Map.Entry<Integer, Integer> entry:map.entrySet()){
				if(map.containsKey(value-entry.getKey())){
					return true;
				}
			}
		}
		return false ;
	}
}

package restart.array;

import java.util.HashMap;
import java.util.Map;

public class LongestString2 {
	public int solution(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		if (str == null || str.length() == 0)
			return max;
		int start = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else if (map.size() < 2) {
				map.put(c, 1);
			} else {
				while (map.size() == 2 && start < i) {
					char temp = str.charAt(start);
					int x = map.get(temp);
					--x;
					if (x == 0)
						map.remove(str.charAt(start));
					else
						map.put(temp, x);
					++start;
				}
				map.put(c, 1);
			}
			max = Math.max(max, i - start + 1);
		}
		return max;
	}
}

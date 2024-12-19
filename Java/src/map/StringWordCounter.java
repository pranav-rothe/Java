package map;

import java.util.HashMap;
import java.util.Set;

public class StringWordCounter {

	public static void main(String[] args) {

		String str="australia is australia and australia is";
		
		String[] s=str.split(" ");
		
		HashMap<String, Integer> hm=new HashMap<>();
		for(int i=0;i<=s.length-1;i++) {
			String s1=s[i];
			if(hm.containsKey(s1)) {
				hm.put(s1, hm.get(s1)+1);
			}
			else {
				hm.put(s1, 1);
			}
		}
		System.out.println(hm);
//		Set<Character> allKeys=hm.keySet();
//		for(Character key: allKeys) {
//			if(hm.get(key)>1) {
//				System.out.println(key+":"+hm.get(key));
//			}
//			
//		}
	}

}

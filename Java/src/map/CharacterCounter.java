package map;

import java.util.HashMap;
import java.util.Set;

public class CharacterCounter {

	public static void main(String[] args) {

		String str="australia";
		
		HashMap<Character, Integer> hm=new HashMap<>();
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
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

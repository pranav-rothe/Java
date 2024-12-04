package string;

public class CharacterCount {

	public static void main(String[] args) {
		
		String name="   absdbasdnas3231546447821321@#!&*!@@*&#";
		
		int count[]=new int[256];
		
		for(int i=0;i<=name.length()-1;i++) {
			char ch=name.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<256;i++) {
			if(count[i]>0) {
				System.out.println((char)i+" : "+count[i]);
			}
		}

	}

}

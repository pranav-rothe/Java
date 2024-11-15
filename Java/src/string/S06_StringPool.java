package string;

public class S06_StringPool {

	public static void main(String[] args) {
		
		String s1=new String("Anuja"); //Heap & SCP---> S1 & S1,S2
		String s2=new String("Anuja"); //Heap & point towards the value 1st object as S2---Heap
		
		String s3="Anuja"; //Literal
		String s4="Anuja";
		String s5="Pranav"; //SCP new
		String s6=new String("Pranav");
		
		System.out.println(s5==s6);
		//s5==s6; false, false false
//		System.out.println(s1==s2); //false
////		
////		System.out.println(s1.equals(s2)); //true
//		
//		System.out.println(s1==s3); //false
//		
//		System.out.println(s3==s4); //true
//		
//		System.out.println(s4==s5); //false
		
		

	}

}

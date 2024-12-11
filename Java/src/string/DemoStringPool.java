package string;

public class DemoStringPool {

	public static void main(String[] args) {
		
		String s1=new String("Anuja");  //2
		String s2=new String("Ashlesha"); //2
		String s3=new String("Pranav"); //2
		String s9=new String("Pranav"); //heap &Scp
		
		String s4="Pranav"; //0 literals==literals true, object==literal false, object==object false
		String s5="Anuja"; //0
		String s6="Girl"; //1
		String s8="Pranav";  //s4==s8--> true
		
		System.out.println(s1.equals(s5)); //true
		System.out.println(s3.equals(s9)); //true
		System.out.println(s2.equals(s3));
		System.out.println("******************************");
		System.out.println(s1==s5);
		System.out.println(s4==s8);
		System.out.println(s3==s9);	
		System.out.println(s4==s5);		
		
		String s7=new String("Girl"); //create in heap--1 SCP point 
		
			//Aslesha-- 8, Anuja--8  Pranav--8
		
		String p="pune";
		p="foood";
		System.out.println(p);
		int a=10;
		a=20;
		System.out.println(a);
	}

}

package controlStatement;

public class OddEvenNumber1 {

	public static void main(String[] args) {
		
		System.out.println("--->>> Even number 1 to 100 <<<---");
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i+" Even");
			}	
		}
		System.out.println("--->>> Odd number 1 to 100 <<<---");
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(i+" Odd");
			}
		}
	}

}

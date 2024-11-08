package patternCode;

public class Pattern6 {

	public static void main(String[] args) {
		
		int num=5;
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {//for j=6<=5 false; increment i
				if(j>=i) { //for 1st row--> 1<=0 false;
							//for 2nd row--> 1<=2-1 true; 2>=4 false; 3>=4 false; 4>=4 true; 5>=4 true;
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

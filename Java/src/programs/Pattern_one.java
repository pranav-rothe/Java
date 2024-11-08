package programs;


public class Pattern_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=5;
		for(int line=1;line<=5;line++) {  //outer loop handles the row
			for(int ast=1;ast<=line;ast++) {  //inner loop handles the column
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}

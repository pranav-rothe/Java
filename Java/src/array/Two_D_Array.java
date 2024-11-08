package array;

public class Two_D_Array {

	public static void main(String[] args) {
		
		/* {{0,0, 0,1, 0,2},
		 	{1,0, 1,1, 1,2}*/
						//Index 0
		int a[][]= {{10,20,30},										
						//Index 1
					{40,50}};
		
	
		
		for(int i=0;i<a.length;i++) { 			//row
//			int x=a[i].length;      
//			System.out.println(x);			
			//a[i].length is represent a row length
			for(int j=0;j<a[i].length;j++) {	//column
				
			//j=0;0<0;1
			//j=1;1<0;2
				System.out.print("Using Simple For Loop: " +a[i][j]+ " ");
						
			}
			
		}
		System.out.println();
		for(int x[]:a) {
			for(int y:x)
			System.out.print("Using For each Loop: " +y+ " ");
		}
	}

}

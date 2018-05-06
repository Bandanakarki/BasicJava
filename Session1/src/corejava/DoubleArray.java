package corejava;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Flight[][]=new String[4][4];//the rows and columns should be having 
			
		//first row
	       Flight [0][0]="New Mexico";
		   Flight [0][1]="San Diego";
			Flight [0][2]="DC";
			Flight [0][3]="Newark";
		
			//second row
			
		
        Flight [1][0]="Dallas";
		Flight [1][1]="NYC";
		Flight [1][2]="Miami";
		Flight [1][3]="Chicago";
			
		
	        //Third Row
			
			Flight [2][0]="New Orleans";
			Flight [2][1]="Botan Rogue";
			Flight [2][2]="Kansas";
			Flight [2][3]="Toronto";
			
			//fourth row
			
			
			Flight [3][0]="Denver";
			Flight [3][1]="Honalulu";
			Flight [3][2]="Harrisburg";
			Flight [3][3]="Houston";
		
			System.out.println(Flight[3][1]);
			
			int rows =Flight.length;
			int cols=Flight[0].length;
			
			//argument for rows
			
			for (int rownum=0;rownum<rows;rownum++) {
				
				//argument for column
				
			for (int colnum=0;colnum<cols;colnum++) {
					System.out.println(Flight[rownum][colnum]);
				}
			}
			
			
	}
	

}

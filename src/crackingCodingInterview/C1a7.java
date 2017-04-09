package crackingCodingInterview;

public class C1a7 {
	public static void setzero_main(){
		int mat[][] = {{1,0,3,4},{5,6,7,8},{9,10,0,12}};
		setzero(mat);
	}
	public static void setzero(int[][] matrix){
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
			
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]=1;
					column[j]=1;
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if ((row[i] == 1 || column[j] == 1)) {
					matrix[i][j] = 0;
				}
			}
		}
		
		//Printing 
		for(int y=0;y<matrix.length;y++){
			for(int z=0;z<matrix[0].length;z++){
				System.out.print(matrix[y][z]+"\t");
			}
			System.out.println();
		}
	}
}

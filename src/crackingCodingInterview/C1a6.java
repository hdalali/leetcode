package crackingCodingInterview;

public class C1a6 {
	public static void matrot_main(){
		
		int p=4;
		int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		matrot(mat,p);
	}
	
	public static void matrot(int[][] matrix,int n){
		for(int layer=0;layer<(n/2);++layer){
			int first=layer;
			int last=n-1-layer;
			for(int i=first;i<last;++i){
				int offset=i-first;
				int top=matrix[first][i];
				matrix[first][i]=matrix[last-offset][first];
				matrix[last-offset][first]=matrix[last][last-offset];
				matrix[last][last-offset]=matrix[i][last];
				matrix[i][last]=top;
			}
		}
		for(int y=0;y<n;y++){
			for(int z=0;z<n;z++){
				System.out.print(matrix[y][z]+"\t");
			}
			System.out.println();
		}
	}
}

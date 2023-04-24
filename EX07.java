package DAY0424;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0;
		int [][] matrix = new int [2][4];
		for( i=0; i<2; i++)
		{
			for( j=0; j<4; j++)
			{
				k++;
				matrix[i][j]=k;
				
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------- 여까지 matrix");
		int s=8;
		int [] [] matrix2 =new int [2][4];
		for (i=0; i<2; i++)
		{
			
			for(j=0; j<4; j++)
			{
				matrix2[i][j]=s--;
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------- 여까지 matrix2");
		
		int [][] sum = new int[2][4];
		
		for(i=0; i<sum.length; i++)
		{
			for(j=0; j<sum[i].length; j++)
			{
				sum[i][j]= matrix[i][j]+matrix2[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------- 여까지 합");
		
		int [][] multiply = new int [2][4];
		
		for(i=0; i<multiply.length; i++)
			{
			for(j=0; j<multiply[i].length; j++)
			{
				multiply[i][j]= matrix[i][j] * matrix2[i][j];
				System.out.print(multiply[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------- 여까지 곱");
		
		
		
		
		
		
		
		
	}
//	static int[][] SUM(int [][] arr)
//		int i,j=0;
//		int k=1;
//		
//		int [][] sum = new int[2][4];
//		
//		for(i=0; i<arr.length; i++)
//		{
//			for(j=0; j<arr[i].length; j++)
//			{
//				sum[i][j]= matrix[i][j]+matrix2[i][j];
//			}
//		}
//	
//	}
}

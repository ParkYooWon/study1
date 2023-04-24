package DAY0424;

public class EX08 {

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
		System.out.println("--------여까지 matrix------------------- ");
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
		System.out.println("--------여까지 matrix2------------------ ");
		
		int [][] summatrix = sum(matrix,matrix2 ); 
		
		int [][] multiplymatrix = multiply(matrix, matrix2); //5) 함수호출을 해줘야 끝
		
		
		
		
		
	} //main

	static int[][] sum (int [][] arr1, int [][] arr2)
	{
		int [][] sum = new int [2][4];
		System.out.println("---메소드(함수)창을 만들어서 구한 합---");
	
		for (int i=0; i<sum.length; i++)
		{
			for( int j=0; j<sum[i].length; j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		return sum;
		
	}	//메소드 합
		
	
	
	
	static int [][] multiply (int [][] arr1, int [][] arr2)
	{
		int [][] multiply = new int [2][4];
		System.out.println("---메소드(함수)창을 만들어서 구한 곱---");
		
		for( int i=0; i<multiply.length; i++)
		{
			for( int j=0; j<multiply[i].length; j++)
			{
				multiply[i][j]= arr1[i][j] * arr2[i][j];	// 1)[0][0]부터 [2][4]까지 값 할당
				System.out.print(multiply[i][j]+"\t");		// 2)출력
			}
			System.out.println();							//출력
		}
		return multiply;			// 3) 받고자하는 값이 int [][] 인티저 배열의 배열이기에-
									// 4) static int [][] 함수명(매개변수~)이다.
	}//메소드(함수) 곱
	
	
}// class

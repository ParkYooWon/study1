package HW06_02;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[3];
		int [] cn= changeArr(array);
		print(cn);
		
		//print(array);
	
}
	static int[] changeArr(int [] matrix)
	{
		int [] plus=new int [matrix.length] ;
		
		for(int i=0; i<matrix.length; i++)
		{
			plus[i]=matrix[i]+1;
		}
		return plus;
	}//
	
	static void print(int [] matrix) {
		for(int i=0; i<matrix.length; i++) {
			System.out.println(matrix[i]);
		}
	}
}

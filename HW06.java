package Day04272;

public class HW06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. 메소드의 다양한 형태 -배열파라미터
		int[] arr1 = {1,2,3,4,5};
		int max = 0;
		int sum =0;
		float avg=0.0f;
		
		max = makeMax(arr1);
		System.out.println(max);
		
		sum = makeSum(arr1);
		System.out.println(sum);
		
		avg = makeAvg(arr1);
		System.out.println(avg);
		
		
		
		
	}
	
	static int makeMax (int[] matrix) {
		int max= matrix[0];
		for(int i=0; i<matrix.length; i++)
		{
			
			
			if(matrix[i]>max) 
				max = matrix[i];
			
		
		}return max;
		
	}
	
	static int makeSum (int[] matrix) {
		int sum=0;
		for(int i=0; i<matrix.length; i++)
		{
			sum=sum+matrix[i];
			
		}
		return sum;
	}
	
	static float makeAvg (int[] matrix) {
		float avg=0;
		int sum= makeSum(matrix);
		
		avg=sum/(matrix.length);
		return avg;
		
	}
}//class






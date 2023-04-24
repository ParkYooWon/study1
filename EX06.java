package DAY0424;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//예제 1. SUM()함수를 완성하시오.
		
			int x, y;
			int[] a1= {1,2,3};
			int[] a2= {4,5,6};
			
			x= sum(a1); 	//sum()함수를 선언을 해주고, 선언을 하면서 sum변수의 값을 리턴 받아-
			y= sum(a2);	    // 변수x에 넣어줬기에, 출력 가
			
			System.out.println(x);
			System.out.println(y);
			
			
	}

	static int sum(int [] arr)	//매개변수는 int [] 타입의 arr라는 가상 배열 매개변수
	{
		int i=0;
		int sum=0;
		for(i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
		}
		return sum;				//내가 sum함수로부터 받고자 하는 값이 sum이라는 정수 값이니, static int
	
	}
}

	



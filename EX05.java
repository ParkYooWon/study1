package DAY0424;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] score =new int[5];
		score[0]=100;
		score[1]=90;
		score[2]=100;
		score[3]=90;
		score[4]=100;
		
		//총점과 평균을 구해봅시다.
		int sum= sum(score);
		System.out.println(sum);
		
		double aver = aver(score);
		
		
		
	}							// 우리는 score배열의 데이터.들.을 사용하고싶다. 
								//	그러니 가상의 int[] arr 인티저 배열 타입의 매개변수를 만들어준것이다.
	
	static int sum(int[] arr )	// 내가 sum함수로 쓰면서, 받.고.싶.은. 값(리턴값)이 무슨 타입인지 생!각!
	{							// sum이라는 합이 결국은 int값이니, static int로 함수 창을 만든다.
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
		}
		return sum;				// 내가 원하는 sum변수를 리턴해준다. sum변수에 담긴 값이 sum()함수 의 결과값이다.
	}
	
	static double aver(int[] arr)	// 얻고싶은 값은 평균이다. 평균은 실수다. 그러니 static double
	{								// 매개변수로 받고자하는 것도, 아까와같이, int[] 타입의 가상 arr 매개변수이다.
		int sum = sum(arr);			// 함수 안에서도 함수 호출 가능하니 호출해주고, 왜냐면 평균 구하는데 sum이 필요하니까
		double aver=(double)sum/arr.length; // sum이 인티저타입이기에, double로 캐스팅해줘야 한다. 내가 필요로하는 aver도 당연히 double
		System.out.println(aver);
		return aver;				// 최종적으로, 내가 원하던 평균 에버리지를 리턴해줘야 
									// main창에서 aver()함수에서 받아온 평균 '값'을 사용할 수 있다.
	}

}//DON'T TOUCH

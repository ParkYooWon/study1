package DAY0424;

import javax.annotation.processing.SupportedSourceVersion;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//< 리턴값을 2개 이상 가지고 오고 싶을 떄는, 리턴값들을 배열을 이용해서 가져와준다.>
		
		int x=10;
		int y= 5;
		System.out.println("그냥 출력");
		System.out.println(x);
		System.out.println(y);
		
		
		int[] a =addOne(x,y);	//addOne함수 호출	
		
		
		System.out.println("----addOne함수에서 리턴값 받고나서 함수닫힌 뒤 ---");
		System.out.println(a[0]);	//위의 addOne함수를 호출해서, 리턴값을 받았기에ㅡ a[]를 사용할 수 있다. 
		System.out.println(a[1]);
		
		
	}
	static int[] addOne(int x, int y)
	{
		System.out.println("----addOne----");
		x++;
		y++;
		System.out.println(x);
		System.out.println(y);
		int[] arr= new int[2];		// x와y를 리턴하고 싶다. 2개니까, 다르게 해줘야하는데ㅐ,
									// 이때ㅡ arr이라는 인덱스 2개크기의 배열을 만들어준다.
									// x와y를 각각 넣어준다.
		arr[0] =x;
		arr[1] = y;
		return arr;			// return x, y; 이딴거 안됨. // 리턴하는 값이 배열이니, static int[]이다
	}

//	리턴값을 2개 이상 가지고 싶을 때, 배열을 이용한다.
//	static int[] {
//		~~
//	~~
//	~~
//		int [] arr= new int[2];
//		arr[0]=x;
//		arr[1]=y;
//		return arr;		//리턴하는 것이배열이니, static int[]이다..
//
//	}

}

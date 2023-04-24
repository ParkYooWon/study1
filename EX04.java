package DAY0424;

public class EX04 {

	public static void main(String[] args) {	//main 시작
		// TODO Auto-generated method stub

	int c= add(10,5);// 첫번째 함수
	System.out.println(c); 
	
	print();//두번째 함수
	
	int x = retInt();//세번쨰 함수
	
	noRet(10);//4번째 함수
	
	
	} // main 끝

	static int add(int a, int b) 
	
	{
		
			int c;
			c= a+b;
			return c;
		
	}//============================================================
	
	static void print()
	{
		System.out.println("before return");
		return;
		//System.out.println("after return");
		
	}//=============================================================
	
	static int retInt()
	{
		int x =10;
		System.out.println(x);
		return x;
	}//===============================================================
	
	static void noRet(int x)
	{
		System.out.println("x="+ x);
	}
	
	
	
//	<함수 타입은 무엇에 의해 결정되나>
//	-> 리턴 값의 타입
//
//	retunt값이 없으면 void
//	returnr값이 배열이면 int[]
//	return값이 정수이면, static int
//	자바에서 한 클래스에 MAIN함수는 오로지 한 개
//	함수창은 여러 개 많이 만들어도 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} //DON'T TOUCH

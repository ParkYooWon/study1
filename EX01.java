package DAY0424;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		int x= 10, y=20, z=0;
		z= add(x, y);				//위에서 add함수 호출
		System.out.println(z);
		
		
		
	}//MAIN

	static int add( int a, int b)		// add함수가 호출되고나서 리턴하고 나서는 이 add함수가 닫힌다.
	{
		int c =0;
		c =a+b;
		return c;
		
	}
}

package DAY0424;

public class EX021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		//int c=0;
		System.out.println("호출전----");
		System.out.println(a);
		
		addOne(a);
		
		System.out.println("호출 후---");
		
		int c= addTwo(a);			//3) 리턴을 해주는 addTwo함수를 호출해주고서
		System.out.println(c);		// 4) 리턴한 c값이 이젠 main에도 변수 c로서 존재하니, 그냥 호출~!
		
	}
	
	static void addOne(int x)
	{
		x++;
		System.out.println("addOne함수");
		System.out.println(x);
	}

	static int addTwo(int x)
	{
		int c= ++x;
		System.out.println("addTwo함수---");	//1)static int로 addTwo함수를 하나 더 만들어준다.
	
		return c;				//2)c값을 리턴해주기때문에
		
	}
}

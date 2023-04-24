package DAY0424;

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10, b= 5;
		System.out.println("호출전---");
		System.out.println(a);
		System.out.println(b);
		
		addOne(a,b);			// 1)호출이 끝나고선 addOne함수가 닫힌다. 더 이상 사용하지 않는다.
								// 2) 그러니 addOne함수 호출해서 출력된,
		
		System.out.println("호출 후 ___");
		System.out.println(a);				//5) addOne함수는 이미 닫혔다, 그 함수에서 출력할 거 다 출력했기에
											//6) 그러니 이 main()에 있는 곳에서만 적용이 되므로, a=10, b=5가 된다.
		
		System.out.println(b);
	}
	
	static void addOne(int x, int y)
	{
		x++;
		y++;
		System.out.println("addOne함수 "); //3) 아래의 출력문들을 다 끝내고나면, 닫힌다. ㄷ접근 불가, 더 이상 사용x
										  // 4) 위로 다시 올라가서
		System.out.println(x);
		System.out.println(y);
	}
}

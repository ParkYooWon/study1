package DAY0412;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		while (a<10)
		{
			a++;
			if (a>7)
			{
				continue;
			}
			System.out.println(a);
			// continue문을 사용하면, 스크립트 아래로 더 이상 내려가지 않고, 바로 반복문의 조건식으로 돌아간다.
			
		}
	}

}

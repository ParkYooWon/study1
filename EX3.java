package DAY0412;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		
		while (i<=100) {
			if(i%2 == 0) {
				sum=sum-i;
				System.out.println(i);
				System.out.println(sum);
			}else {
				
				sum=sum+i;
				System.out.println(i);
				System.out.println(sum);
			}
			i++;
		}
		
		System.out.println("최종값은"+sum);
		//누적변수 sum을 설정해두고, i를 계속 반복해서 넣어주는데, 짝수일땐 음수로 sum에 넣고, 홀수일 땐 양수로 넣는다.
	}

}

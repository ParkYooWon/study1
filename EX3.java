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
		
	}

}

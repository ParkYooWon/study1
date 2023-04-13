package STUDY0413;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// x의 값이 짝수인지 홀수인지 판단하는 프로그램을 작성하시오 
		
		
		System.out.println("숫자를 입력하시면 홀수짝수를 판별하겠습니다.");
		Scanner sc = new Scanner(System.in);
		int what = sc.nextInt();
		
		if (what == 0 ) {
			System.out.println(what+"은 정수입니다.");
		}
		else if(what%2 != 0) 
		{
			System.out.println("홀수입니다.");
		}
		else
		{
			System.out.println("짝수입니다.");
		}
		
		
		
	}

}

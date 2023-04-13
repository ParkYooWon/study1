package STUDY0413;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*정수를 입력받아, 절대값을 표시해주는 프로그램을 작성하라 (삼항연산자 사용해서)*/
		
	System.out.println("절대값으로 변경할 정수를 입력하여 주시오.");
	Scanner sc = new Scanner(System.in);
	int what = sc.nextInt();
	
	System.out.println("당신이 입력한 숫자가" +what+ "맞습니까? ");
	int sqrtwhat = (what < 0 ) ?  what*(-1) : what ;
	System.out.println(sqrtwhat);
	
	
		
		
		
		
		
		
		
		
		
		
		
	}/* ㄴ*/

}

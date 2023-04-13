package STUDY0413;

import java.util.Scanner;

public class HW05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("각 시험 성적들의 합계와 평균을 구하려고합니다.");
		System.out.println("파이썬의 점수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int py = sc.nextInt();
		System.out.println("자바의 점수를 입력하시오.");
		int java = sc.nextInt();
		System.out.println("안드로이드의 점수를 입력하시오.");
		int android = sc.nextInt();
		System.out.println("c언어의 점수를 입력하시오.");
		int C= sc.nextInt();
		System.out.println("c++의 점수를 입력하시오.");
		int Cplus =sc.nextInt();
		
		int sum= py+java+android+C+Cplus;
		int EX= sum/5; 
		System.out.println("총합계 점수는 "+sum+"점 입니다.");
		System.out.println("평균 점수는 "+ EX+"점 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//

}

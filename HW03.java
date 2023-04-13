package STUDY0413;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  점수를 USER에게 입력 받아 학점 매기기 
		
		System.out.println("당신의 점수를 입력하여주십쇼.");
		Scanner sc = new Scanner(System.in);
		int grade= sc.nextInt();
		if (grade>=98) {
			System.out.println("당신의 학점은 A+ 입니다");
		}else if(grade>=94) {
			System.out.println("당신의 학점은 A 입니다");
		}else if(grade>=88) {
			System.out.println("당신의 학점은 B 입니다");
		}else if(grade>=80) {
			System.out.println("당신의 학점은 c 입니다");
		}else if (grade >=70) {
			System.out.println("당신의 학점은 D 입니다");
		}else
		{
			System.out.println("F 재수강 하시기바랍니다.");
		}
	
	
	
	
	
	
	
	
	
	
	
	} //
}

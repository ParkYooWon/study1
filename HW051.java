package STUDY0413;

import java.util.Scanner;

public class HW051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("각 시험 성적들의 합계와 평균을 구하려고합니다.");
		System.out.println(" 점수를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int[] jumsu = new int[5]; 
		System.out.println("파이썬의 점수를 입력하시오.");
		jumsu [0]= sc.nextInt();
		System.out.println("자바의 점수를 입력하시오.");
		jumsu [1]= sc.nextInt();
		System.out.println("안드로이드의 점수를 입력하시오.");
		jumsu [2]=sc.nextInt();
		System.out.println("c언어의 점수를 입력하시오.");
		jumsu [3]=sc.nextInt();
		System.out.println("c++언어의 점수를 입력하시오.");
		jumsu [4]= sc.nextInt();
		
		int sum=0; //총합
		int EX=0;	//평균
		for (int i=0; i<jumsu.length; i++)
		{
			sum= sum+jumsu[i];
			System.out.println(i+1+"번 시험은"+jumsu[i]+"점");
		}
		EX= sum/jumsu.length;
		System.out.println("시험 총합은 "+sum+"점");
		System.out.println("시험 평균점수는 "+EX+"점");
		
		
		
	}

}

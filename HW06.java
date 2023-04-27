package STUDY0413;

import java.util.Scanner;

public class HW06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pdf4장 복습문제 1.
//		System.out.println("점수를 입력하시오.");
//		Scanner sc = new Scanner(System.in);
//		int jumsu= sc.nextInt();
//		if(jumsu >60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
		
		
		
		
		
		
		//복습문제 3.
		
		//1~10 사이의 홀수를 출력하는 프로그램
//		for (int i=1; i<=10; i++)
//		{
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}
		
		//복습문제 4.
		//while문을 이용해 무한 루프를 구현하라
		
//		while (true) {
//			System.out.println("무한루프");
//		}
		
		
		
		//복습문제 5.
		//while문을 이용해 1~10까지 입력 받는 수를 세다가 사용자가 0의 숫자를 입력하면 
		// 입력받은 수가 몇 번이었는지를 보여주고, 루프를 종료하는 프로그램을 작성하시오.
		
//		System.out.println("1~10사이의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
//		int what=0;
//		int count = 1;
//		Scanner sc= new Scanner(System.in);
//		
//		while (true) {
//			what = sc.nextInt();
//				 
//			if( what == 0) {
//				
//				System.out.println("0을 입력하여서 루프를 종료하였습니다.");
//				
//				break;
//			}
//				
//			count = count+1;
//			
//		}
//		System.out.println("지금까지 입력받은 수는 총 "+count+"번입니다.");
//		
		
		//복습문제 6.
		//while문을 사용해서 1에서 100까지 합을 구하는 프로그램을 만드시오.
		
//		int i=0;
//		int sum=0;
//		
//		while (i<100) {
//			i++;
//			sum= sum+i;
//			System.out.print(i+"\t");
//		}
//		System.out.println();
//		System.out.println(sum);
		
		
		
		//복습문제 7.
		//1^2+ 2^2+ 3^2 + ...100^2를 구하는 프로그램을 만드시오.
//		int i=0;
//		int j=0;
//		int sum=0;
//		
//		while (i<100) {
//			i++;
//			j=i*i;
//			sum=sum+j;
//			
//			
//			System.out.println(i+"^2"+"="+j);
//		}
//		System.out.println("최종sum =>"+sum);
		
		
		
		//복습문제 8.
		// 1에서 100까지 합을 구하는 과정에서 합이 100을 넘을 때의
		// 최소의 정수값과 그때까지의 합을 구하는 프로그램을 만드시오
		
//		int i=0;
//		int sum=0;
//		
//		while(i<100) {
//			i++;
//			
//			sum=sum+i;
//			if(sum >= 100) {
//				System.out.println(i);
//				System.out.println(sum);
//				break;
//			}System.out.println(i);
//			 System.out.println("합은"+sum);
//			
//		}
		
		//복습문제 9.
		// 1+(1+2)+(1+2+3)+...(1+2+...+100)을 구하는 프로그램을 만드시오
//		int i=0;
//		int sum=0;
//		int result=0;
//		while (i<100) {
//			i++;
//			sum=sum+i;
//			result= result+sum;
//			System.out.println(i);
//			System.out.println("+("+sum+")");
//			System.out.println("합은"+result);
//		}
		
		//복습문제 10.
		//구구단을 출력하는데, 1행에는 1단, 2행에는 2단이 나오게해라 \t를 이용하여 탭만큼 띄운다.
		
//		int i=0;
//		int j=0;
//		
//		while( i<9) {
//			i++;
//			while(j<9) {
//				j++;
//				int	result= i * j;
//			
//				System.out.print(result+"\t");
//			}
//			System.out.println();
//			j=0; //초기화 중요
			//for문과 다르게 while문은 증가식도 실행문에 넣어줘야하고,
			// 안쪽 while문이 모든 루프를 끝내어, 바깥while문이
			// 돌아갈때 안쪽while문의 증가식의 것을 초기화해줘야한다.!
		
//		4	8	12	16	20	24	28	32	36	
//		5	10	15	20	25	30	35	40	45	
//		6	12	18	24	30	36	42	48	54	
//		7	14	21	28	35	42	49	56	63	
//		8	16	24	32	40	48	56	64	72	
//		9	18	27	36	45	54	63	72	81	
//요로케 나옴
		
		
		//복습문제 11.0
//		*
//		**
//		***
//		****
//		***** 
//		// 위 모양이 나오도록 해라 while문을 이용해서,
//		//for문으로는 지겹게 만들어봤으니.
//	
	
//		int i=0 ;
//		int j=0 ;
//		
//		while (i<5) {
//			 i++;
//			while (j<i) {
//				j++;
//				System.out.print("*");
//			}
//			j=0;
//			System.out.println();
//		}
//		*
//		**
//		***
//		****
//		*****
//	출력결과			
		
		
		//복습문제 11.1
//		int i=0, j=0;
//		while (i<4)
//		{
//			i++;
//			while(j<3)
//			{
//				j++;
//				System.out.print(j+"\t");
//			}
//			System.out.println();
//			j=0;
//		}
		
//		1	2	3	
//		1	2	3	
//		1	2	3	
//		1	2	3
		//출력값
		
//		int i=0, j=0;
//		int k=0;
//		while (i<4)
//		{
//			i++;
//			while(j<3)
//			{
//				j++;
//				k++;
//				System.out.print(k+"\t");
//			}
//			System.out.println();
//			j=0;
//		}
//		
//		1	2	3	
//		4	5	6	
//		7	8	9	
//		10	11	12	

		
		
//		int i=0, j=0;
//		int k=0;
//		while (i<3)
//		{
//			i++;
//			while(j<4)
//			{
//				j++;
//				k++;
//				System.out.print(k+"\t");
//			}
//			System.out.println();
//			j=0;
//		}
		
//		1	2	3	4	
//		5	6	7	8	
//		9	10	11	12	
//		
		
		
		//복습문제 11.2
		// 1에서 100까지의 정수 중에서 3의 배수를 출력하라
		
//		int i=0;
//		int j=0;
//		int k=0;
//		
//		while(i<10) 
//		{
//			i++;
//			while(j<10)
//			{
//				j++;
//				k++;
//				if(k%3==0) {
//					System.out.print(k+"\t");
//				}
//				
//			}j=0;
//			System.out.println();
//					
//		}
		//출력값
//		3	6	9	
//		12	15	18	
//		21	24	27	30	
//		33	36	39	
//		42	45	48	
//		51	54	57	60	
//		63	66	69	
//		72	75	78	
//		81	84	87	90	
//		93	96	99	

		
		
		//복습문제 12.
		// 두 개 정수를 읽어 들여 둘 중 큰 값을 출력하는 프로그램을 작성하시오
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하시오");
//		int first = sc.nextInt();
//		System.out.println("두번째 정수를 입력하시오");
//		int second = sc.nextInt();
//		if(first>second) {
//			System.out.println(first);
//			
//		}else if(first<second){
//			System.out.println(second);
//		}
//		System.out.println("가 더 큰 정수값입니다.");
		
		//복습문제 13.
		// 두 개 정수를 읽어 들여 같은 수이면 "same"을, 다른 수이면 different를 출력하는 프로그램을
		//작성하시오(단 같은 값이 입력되면 프로그램은 멈추게 하시오)
//		while (true) {
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("첫번째 정수 입력");
//			int first = sc.nextInt();
//			
//			System.out.println("두번째 정수 입력");
//			int second = sc.nextInt();
//			
//			if (first == second)
//			{
//				System.out.println("Same");
//				break;
//				
//			}
//			else {
//				System.out.println("Diffent");
//			}
//			
//			
//		}
		
		//복습문제 14. 입력된 온도가 25도 이상이면, 얼음물 출력
		// 그렇지 않으면 뜨거운물을 출력하는 프로그램 작성
		
//		Scanner sc= new Scanner(System.in);
//		int temp = sc.nextInt();
//		if(temp >= 25) {
//			System.out.println("얼음물");
//		}else {
//			System.out.println("뜨거운물");
//		}
		
		//복습문제 16 
		// 키와 몸무게를 입력 받아 bmi 계산식에 맞게 계산하여 값을 알려주고
		// bmi값에 따른 비만도를 출력하는 프로그램을 작성하라

//		Scanner sc = new Scanner(System.in);
//		System.out.println("키를 입력하라");
//		int height =sc.nextInt();
//		System.out.println("몸무게를 입력하라");
//		int weight = sc.nextInt();
//		float bmi = weight/(float)((height*0.01)*(height*0.01));
//		
//		if(bmi < 18.5) {
//			System.out.println("마름");
//		}else if(bmi <25) {
//			System.out.println("보통");
//		}else if(bmi < 30) {
//			System.out.println("가벼운 비만");
//		}else if(bmi>30) {
//			System.out.println("심한 비만");
//		}
//		System.out.println(bmi);
		
		//심화문제 1.
		//1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
//		int i=1;
//		int sum=0;
//		for(i=1; i<=20; i++) {
//			if(i%2 !=0 && i%3 !=0) {
//				 sum=sum+i;
//				 System.out.println(i);
//			}
//		}
//		System.out.println("총합은"+sum);
		
		
		//심화문제 2.
//		int i=1;
//		int k=0;
//		int sum=0;
//		
//		for(i=1; ; i++) {
//			
//			k++;
//			if(i%2==0) {
//				sum=sum+k*(-1);
//				System.out.println(i);
//				System.out.println(sum);
//			}else {
//				sum=sum+k;
//				System.out.println(i);
//				System.out.println(sum);
//			}
//			if(sum >=100) {
//				
//				System.out.println("총합이 100이상일때 + "+k);
//				break;
//			}
//			
//		}
//		
		//심화문제 3.
		//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는걸 작성하시오.
//		int k=0;
//		int i=0;
//		int j=0;
//		int s=0;
//		// 1번 주사위 값할당
//		int [] arr1 = new int [6];
//		for (i=0; i<arr1.length; i++) {
//			k++;
//			arr1[i]=k;
//			System.out.println(arr1[i]);
//			
//		}
//		//2번 주사위 값할당
//		int [] arr2 =new int [6];
//		for ( j=0; j<arr2.length; j++) {
//			s++;
//			arr2[j]=s;
//			System.out.println(arr2[j]);
//			
//		}
//		//경우의 수 출력
//		for( i=0; i<6; i++) {
//			for( j=0; j<6; j++)
//			{
//				if(arr1[i]+arr2[j]==6) {
//					System.out.println("주사위"+arr1[i]+"과 주사위 "+arr2[j]+"의"+ 
//				" 합은 "+(arr1[i]+arr2[j])+"입니다.");
//				}
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class

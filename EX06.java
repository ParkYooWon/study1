package HW06_02;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1학년 1반 친구들 10명의 몸무게를 입력 받은 후, 몸무게 중
		//가장 큰 값을 출력하라
		
		System.out.println("1반의 몸무게를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		
		int [] weight = new int [10];
		
		for(int i=0; i<10; i++) {		//할당
			weight[i]= sc.nextInt();	//입력
		}
		
		
		int weight_max=weightMax(weight);
		printMax(weight_max);
		
			
		
	}

	static void printMax(int x) {
		System.out.println(x);
	}
	
	static int weightMax(int [] matrix) {
		int max=0;
		for(int i=0; i<matrix.length; i++)
		{
			if(matrix[i]>max) {
				max=matrix[i];
			}
			
		}return max;
		
	}
	

}

package STUDY0413;


public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int a=10, b= 20;
	boolean flag= false;
	if(a>10) {
		System.out.println("a는 10보다 크다");
	}
	else
	{
		System.out.println("a는 10보다 크지 않다.");	
	}
	
	if (a== 10 && b>=20) {	// a는 10이.고. 동시에 b는 20보다 크거나 같다를 만족하냐 // 좌측 t, 우측 t -> 둘 다 트루이니 참 
		System.out.println("조건을 만족함");
	}
	else
	{
		System.out.println("조건을 만족하지 못함");
	}
	
	
	if (flag) {
		System.out.println("참");
	}
	else
	{
		System.out.println("거짓");		// flag의 값이 false이기 때문이다. 
										// 자바스크립트에서는, 값이 0이 아닌 숫자가 존재하거나, 공백이거나, 어떤 무언가 그리고 어떤 연산의 결과 값이 true인 경우, 다 트루로 통과가 된다. 
										
	}
	
	
	
	
	
	
	} //

}

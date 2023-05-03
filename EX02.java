package HW06_02;

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = compute(4);
		System.out.println(result);	//24
		
	}
	//x=4; 4*compute(3)//6=compute(3)=3*compute(2)// 2=compute(2)=2*compute(1)//compute(1)=1
	static int compute(int x)
	{
		int ret = 0;
		
		if (x == 1)
		{
			ret = 1;
		}else {
			
			ret = x* ( compute(x-1));
		}
		
		return ret;
	}
}

package HW06_02;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruit = {"banana", "oreane", "peach", "strawberry" , "cherry"};
		
		String storeName= new String("싱싱과일과게");
	
		String llong =maxLengthFruit( fruit);
		System.out.println(storeName +"에서 가장 긴 이름을 가진 과일은"+llong);
		
	}
	
	
	
	
	
	static String maxLengthFruit(String[] s)
	{
		
		String result=null; //과일이름 저장변수
		int max=0; //철자의 길이 저장변수
		for(int i=0; i<s.length; i++) {
			
			if(s[i].length()>max )// 철자의 길이를 돌려주는 함수 호출
			{
				max = s[i].length();
				result=s[i];
			}
		}
		return result;
	}
	
	

}

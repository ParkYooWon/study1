package HW06_02;

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] student = {"박진수", "장원우", "강한솔",
				"최진욱"};
		
		print(student);
		printJJang(student);
		
		}
	
		
		
	static void print(String [] matrix) {
		for(int i=0; i<matrix.length; i++) {
			System.out.println(matrix[i]);
		}
		
	}
	
	static void printJJang(String [] matrix) {
		for(int i=0; i<matrix.length; i++) {
			if(matrix[i] == "강한솔") {
				System.out.println(matrix[i]+" 짱");
			}else {
				System.out.println(matrix[i]+"조장");
			}
			
		}
	}














}






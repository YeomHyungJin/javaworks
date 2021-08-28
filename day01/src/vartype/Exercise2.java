package vartype;

public class Exercise2 {

	public static void main(String[] args) {
		int num1 = 10;
		float num2 = 2.0f;
		
		int result1 = (int)(num1 + num2);
		int result2 = (int)(num1 - num2);
		int result3 = (int)(num1 * num2);
		int result4 = (int)(num1 / num2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
//		System.out.println(num1 + (int)num2);
	}
}

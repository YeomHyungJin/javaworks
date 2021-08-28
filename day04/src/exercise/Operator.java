package exercise;

public class Operator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
//		String operator = "+";
		char operator = '/';
	
		int result = 0;
		
//		if(operator.equals("+")) {}  // String operator = "+";일때
		if(operator == '+')			 // char operator = '+';일때
		{
			result = num1 + num2;
		}
		else if(operator == '-')
		{
			result = num1 - num2;
		}
		else if(operator == '*')
		{
			result = num1 * num2;
		}
		else if(operator == '/')
		{
			result = num1 / num2;
		}
		
		System.out.println("결과는: "+ result);
		
	}

}

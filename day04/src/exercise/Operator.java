package exercise;

public class Operator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
//		String operator = "+";
		char operator = '/';
	
		int result = 0;
		
//		if(operator.equals("+")) {}  // String operator = "+";�϶�
		if(operator == '+')			 // char operator = '+';�϶�
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
		
		System.out.println("�����: "+ result);
		
	}

}

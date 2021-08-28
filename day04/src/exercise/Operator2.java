package exercise;

import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		//char operator = '/';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자를 입력하세요 : ");
		String operator = sc.nextLine();
		int result = 0;
		
		switch(operator) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				result = num1 / num2;
				break;
		}
		System.out.println("결과는: "+ result);
	}
}

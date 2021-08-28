package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 반복문
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.print("계속 반복할까요?(y/n) : ");
			String inputValue = sc.nextLine();
			
			if(inputValue.equals("y") || inputValue.equals("Y")) // "==" 숫자 비교시 적용
			{
				System.out.println("계속 반복");
			}
			else if(inputValue.equals("n") || inputValue.equals("N"))
			{
				System.out.println("반복 중단");
				break;
			}
			else
			{
				System.out.println("지원하지 않는 기능");
			}
		}
		sc.close();
	}
}

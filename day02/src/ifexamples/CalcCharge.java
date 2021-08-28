package ifexamples;

import java.util.Scanner;

public class CalcCharge {

	public static void main(String[] args) {
		// 놀이공원 입장료 계산하기 - 미취학아동, 초등, 중.고등, 일반인
		// 변수 선언
		int age;
		int charge = 0;
		
		System.out.print("나이 : ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		// 조건 처리
		if(age < 8) // 비교 연산의 결과 - boolean(true/false)
		{
			charge = 1000;
			System.out.println("미취학 아동 입니다.");
		}
		else if(age >= 8 && age < 14)
		{
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if(age >= 14 && age < 20)
		{
			charge = 3000;
			System.out.println("중.고등학생 입니다.");
		}
		else 
		{
			charge = 4000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는 " + charge + "원 입니다.");		
	}

}

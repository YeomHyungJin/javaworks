package input;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// 반지름을 입력받아 원의 넓이 계산
		Scanner scan = new Scanner(System.in);
		final double PI = 3.141592; // 상수 선언 및 초기화
		
		// 반지름 입력
		System.out.print("반지름 입력: ");
		int radius = scan.nextInt();
		
		// 계산
		double area = radius * radius * PI;
		
		// 결과 출력
		System.out.println("원의 넓이는 " + area + "제곱미터 입니다.");
		
		scan.close();
	}
}

package input;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 짝수/홀수 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		String str = num%2==0 ? "짝수" : "홀수";
		System.out.println(num + " 은/는 " + str + "입니다.");
		
		sc.close();
	}
}

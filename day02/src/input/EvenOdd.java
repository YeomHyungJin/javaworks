package input;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// ¦��/Ȧ�� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		String str = num%2==0 ? "¦��" : "Ȧ��";
		System.out.println(num + " ��/�� " + str + "�Դϴ�.");
		
		sc.close();
	}
}

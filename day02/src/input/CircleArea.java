package input;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// �������� �Է¹޾� ���� ���� ���
		Scanner scan = new Scanner(System.in);
		final double PI = 3.141592; // ��� ���� �� �ʱ�ȭ
		
		// ������ �Է�
		System.out.print("������ �Է�: ");
		int radius = scan.nextInt();
		
		// ���
		double area = radius * radius * PI;
		
		// ��� ���
		System.out.println("���� ���̴� " + area + "�������� �Դϴ�.");
		
		scan.close();
	}
}

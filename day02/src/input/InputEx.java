package input;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		// �Է� ó��
		// Ŭ���� ������Ʈ = new ������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine(); // nextLine() ���� �Է�
		System.out.println("����� �̸��� "+ name + "�̱���.");
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();  // nextInt() ���� �Է�
		System.out.println("����� ���̴� " + age + "�� �̱���.");
		
		sc.close();
	}
}

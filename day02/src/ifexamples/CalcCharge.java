package ifexamples;

import java.util.Scanner;

public class CalcCharge {

	public static void main(String[] args) {
		// ���̰��� ����� ����ϱ� - �����оƵ�, �ʵ�, ��.���, �Ϲ���
		// ���� ����
		int age;
		int charge = 0;
		
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		// ���� ó��
		if(age < 8) // �� ������ ��� - boolean(true/false)
		{
			charge = 1000;
			System.out.println("������ �Ƶ� �Դϴ�.");
		}
		else if(age >= 8 && age < 14)
		{
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}
		else if(age >= 14 && age < 20)
		{
			charge = 3000;
			System.out.println("��.����л� �Դϴ�.");
		}
		else 
		{
			charge = 4000;
			System.out.println("�Ϲ��� �Դϴ�.");
		}
		System.out.println("������ " + charge + "�� �Դϴ�.");		
	}

}

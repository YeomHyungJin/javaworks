package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// �ݺ���
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.print("��� �ݺ��ұ��?(y/n) : ");
			String inputValue = sc.nextLine();
			
			if(inputValue.equals("y") || inputValue.equals("Y")) // "==" ���� �񱳽� ����
			{
				System.out.println("��� �ݺ�");
			}
			else if(inputValue.equals("n") || inputValue.equals("N"))
			{
				System.out.println("�ݺ� �ߴ�");
				break;
			}
			else
			{
				System.out.println("�������� �ʴ� ���");
			}
		}
		sc.close();
	}
}

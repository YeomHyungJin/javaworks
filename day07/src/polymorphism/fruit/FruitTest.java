package polymorphism.fruit;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("1. ���� | 2. �ٳ��� | 3. �ȶ���");
		System.out.println("=========================");
		System.out.print("����>");
		
		int selNum = scan.nextInt();
		
		Fruit fruit = null;
		
		if(selNum == 1)
		{
			fruit = new Grape();	// ������ : �ڵ� ����ȯ
		}
		else if(selNum == 2)
		{
			fruit = new Banana();
		}
		else if(selNum == 3)
		{
			fruit = new Peach();
		}
		else
		{
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		fruit.showInfo();
		
		scan.close();
	}

}
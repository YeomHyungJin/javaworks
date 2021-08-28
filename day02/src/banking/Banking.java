package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		int balance = 0;
		
		while(run)
		{
			System.out.println("=================================");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("=================================");
			System.out.print("����>");
			
			int selNum = sc.nextInt();
			
			switch(selNum){
			case 1:
				System.out.print("���ݾ�>");
				balance += sc.nextInt();
				System.out.println("�Ա� ó�� �Ǿ����ϴ�.");
				break;
			case 2:
				while(true)
				{
					System.out.print("��ݾ�>");
					int afterMoney = sc.nextInt();
					if(balance < afterMoney)
					{
						System.out.println("�ܾ��� �����մϴ�. �ٽ� �Է����ּ���.");
					}
					else
					{
						balance -= afterMoney;
						System.out.println("��� ó�� �Ǿ����ϴ�.");
						break;
					}
				}
				break;
			case 3:
				System.out.println("�ܰ�>" + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("�޴��� �߸� �������ϴ�.");
			}
		}
		System.out.println("���α׷� ����.");
		sc.close();
	}
}

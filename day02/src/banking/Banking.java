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
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("=================================");
			System.out.print("선택>");
			
			int selNum = sc.nextInt();
			
			switch(selNum){
			case 1:
				System.out.print("예금액>");
				balance += sc.nextInt();
				System.out.println("입금 처리 되었습니다.");
				break;
			case 2:
				while(true)
				{
					System.out.print("출금액>");
					int afterMoney = sc.nextInt();
					if(balance < afterMoney)
					{
						System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
					}
					else
					{
						balance -= afterMoney;
						System.out.println("출금 처리 되었습니다.");
						break;
					}
				}
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("메뉴를 잘못 눌렀습니다.");
			}
		}
		System.out.println("프로그램 종료.");
		sc.close();
	}
}

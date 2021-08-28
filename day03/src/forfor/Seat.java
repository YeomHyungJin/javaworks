package forfor;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장객 수 입력 : ");
		int customNum = sc.nextInt();
		
		System.out.print("좌석 열의 수 입력 : ");
		int colNum = sc.nextInt();
		
		int rowNum;
		
		if(customNum % colNum == 0 )
		{
			rowNum = customNum / colNum;
		}
		else
		{
			rowNum = customNum / colNum+1;
		}
//		rowNum = customNum % colNum;
		
		System.out.println(rowNum + "개의 줄이 필요합니다.");
		sc.close();
	}

}

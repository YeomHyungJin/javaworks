package forfor;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// 1?? ?????ϴ? ?ݺ???
//		int i, j;
//		for(i=0; i<5; i++)
//		{
//			for(j=1;j<=5; j++)
//			{
//				int inc = i*5+j;
//				System.out.print("?¼?" + inc + " ");
//			}
//			System.out.println();
//		}
		Scanner sc = new Scanner(System.in);
		
		System.out.print("???尴 ?? ?Է? : ");
		int customNum = sc.nextInt();
		
		System.out.print("?¼? ???? ?? ?Է? : ");
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
		int i, j;
		for(i=0; i<rowNum; i++)
		{
			for(j=1;j<=colNum; j++)
			{
				int seat = i*colNum+j;
				System.out.print("?¼?" + seat + " ");
				if (seat == customNum)
				{
					break;
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

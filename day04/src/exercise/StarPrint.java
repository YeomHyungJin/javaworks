package exercise;

public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int row = 5;
		int star = 1;
		
//		for(i = 1; i<=row; i++)
//		{
//			for(j=1; j<star+i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		System.out.println(row);
		System.out.println(star);
		
//		for(i=1; i<=5; i++)
//		{
//			// 공백문자 표시
//			for(j=1; j<=5-i; j++)
//			{
//				System.out.print(" ");
//			}
//			// 별 표시
//			for(j=1; j<i+1;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 변수 활용해서 삼각형 출력
		row = 5;
		star = 1;
		int space = row - 1;
		
		for(i = 2; i <= row; i++)
		{
			for(j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(j=1; j<star+1; j++) 
			{
				System.out.print("*");
			}
			if(i<=row)
			{
				space -= 1; // 공백문자는 1개씩 감소
				star += 2;  // 별문자는 2개씩 증가
			}
			System.out.println();
		}
	}
}

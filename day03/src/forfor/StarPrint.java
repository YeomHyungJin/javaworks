package forfor;

public class StarPrint {

	public static void main(String[] args) {
		// º° Âï±â
//		for(int i = 1 ; i < 6 ; i++)
//		{
//			for(int j = 1 ; j < 6 ; j++)
//			{
//				if(i < j)
//				{
//					break;
//				}
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i = 1 ; i < 6 ; i++)
		{
			for(int j = 1 ; j < i+1 ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1 ; i < 6 ; i++)
		{
			for(int j = 1 ; j < 6-i+1 ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

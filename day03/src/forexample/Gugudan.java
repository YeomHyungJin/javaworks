package forexample;

public class Gugudan {

	public static void main(String[] args) {
		// ������
//		int num = 4;
//		
//		for(int i = 1 ; i <10 ; i++)
//		{
//			System.out.println("4 x " + i + "=" + (num * i));
//		}
		
		// ��ü ������ - 9�� 1��(��ø for)
		for (int j = 2 ; j < 10 ; j++)
		{
			System.out.println(j + "��");
			for(int h = 1; h < 10 ; h++)
			{
				System.out.println(j + "x" + h + "=" + (j*h));
			}
			System.out.println();
		}
		// ¦���� ���
//		for (int j = 2 ; j < 10 ; j+=2)
//		{
//			System.out.println(j + "��");
//			for(int h = 1; h < 10 ; h++)
//			{
//				System.out.println(j + "x" + h + "=" + (j*h));
//			}
//			System.out.println();
//		}
	}
}

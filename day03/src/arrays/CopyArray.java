package arrays;

public class CopyArray {

	public static void main(String[] args) {
		// �迭�� ����
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = new int[4];
		
		// arr1�� �迭 ��Ҹ� arr2�� ����
		for(int i = 0 ; i < arr1.length ; i ++)
		{
			arr2[i] = arr1[i];
		}
		
		// arr2�� ���
		for(int i = 0 ; i < arr2.length ; i ++)
		{
			System.out.print(arr2[i]);
		}
		
		System.out.println();
		
		// ������ �迭 ����
		char[] ch1 = {'��', '��', '��'};
		char[] ch2 = new char[3];
		
		// ch1�� �迭 ��Ҹ� ch2�� ����
		for(int i = 0 ; i < ch1.length ; i ++)
		{
			ch2[i] = ch1[i];
			ch2[2-i] = ch1[i]; // ���ڿ��� ������ �ٲٴ� �ڵ�
		}
		// ch2�� ���
		for(int i = 0 ; i < ch2.length ; i ++)
		{
			System.out.print(ch2[i]);
		}
	}
}

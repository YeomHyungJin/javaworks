package arrays;

public class NumberArray {

	public static void main(String[] args) {
		// �迭 ����
		// ������ numbers �̸��� �迭 ����(ũ��) 3�� ����
		int[] numbers = new int[3];
		
		System.out.println(numbers.length);
		
		// ���� ���� - �ε��� ��ü�� ���� ���� ��
		// �ڷ����� �ʱⰪ - ��ü(null), ����(0), ����("");
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		// �迭�� for���� �����ؼ� ���
		for(int i =0 ; i < numbers.length ; i ++)
		{
			System.out.println(numbers[i]);
		}
	}

}

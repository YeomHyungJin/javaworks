package arrays;

public class NumberArray2 {

	public static void main(String[] args) {
		// �迭�� ����� ��� - �߰�ȣ �����ȿ� �ʱ�ȭ ��
		int[] arr = {1, 2, 3, 4};
		
		// �迭�� ũ��
		System.out.println("�迭�� ũ�� : "+arr.length);
		
		// arr[2]�� �� ���
		System.out.println("���� �� arr[2] : "+arr[2]);
		
		// arr[2] ���� ����(����)
		arr[2] = 6;
		System.out.println("���� �� arr[2] : "+arr[2]);
		
		int sum = 0;
		// ��ü ���
		for(int i = 0 ; i < arr.length ; i ++)
		{
			sum += arr[i];
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		System.out.println();
		System.out.println("�迭�� �հ�� : "+ sum);
		// �հ�
		// ���
		double avg = 0.0;
		
		avg = (double)sum/arr.length;
		System.out.println("���: "+avg);
	}
}
package whileexample;

public class WhileSum {

	public static void main(String[] args) {
		// 1 ���� 10 sum
		int i = 1;
		int sum = 0; // �հ踦 ������ ����
		
		while(i <= 10)
		{
			sum += i; // ���� �հ�
			i++;
		}
		System.out.println("�հ�� : "+ sum);
	}
 }

package whileexample;

public class WhileSum2 {

	public static void main(String[] args) {
		// 1 ���� 10 sum
		// break�� ��� -> �ݺ� ���ǹ�
		
		int n = 1;
		int sum = 0;
		while(true)
		{
			sum += n;
			n++;
			if(n > 10) break;
		}
		System.out.println("�հ�� :: " + sum);
	}
 }

package operator;

public class Compare {

	public static void main(String[] args) {
		// �� ������
		int n1 = 7;
		int n2 = 3;
		
//		System.out.println(n1 > n2);
//		System.out.println(n1 <= n2);
//		System.out.println(n1 < n2);
//		System.out.println(n1 == n2);
//		System.out.println(n1 != n2);
		
		// �� ������
		// boolean �ڷ����� true/false�� ���� ����
		// &&-���� ������, ||-���� ������, !-������ ������
		boolean result1, result2, result3;
		result1 = (n1 < n2) && (n1 != n2);
//		System.out.println(result1);
		
		result2 = (n1 < n2) || (n1 != n2);
//		System.out.println(result2);
		
		result3 = !(n1 < n2);
		System.out.println(result3);
		
		// ���̸� ���ؼ� boolean ������ �����ϱ�
		int age1 = 28;
		int age2 = 25;
		boolean compare_age = age1 > age2;
		
//		System.out.println(compare_age);
	}
}

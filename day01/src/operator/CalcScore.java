package operator;

public class CalcScore {

	public static void main(String[] args) {
		// ������ ������ ��� ���ϱ�
		int mathScore = 100;
		int englishScore = 80;
		int argScore = 60;
		int excerciseScore = 100;
		
		int totalScore = mathScore + englishScore + argScore + excerciseScore;
		// ���� ����ȯ
		double avgScore = (double)totalScore / 4;
		
		System.out.println("������?? "+totalScore);
		System.out.println("�����?? "+avgScore);
		
		// ����, ���� ������ ++ / --
		int num = 10;
//		System.out.println(num++); // 10
//		System.out.println(num);   // 11
		
		// ��ġ ����
//		System.out.println(++num); // 11
//		System.out.println(num);   // 11
		// num++ => num += 1, num = num + 1
		// num-- => num -= 1, num = num - 1
		
		System.out.println("====��� ����====");
		// ��� ����
		int n1 = 10;
		int n2 = 4;
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
	}

}
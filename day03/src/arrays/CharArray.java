package arrays;

public class CharArray {

	public static void main(String[] args) {
		// ���ڿ� �迭 ���� �� ���
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		// �ε��� - "K7"
		System.out.println(cars[3]);
		
		// "Morning"�� "BMW"�� ����
		cars[0] = "BMW";
		System.out.println(cars[0]);
		
		// ��ü ���
		for(int i =0 ; i< cars.length; i++)
		{
			System.out.print(cars[i] + ", ");
		}
		System.out.println();
	
		
		
		// �׻� for��
//		System.out.println("==�׻� for��==");
//		for(String car : cars)
//		{
//			System.out.print(car + ", ");
//		}
//		
//		System.out.println();
		
//		// ���ĺ��� �빮�ڸ� �迭�� ����
//		char[] alphabet = new char[26];
//		char ch = 'A';
//		
//		for(int i = 0 ; i < alphabet.length; i++)
//		{
//			alphabet[i] = ch;
//			ch++;
//			System.out.println((int)alphabet[i] +", "+ alphabet[i]);
//		}
		
//		System.out.println(alphabet[0]);
	}

}
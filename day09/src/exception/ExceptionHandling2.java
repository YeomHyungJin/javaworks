package exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// ���� try ~ catch��
		try {
			String name = null;
			int num1 = 10, num2 = 0;
			System.out.println(name.toString());
			// null ��ü�� �����ؼ� ���� �߻� - ���� ����(Runtime Error)
			
			int num3 = num1 / num2;
			System.out.println(num3);
		}
//		catch(NullPointerException e) {
//			System.out.println(e);
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//			System.out.println("0���� ���� �� �����ϴ�.");
//		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

package switchcase;

public class CalenderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* case���� ���ÿ� ����� ���
		 * �޷� : 31�� - 1, 3, 5, 7, 8, 10, 12��
		 *       30�� - 4, 6, 9, 11��
		 *       28�� - 2��
		 */
		int month = 8;
		int day = 0;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			case 2: 
				day = 28;
				break;
			default:
				System.out.println("�������� �ʴ� ����Դϴ�.");
				break;
		}
		System.out.println(month + "���� " + day + "�ϱ��� �ֽ��ϴ�.");
	}

}
package switchcase;

public class SwitchEx {

	public static void main(String[] args) {
		// ���ǹ�: switch ~ case �� ����ϱ�
		// ������ ���� �޴� ����
		int rank = 2;
		String medalColor = "";
		
//		if(rank==1) medalColor = "Gold";
//		else if(rank==2) medalColor = "Silver";
//		else if(rank==3) medalColor = "Bronze";
//		else System.out.println("�޴��� �����ϴ�.");
		
		switch (rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default:
			medalColor = "None";
			break;
		}
		
		System.out.println("�޴� ������ " + medalColor + "�Դϴ�.");
	}

}

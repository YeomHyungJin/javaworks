package switchcase;

public class SwitchEx {

	public static void main(String[] args) {
		// 조건문: switch ~ case 문 사용하기
		// 순위에 따른 메달 색상
		int rank = 2;
		String medalColor = "";
		
//		if(rank==1) medalColor = "Gold";
//		else if(rank==2) medalColor = "Silver";
//		else if(rank==3) medalColor = "Bronze";
//		else System.out.println("메달이 없습니다.");
		
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
		
		System.out.println("메달 색상은 " + medalColor + "입니다.");
	}

}

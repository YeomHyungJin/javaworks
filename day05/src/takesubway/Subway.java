package takesubway;

public class Subway {
	
	int subwayNumber;	// ����ö ��ȣ
	int passenger;		// �°�
	int money;			// ����
	
	public Subway(int subwayNumber) 
	{
		this.subwayNumber = subwayNumber;
	}
	
	public void takeSubway(int money)
	{
		this.money += money;
		passenger++;
	}
	
	public void showInfo()
	{
		System.out.println(subwayNumber + "�� ����ö�� ������ " + money + "�� �̰�, �°����� " + passenger + "�� �Դϴ�.");
	}
}

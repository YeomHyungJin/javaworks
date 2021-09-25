package takesubway;

public class Subway {
	
	int subwayNumber;	// 지하철 번호
	int passenger;		// 승객
	int money;			// 수입
	
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
		System.out.println(subwayNumber + "번 지하철의 수입은 " + money + "원 이고, 승객수는 " + passenger + "명 입니다.");
	}
}

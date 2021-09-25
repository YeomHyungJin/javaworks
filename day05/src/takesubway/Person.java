package takesubway;

public class Person {
	
	private String name;
	int age;
	private int money;
	
	public Person(String name, int money)
	{
		this.name = name;
		this.money = money;
	}
	
	// ����ö�� Ÿ��
	public void TakeSubway(Subway subway)
	{
		subway.takeSubway(1200);
		this.money -= 1200;
	}
	
	public void showInfo()
	{
		System.out.println(name + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}

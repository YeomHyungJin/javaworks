package polymorphism.fruit;

public class Fruit {
	String name;
	String weight;
	int price;
	
	public Fruit(){};
	
	public void showInfo()
	{
		System.out.println("과일 이름은 : " + name);
		System.out.println("과일 무게는 : " + weight);
		System.out.println("과일 가격은 : " + price);
	}
}

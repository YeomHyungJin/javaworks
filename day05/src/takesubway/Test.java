package takesubway;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("»Ô∫Œ", 20000);
		Person p2 = new Person("≥Ó∫Œ", 20000);
		
		Subway subway1 = new Subway(1224);
		Subway subway2 = new Subway(1141);
		
		p1.TakeSubway(subway1);
		p2.TakeSubway(subway2);
		
		p1.showInfo();
		p2.showInfo();
		
		subway1.showInfo();
		subway2.showInfo();
	}

}

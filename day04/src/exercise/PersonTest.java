package exercise;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.age = 28;
		p1.name = "¿Ã∏˘∑Ê";
		
		Person p2 = new Person(27, "º∫√·«‚");
				
		p1.showInfo();
		p2.showInfo();
	}

}

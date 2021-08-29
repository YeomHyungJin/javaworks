package inherit;

class Person 
{
	String name;
	int age;
}

// Person을 상속한 Engineer 클래스
class Engineer extends Person
{
	int companyId;
}

public class EngineerTest {

	public static void main(String[] args) {
		Engineer eng = new Engineer();
		
		eng.companyId = 13;	// 자식 멤버에 접근
		eng.age = 28;		// 부모 멤버에 접근
		eng.name = "홍길동";	// 부모 멤버에 접근
	}

}

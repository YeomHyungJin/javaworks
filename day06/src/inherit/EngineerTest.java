package inherit;

class Person 
{
	String name;
	int age;
}

// Person�� ����� Engineer Ŭ����
class Engineer extends Person
{
	int companyId;
}

public class EngineerTest {

	public static void main(String[] args) {
		Engineer eng = new Engineer();
		
		eng.companyId = 13;	// �ڽ� ����� ����
		eng.age = 28;		// �θ� ����� ����
		eng.name = "ȫ�浿";	// �θ� ����� ����
	}

}

package exercise;

public class Person {
	int age;
	String name;
	
	public Person() {}
	public Person(int a, String b)
	{
		this.age = a;
		this.name = b;
	}
	public void showInfo()
	{
		System.out.println("����� ���̴� : "+age);
		System.out.println("����� �̸��� : "+name);
	}
}

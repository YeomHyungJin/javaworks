package classpart;

public class Student {
	// �л� Ŭ���� ���� : ������� + ������ + �޼���
	private String studentName;		// �̸�
	private int grade;				// �г�
	
	public Student() // �⺻�����ڴ� ���� ����
	{
		
	}
	
	public Student(String studentName)
	{
		this.studentName = studentName;
	}
	
	// �л� ���� �޼���(�ν��Ͻ� �޼ҵ�)
	public void showInfo()
	{
		System.out.println("�̸� : "+ studentName);
		System.out.println("�г� : "+ grade);
	}
	
	// get(), set() �޼���
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	// get(), set() �޼���
	public void setGrade(int grade)
	{
		this.grade = grade;
	}
}
package scoremanage.score;

public class Student {
	int id;				// �й�
	String stdName;		// �л� �̸�
	Subject korean; 		// ���� ����
	Subject math;		// ���� ����
	
	public Student(int id, String stdName)
	{
		this.id = id;
		this.stdName = stdName;
		korean = new Subject();
		math = new Subject();
	}
	
	// ���� ����� ���� ���� �޼ҵ�
	public void koreanSubject(String name, int score)
	{
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	// ���� ����� ���� ���� �޼ҵ�
	public void mathSubject(String name, int score)
	{
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	// ���� ���
	public void showInfo()
	{
//		System.out.println(stdName + "�� ���� ������ " + korean.getScorePoint() + "���̰�, ���������� " + math.getScorePoint() + "�� �Դϴ�.");
		System.out.printf("%s�� ���� ������ %d���̰�, ���������� %d�� �Դϴ�.", stdName, korean.getScorePoint(), math.getScorePoint());
	}
}

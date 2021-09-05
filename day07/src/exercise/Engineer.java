package exercise;

public class Engineer extends Employee {
	
	private String skillset;
	
	public Engineer(String name, String skillset)
	{
		super(name);
		this.skillset = skillset;
	}
	// �Ű� ������ �ִ� ����� ��� ���� ���� �ݵ�� �θ��� ��������� super()�� ����ؾ� ��.
	
	public String getSkillSet()
	{
		return skillset;
	}
	
	public void setSkillSet(String skillset)
	{
		this.skillset = skillset;
	}
}

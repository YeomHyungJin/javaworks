package classpart;

public class Account {
	private String ano;   //���¹�ȣ
	private String owner; //������	
	private int balance;  //�ܾ�
	public Account()
	{
		
	}
	public Account(String ano, String owner, int balance)
	{
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	// set+�������() �޼��� - �ܺ��Է�
	public void setAno(String ano)
	{
		this.ano = ano;		//
	}
	// get+�������() - ��� 
	public String getAno()
	{
		return ano;
	}
	
	// set+�������() �޼��� - �ܺ��Է�
	public void setOwner(String owner)
	{
		this.owner = owner;		//
	}
	// get+�������() - ��� 
	public String getOwner()
	{
		return owner;
	}
	
	// set+�������() �޼��� - �ܺ��Է�
	public void setBalance(int balance)
	{
		this.balance = balance;		
	}
	// get+�������() - ��� 
	public int getBalance()
	{
		return balance;
	}
	
}

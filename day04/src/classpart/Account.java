package classpart;

public class Account {
	private String ano;   //계좌번호
	private String owner; //계좌주	
	private int balance;  //잔액
	public Account()
	{
		
	}
	public Account(String ano, String owner, int balance)
	{
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	// set+멤버변수() 메서드 - 외부입력
	public void setAno(String ano)
	{
		this.ano = ano;		//
	}
	// get+멤버변수() - 출력 
	public String getAno()
	{
		return ano;
	}
	
	// set+멤버변수() 메서드 - 외부입력
	public void setOwner(String owner)
	{
		this.owner = owner;		//
	}
	// get+멤버변수() - 출력 
	public String getOwner()
	{
		return owner;
	}
	
	// set+멤버변수() 메서드 - 외부입력
	public void setBalance(int balance)
	{
		this.balance = balance;		
	}
	// get+멤버변수() - 출력 
	public int getBalance()
	{
		return balance;
	}
	
}

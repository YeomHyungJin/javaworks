package classpart;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Account account2 = new Account("110-111-333", "염형진", 11000);
		//account.ano = "110-350-902339";
		// 멤버변수의 접근제한자가 private이므로 접근할수없음
		
		account.setAno("110-111-333");
		account.setOwner("염형진");
		account.setBalance(11000);
		
		System.out.println(account.getAno());
		System.out.println(account.getOwner());
		System.out.println(account.getBalance());
	}

}

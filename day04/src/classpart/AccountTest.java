package classpart;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Account account2 = new Account("110-111-333", "������", 11000);
		//account.ano = "110-350-902339";
		// ��������� ���������ڰ� private�̹Ƿ� �����Ҽ�����
		
		account.setAno("110-111-333");
		account.setOwner("������");
		account.setBalance(11000);
		
		System.out.println(account.getAno());
		System.out.println(account.getOwner());
		System.out.println(account.getBalance());
	}

}

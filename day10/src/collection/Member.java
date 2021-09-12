package collection;

public class Member {
	private int memberId;		// ȸ����ȣ
	private String memberName;	// ȸ���̸�
	
	public Member(int memberId, String memberName)
	{
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString()
	{
		return memberId + ", " + memberName;
	}
}
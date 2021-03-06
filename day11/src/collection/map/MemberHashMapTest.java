package collection.map;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		// 회원 생성
		memberHashMap.addMember(new Member(1001, "네이버"));
		memberHashMap.addMember(new Member(1002, "카카오"));
		memberHashMap.addMember(new Member(1003, "현대자동차"));
		memberHashMap.addMember(new Member(1001, "삼성전자"));
		
		// 전체 출력
		memberHashMap.showAllMember();
		
		System.out.println("=============");
		
		// 회원 삭제
		memberHashMap.removeMember(1001);
		
		// 전체 출력
		memberHashMap.showAllMember();
	}

}

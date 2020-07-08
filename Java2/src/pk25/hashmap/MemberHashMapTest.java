package pk25.hashmap;

import pk26.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {

		MemberHashMap memberhashmap = new MemberHashMap();
		Member member1 = new Member(1001, "이지원");
		Member member2 = new Member(1002, "손민국");
		Member member3 = new Member(1003, "박서훤");
		Member member4 = new Member(1004, "홍길동");
		Member member5 = new Member(1005, "임껌정");
		
		memberhashmap.addMember(member1);
		memberhashmap.addMember(member2);
		memberhashmap.addMember(member3);
		memberhashmap.addMember(member4);
		memberhashmap.addMember(member5);
		
		memberhashmap.showAllMember();
		
		memberhashmap.removeMember(1004);
		System.out.println("====== 리무브 사용후 =====");
		memberhashmap.showAllMember();
		
		System.out.println("====== 중복 사용후 =====");
		Member member6 = new Member(1005,"임창정");
		memberhashmap.addMember(member6);
		memberhashmap.showAllMember();
		
		
		
	}

}

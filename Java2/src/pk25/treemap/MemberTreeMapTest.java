package pk25.treemap;

import pk26.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		
		MemberTreeMap membertreemap = new MemberTreeMap();
		
		Member member1 = new Member(1001, "이지원");
		Member member2 = new Member(1002, "손민국");
		Member member3 = new Member(1003, "박서훤");
		Member member4 = new Member(1004, "홍길동");
		Member member5 = new Member(1005, "임껌정");
		
		membertreemap.addMember(member1);
		membertreemap.addMember(member2);
		membertreemap.addMember(member3);
		membertreemap.addMember(member4);
		membertreemap.addMember(member5);
		
		membertreemap.showallMember();
		
		membertreemap.removeMember(1004);
		System.out.println("====== 리무브 사용후 =====");
		membertreemap.showallMember();
		
		System.out.println("====== 중복 사용후 =====");
		Member member6 = new Member(1005,"임창정");
		membertreemap.showallMember();
		
	}

}

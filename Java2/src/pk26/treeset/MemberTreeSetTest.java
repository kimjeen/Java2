package pk26.treeset;

import pk26.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		
		//1. MemberTreeSet 객체 생성
		MemberTreeSet membertreeset = new MemberTreeSet();
		
		//2. member 객체 생성
		Member member1 = new Member(1001, "손흥민");
		Member member2 = new Member(1002, "이청용");
		Member member3 = new Member(1003, "황희찬");
		
		//3. MemberTreeSet 이용해서 member 객체 추가
		membertreeset.addMemeber(member1);
		membertreeset.addMemeber(member2);
		membertreeset.addMemeber(member3);
		
		//4. show 함수 이용해서 출력.
		
		membertreeset.showAllMember();
		

	}

}

package pk25.hashmap;

import pk26.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {

		MemberHashMap memberhashmap = new MemberHashMap();
		Member member1 = new Member(1001, "������");
		Member member2 = new Member(1002, "�չα�");
		Member member3 = new Member(1003, "�ڼ���");
		Member member4 = new Member(1004, "ȫ�浿");
		Member member5 = new Member(1005, "�Ӳ���");
		
		memberhashmap.addMember(member1);
		memberhashmap.addMember(member2);
		memberhashmap.addMember(member3);
		memberhashmap.addMember(member4);
		memberhashmap.addMember(member5);
		
		memberhashmap.showAllMember();
		
		memberhashmap.removeMember(1004);
		System.out.println("====== ������ ����� =====");
		memberhashmap.showAllMember();
		
		System.out.println("====== �ߺ� ����� =====");
		Member member6 = new Member(1005,"��â��");
		memberhashmap.addMember(member6);
		memberhashmap.showAllMember();
		
		
		
	}

}

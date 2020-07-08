package pk25.treemap;

import pk26.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		
		MemberTreeMap membertreemap = new MemberTreeMap();
		
		Member member1 = new Member(1001, "������");
		Member member2 = new Member(1002, "�չα�");
		Member member3 = new Member(1003, "�ڼ���");
		Member member4 = new Member(1004, "ȫ�浿");
		Member member5 = new Member(1005, "�Ӳ���");
		
		membertreemap.addMember(member1);
		membertreemap.addMember(member2);
		membertreemap.addMember(member3);
		membertreemap.addMember(member4);
		membertreemap.addMember(member5);
		
		membertreemap.showallMember();
		
		membertreemap.removeMember(1004);
		System.out.println("====== ������ ����� =====");
		membertreemap.showallMember();
		
		System.out.println("====== �ߺ� ����� =====");
		Member member6 = new Member(1005,"��â��");
		membertreemap.showallMember();
		
	}

}

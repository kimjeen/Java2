package pk26.treeset;

import pk26.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		
		//1. MemberTreeSet ��ü ����
		MemberTreeSet membertreeset = new MemberTreeSet();
		
		//2. member ��ü ����
		Member member1 = new Member(1001, "�����");
		Member member2 = new Member(1002, "��û��");
		Member member3 = new Member(1003, "Ȳ����");
		
		//3. MemberTreeSet �̿��ؼ� member ��ü �߰�
		membertreeset.addMemeber(member1);
		membertreeset.addMemeber(member2);
		membertreeset.addMemeber(member3);
		
		//4. show �Լ� �̿��ؼ� ���.
		
		membertreeset.showAllMember();
		

	}

}

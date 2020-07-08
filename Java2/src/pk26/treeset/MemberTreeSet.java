package pk26.treeset;
import java.util.Iterator;
import java.util.TreeSet;
import pk26.Member;

public class MemberTreeSet {
	
	//1. ��ü ����
	private TreeSet<Member> treeset;
	
	//2. ������ �������̵� �ϸ鼭  ��ü ����
	public MemberTreeSet() {
		treeset = new TreeSet<Member>();
	}
	
	// 3. treeSet ��ü �߰�
	public void addMemeber(Member member) {
		treeset.add(member);
	}
	// 4. treeSet remove 
	public boolean removeMember(int memberId) {
		Iterator<Member> ir=treeset.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			//int�� ������ ����, memberŬ������ 
			int tempId = member.getMemberId();
			if(tempId== memberId) {
				treeset.remove(member);
				return true;
			}
		}
		System.out.println(memberId +"���̵� �������� ����.");
		return false;
	}
	
	//5. ���
	public void showAllMember() {
		for(Member member : treeset) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}

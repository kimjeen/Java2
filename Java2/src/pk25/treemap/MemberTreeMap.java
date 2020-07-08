package pk25.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import pk26.Member;

public class MemberTreeMap {
	//1.��ü ����
	private TreeMap<Integer, Member> treemap;
	//2.��ü����
	public MemberTreeMap() {
		treemap = new TreeMap<Integer,Member>();
	}
	//3. add �Լ� ����
	
	public void addMember(Member member) {
		treemap.put(member.getMemberId(), member);
	}
	//4. remove �Լ� ����
	
	public boolean removeMember(int memberId) {
		if(treemap.containsKey(memberId)) {
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	//5. �ٺ����ִ� �Լ� ����
	public void showallMember() {
		Iterator<Integer> ir = treemap.keySet().iterator();
	
	while(ir.hasNext()) {
		int key = ir.next(); //Key ����
		//key �����ͼ� member���ٰ� ����
		Member member = treemap.get(key);
	System.out.println(member);
	}
	System.out.println();
	}
}

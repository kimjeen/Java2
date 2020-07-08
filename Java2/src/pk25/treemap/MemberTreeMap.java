package pk25.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import pk26.Member;

public class MemberTreeMap {
	//1.객체 선언
	private TreeMap<Integer, Member> treemap;
	//2.객체생성
	public MemberTreeMap() {
		treemap = new TreeMap<Integer,Member>();
	}
	//3. add 함수 생성
	
	public void addMember(Member member) {
		treemap.put(member.getMemberId(), member);
	}
	//4. remove 함수 생성
	
	public boolean removeMember(int memberId) {
		if(treemap.containsKey(memberId)) {
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	//5. 다보여주는 함수 생성
	public void showallMember() {
		Iterator<Integer> ir = treemap.keySet().iterator();
	
	while(ir.hasNext()) {
		int key = ir.next(); //Key 저장
		//key 꺼내와서 member에다가 저장
		Member member = treemap.get(key);
	System.out.println(member);
	}
	System.out.println();
	}
}

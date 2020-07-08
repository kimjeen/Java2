package pk26.hashset;

import java.util.HashSet;
import java.util.Iterator;

import pk26.Member;

public class MemberHashSet {
	//HashSet 타입의 필드 생성(인스터스화 되있다 ->인스턴스 변수)
	//heap memory,인스턴스 변수 
	private HashSet<Member> hashSet;
	
	//생성자 overriding을 통해서 HashSet의 객체 생성
	public MemberHashSet(){
		hashSet=new HashSet<Member>();
	}
	
	// hashSet에 객체 추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	// hashSet에선 get을 제공하지 않음,그러므로 순회하는Iterator를 통하여 값을 비교 판단해야함.
	public boolean removeMember(int memberId) {
	Iterator<Member> ir = hashSet.iterator(); //ArrayList 처럼 get(i)를 제공하지 않음.
	while(ir.hasNext()) { //hasNext : 다음 객체 존재 판단하여 진행하는 메소드
		Member member = ir.next();
	
	int tempId = member.getMemberId();
	if(tempId == memberId) {  //멤버아이디가 매개변수와 일치하면
		hashSet.remove(member); //해당멤버를 사겢
		return true; //true 반환.
	}
	}//while off
	System.out.println(memberId + "아이디가 존재하지 않습니다.");
	return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
	
	
	
	


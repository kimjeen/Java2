package pk26.treeset;
import java.util.Iterator;
import java.util.TreeSet;
import pk26.Member;

public class MemberTreeSet {
	
	//1. 객체 선언
	private TreeSet<Member> treeset;
	
	//2. 생성자 오버라이딩 하면서  객체 생성
	public MemberTreeSet() {
		treeset = new TreeSet<Member>();
	}
	
	// 3. treeSet 객체 추가
	public void addMemeber(Member member) {
		treeset.add(member);
	}
	// 4. treeSet remove 
	public boolean removeMember(int memberId) {
		Iterator<Member> ir=treeset.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			//int형 변수방 설정, member클래스서 
			int tempId = member.getMemberId();
			if(tempId== memberId) {
				treeset.remove(member);
				return true;
			}
		}
		System.out.println(memberId +"아이디가 존재하지 않음.");
		return false;
	}
	
	//5. 출력
	public void showAllMember() {
		for(Member member : treeset) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}

package pk26;

import java.util.Comparator;

public class Member implements Comparator<Member>{

	private int memberId;       //회원 아이디
	private String memberName;  //회원 이름
	private Member() {} //디폴트 생성자 Comparable<Member>
	
	public Member(int memberId,String memberName ) {//생성자
		this.memberId=memberId;
		this.memberName=memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	// 맴버id를 주소값으로 사용.
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		//객체 여부 확인
		if(obj instanceof Member) {
			//다운캐스팅
			Member compareKey=(Member)obj;
		
			//this의 number와 compareKey의 memberId값이 같으면 true 아니면 false
			//this.number -> 메인서 넘어온값.
			// compareKey.memberId -> 생성한 객체의 값.
			if(this.memberId==compareKey.memberId) {
				return true;
			}
			else {
				return false;
			}
		}
		
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return memberName + "님의 아이디는 " + memberId+ "입니다.";
	}

	
	public int compareTo(Member member,Member member2) {
		// TODO Auto-generated method stub
		return (this.memberId - member.memberId); //오름차순
	}

	@Override
	public int compare(Member member1, Member member2) { //comparator <E>
		return (member1.memberId - member2.memberId);
	}

	

	
	
	
	
}

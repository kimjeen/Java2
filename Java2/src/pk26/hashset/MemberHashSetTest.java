package pk26.hashset;

import pk26.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		//맴버해쉬셋 객체 생성
		MemberHashSet memberHashSet = new MemberHashSet();
		//맴버 객체 생성
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박서훤");

		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		
		memberHashSet.showAllMember();
		System.out.println("======================================");
		//객체 추가(중복id)
		//1003이라는 id가 중복.
		Member memberHong = new Member(1003,"홍길동");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
	}

}
/* HashSet은 값을 비교판단하여 입력하는데  equals와 hashcode를 재정의 해주지 않으면 
 * 데이터의 중복 여부를 판단할 수가 없어서 중복을 허용 한다.*/

// String 또는 Integer등은 이미 JDK에서 재정의 하였고 JVM(컴파일시 작동)에서 인지 하므로 중복이 불허됨.

// 정렬은 compable를 통하여 재정의 해주어야 가능하다.(String 또는 Integer등은 이미 되어 있음.)




package pk26.arraylist;


import java.util.ArrayList;
import java.util.Iterator;

import pk26.Member;
public class MemberArrayList {
	
	// ArrayList 선언
	private ArrayList<Member> arrayList;
	
	//constructor
	public MemberArrayList() {
		//멤버로 선언한  ArrayList가 인스턴스화 됨.
		arrayList=new ArrayList<Member>(); 
	}
	
	//ArrayList에 멤버 추가.
	public void addMember(Member member) {
		arrayList.add(member);
	}
	//arrayList에 memberId가 있는지 확인하고 있으면 지움.
	public boolean removeMember(int memberId) { // 맴버 아이디를 매개변수로, 삭제여부를 반환
		for(int i=0;i<arrayList.size();i++) { //해당 아이디를 가진멤버를 ArrayList
			Member member = arrayList.get(i);
			int tempId=member.getMemberId(); 
			if(tempId==memberId) {            //멤버 아이디가 매개변수와 일치하면
				arrayList.remove(i);		  //해당 멤버를 삭제
				return true;                  //true 반환.
			}
		}
		Iterator<Member> ir= arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId=member.getMemberId(); 
			if(tempId==memberId) {         //맴버아이디가 매개변수와 일치하면   
				arrayList.remove(member); //해당멤버를 삭제
				return true;               //true반환  
			}
			}
		System.out.println(memberId+"가 존재하지 않습니다." );
		return false;
	}
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
		System.out.println(arrayList);
	}
	
	
}

		


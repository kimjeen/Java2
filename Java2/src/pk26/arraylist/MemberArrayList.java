package pk26.arraylist;


import java.util.ArrayList;
import java.util.Iterator;

import pk26.Member;
public class MemberArrayList {
	
	// ArrayList ����
	private ArrayList<Member> arrayList;
	
	//constructor
	public MemberArrayList() {
		//����� ������  ArrayList�� �ν��Ͻ�ȭ ��.
		arrayList=new ArrayList<Member>(); 
	}
	
	//ArrayList�� ��� �߰�.
	public void addMember(Member member) {
		arrayList.add(member);
	}
	//arrayList�� memberId�� �ִ��� Ȯ���ϰ� ������ ����.
	public boolean removeMember(int memberId) { // �ɹ� ���̵� �Ű�������, �������θ� ��ȯ
		for(int i=0;i<arrayList.size();i++) { //�ش� ���̵� ��������� ArrayList
			Member member = arrayList.get(i);
			int tempId=member.getMemberId(); 
			if(tempId==memberId) {            //��� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i);		  //�ش� ����� ����
				return true;                  //true ��ȯ.
			}
		}
		Iterator<Member> ir= arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId=member.getMemberId(); 
			if(tempId==memberId) {         //�ɹ����̵� �Ű������� ��ġ�ϸ�   
				arrayList.remove(member); //�ش����� ����
				return true;               //true��ȯ  
			}
			}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�." );
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

		


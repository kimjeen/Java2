package pk26;

import java.util.Comparator;

public class Member implements Comparable<Member>{

	private int memberId;       //ȸ�� ���̵�
	private String memberName;  //ȸ�� �̸�
	private Member() {} //����Ʈ ������ Comparator<Member>
	
	public Member(int memberId,String memberName ) {//������
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
	// �ɹ�id�� �ּҰ����� ���.
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		//��ü ���� Ȯ��
		if(obj instanceof Member) {
			//�ٿ�ĳ����
			Member compareKey=(Member)obj;
		
			//this�� number�� compareKey�� memberId���� ������ true �ƴϸ� false
			//this.number -> ���μ� �Ѿ�°�.
			// compareKey.memberId -> ������ ��ü�� ��.
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
		return memberName + "���� ���̵�� " + memberId+ "�Դϴ�.";
	}

	//Comparable
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
//		return (this.memberId - member.memberId); //��������
//		return (this.memberId - member.memberId)*(-1); //��������
		return(this.memberName.compareTo(member.memberName)); //�̸����� ��������
//		return(this.memberName.compareTo(member.memberName))*(-1); //�̸����� ��������
	}

//	@Override
//	public int compare(Member member1, Member member2) { //comparator <E>
//		return (member1.memberId - member2.memberId);
//	}

	

	
	
	
	
}

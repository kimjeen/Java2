package pk26;
import pk26.Member;
import pk26.arraylist.MemberArrayList;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberlee = new Member(1001,"������");
		Member memberlSon = new Member(1002,"�չα�");
		Member memberPark= new Member(1003,"�ڼ���");
		Member memberHong = new Member(1004,"ȫ�浿");
		
		memberArrayList.addMember(memberlee);
		memberArrayList.addMember(memberlSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}

}

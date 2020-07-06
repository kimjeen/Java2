package pk26;
import pk26.Member;
import pk26.arraylist.MemberArrayList;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberlee = new Member(1001,"ÀÌÁö¿ø");
		Member memberlSon = new Member(1002,"¼Õ¹Î±¹");
		Member memberPark= new Member(1003,"¹Ú¼­ÈÍ");
		Member memberHong = new Member(1004,"È«±æµ¿");
		
		memberArrayList.addMember(memberlee);
		memberArrayList.addMember(memberlSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}

}

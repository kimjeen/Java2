package pk26.hashset;

import pk26.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		//�ɹ��ؽ��� ��ü ����
		MemberHashSet memberHashSet = new MemberHashSet();
		//�ɹ� ��ü ����
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�չα�");
		Member memberPark = new Member(1003,"�ڼ���");

		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		
		memberHashSet.showAllMember();
		System.out.println("======================================");
		//��ü �߰�(�ߺ�id)
		//1003�̶�� id�� �ߺ�.
		Member memberHong = new Member(1003,"ȫ�浿");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
	}

}
/* HashSet�� ���� ���Ǵ��Ͽ� �Է��ϴµ�  equals�� hashcode�� ������ ������ ������ 
 * �������� �ߺ� ���θ� �Ǵ��� ���� ��� �ߺ��� ��� �Ѵ�.*/

// String �Ǵ� Integer���� �̹� JDK���� ������ �Ͽ��� JVM(�����Ͻ� �۵�)���� ���� �ϹǷ� �ߺ��� �����.

// ������ compable�� ���Ͽ� ������ ���־�� �����ϴ�.(String �Ǵ� Integer���� �̹� �Ǿ� ����.)




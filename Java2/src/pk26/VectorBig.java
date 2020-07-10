package pk26;

import java.util.Scanner;
import java.util.Vector;

//-1�� �Էµɶ����� vector�� �ڷ�(Integer)�����ϰ� �ִ밪�� ����ϴ� �˰���.

public class VectorBig {
	
	public static void printBig(Vector<Integer> v) {
		//�� ����� �������� ù��°�� ������ �ִ밪���� �����.
		int big= v.get(0);
		
		for(int i=0;i<v.size();i++) {
			if(big<v.get(i)) { //�� ū���� ã������ ���Ǵ�
				big=v.get(i);  //ū���� big�����ٿ� �����ϱ�
			}
		}
		System.out.println("���� ū���� : " +big);
	}
	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<Integer>();
		//��ĵ
		Scanner s= new Scanner(System.in);
		System.out.println("���� �Է�(-1�� �ԷµǸ� ����) ");
		while(true) {
			int num = s.nextInt();
			if(num==-1) {
				break;
			}
			v.add(num); 
		}
		if(v.size()==0) {
			System.out.println("�Էµ� ���� ����.");
			s.close();
			return;
		}
		System.out.println("== ���� ū�� ==");
		printBig(v); //���� ū���� ���
		s.close();
	}
	

}

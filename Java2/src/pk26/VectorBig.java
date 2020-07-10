package pk26;

import java.util.Scanner;
import java.util.Vector;

//-1이 입력될때까지 vector에 자료(Integer)저장하고 최대값을 출력하는 알고리즘.

public class VectorBig {
	
	public static void printBig(Vector<Integer> v) {
		//비교 대상이 없음으로 첫번째는 무조건 최대값으로 저장됨.
		int big= v.get(0);
		
		for(int i=0;i<v.size();i++) {
			if(big<v.get(i)) { //더 큰수를 찾기위해 비교판단
				big=v.get(i);  //큰수를 big변수바엥 저장하기
			}
		}
		System.out.println("가장 큰수는 : " +big);
	}
	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<Integer>();
		//스캔
		Scanner s= new Scanner(System.in);
		System.out.println("정수 입력(-1이 입력되면 종료) ");
		while(true) {
			int num = s.nextInt();
			if(num==-1) {
				break;
			}
			v.add(num); 
		}
		if(v.size()==0) {
			System.out.println("입력된 수가 없다.");
			s.close();
			return;
		}
		System.out.println("== 가장 큰수 ==");
		printBig(v); //가장 큰수를 출력
		s.close();
	}
	

}

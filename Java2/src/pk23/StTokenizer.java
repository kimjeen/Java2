package pk23;

import java.util.StringTokenizer;

public class StTokenizer {
	
	public static void main(String[] args) {

		String str = "Have a Nice Day";
		
		// StringTokenizer
		//(자르고 싶은 문자열,자르는 기준문자의 집합,자르는기준을 넣을지말지)
		
		StringTokenizer obj=new StringTokenizer(str," ",false);
		
		
		
		//StringTokenizer.hasMoreToken- Token이 저장되어 있는 배열
		int n=0;
		while(obj.hasMoreTokens()) {
			String t= obj.nextToken();
			System.out.println(t);
			
		}
		
		
		
	}
}

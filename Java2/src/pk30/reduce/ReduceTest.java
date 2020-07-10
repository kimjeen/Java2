package pk30.reduce;

import java.util.Arrays;

public class ReduceTest {

	public static void main(String[] args) {
		//사용자 구현 실습.
		String[] greetings = {"aaaa","bbb","cc","d"};
		
//		1. reduce 문법 (reduce의 문법(초기값,매개변수,실행부)//현업기준 서버단)
//		reduce("",(s1,s2)->
//		{if(s1.getBytes().length >=s2.getBytes().length) {
//			return s1;
//		}
//		else return s2;})
		
//		2. stream에 적용
//		Arrays.stream(greetings).reduce("",(s1,s2)->
//		{if(s1.getBytes().length >=s2.getBytes().length) {
//			return s1;
//		}
//		else return s2;})
		
		
		//3. 결과출력
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->
		{if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}
		else return s2;}));
		
//--------------------------------------------------------------------------------
		
		//BinaryOperator를 구현한 클래스 이용 실습
		//클래스를 이용할때는 초기값 생략 된다.
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
//		reduce(new CompareString().get())
		System.out.println(str);
					
				
	}
}

package pk30.reduce;

import java.util.function.BinaryOperator;

//BinaryOperator 는 @FunctionalInterface이다.(즉 하나의 함수로 구현된다.)
public class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >=s2.getBytes().length) {
			return s1;
		}
		else return s2;
	}
}

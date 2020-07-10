package pk30.lambda;

@FunctionalInterface // 딱하나의 함수만 보유할수 있는 인터페이스(병렬처리)
public interface Add {
	public int add(int x,int y);
}
//@FunctionalInterface : 하나의 인터페이스는 반드시 하나의 함수로만 구성한다.

package pk24;

public class Powder extends Material {
	
	
	
	
	@Override
	public void doPrinting() {
		System.out.println("powder 재료로 출력합니다.");
	}

	@Override
	public String toString() {
		return "재료는 Powder 입니다.";
	}

}

package pk22;

public class Key {
	public int number;
	
	public Key(int number){
		this.number=number;
		
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		//부모객체와 자식객체가 형성되어서 형변환이 가능한지 판단.
		if(obj instanceof Key) {
			//다운 캐스팅으로 obj가 Key클래스의 compareKey로 대입.
			Key compareKey=(Key)obj;
		
			//this의 number와 compareKey의 number값이 같으면 true 아니면 false
			//this.number -> 메인서 넘어온값.
			// compareKey.number -> 생성한 객체의 값.
			if(this.number==compareKey.number) {
				return true;
			}
			else {
				return false;
			}
		}
		
		else {
			return false;
		}
	}
	
	
	
}

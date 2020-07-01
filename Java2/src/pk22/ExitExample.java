package pk22;

public class ExitExample {
	
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				System.exit(i); //프로젝트를 종료
				break;//for문에 대한 종료
			}
		}
		System.out.println("프로젝트 종료");
	}

}

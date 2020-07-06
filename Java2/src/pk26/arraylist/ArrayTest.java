package pk26.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {
	public static void main(String[] args) {
		int iArray[]= {50,40,30,20,10};
		String sArray[] = new String[5];
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		
		Arrays.fill(sArray, "Hi");
		System.out.println(Arrays.toString(sArray));
		
		List<String> city = Arrays.asList("Seoul","Busan","Daejeon","Jeju");
		
		for(int i=0;i<city.size();i++) {
			System.out.println(city.get(i).toString());
		}
		
		
	}

}

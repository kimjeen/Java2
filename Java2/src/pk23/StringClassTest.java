package pk23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class strClass=Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		
		
		//
		for(Constructor num:cons ) {
			System.out.println(num);
		}
		System.out.println();
		
				
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		System.out.println();
		
		Field[] fields=strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		//Person ����
		
		Class strClass1 = Class.forName("pk23.Person");
		Constructor[] cons1 = strClass1.getConstructors();
		System.out.println("Person class ������");
		for(Constructor cc: cons1) {
			System.out.println(cc);
		}
		System.out.println("!!!!!!Person class �޼ҵ�!!!!!!");
		Method[] mth1 = strClass1.getMethods();
		for(Method mm:mth1) {
			System.out.println(mm);
		}
		
		
		
		
		
		
		
		
		
	}
}

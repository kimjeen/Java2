package pk24;


class GenericMyarray<T>{
	private Object[] array2 = new Object[10];
	int i;
	public T add(T obj) {
		return (T)(array2[i++]=obj);
	}
	public Object get(int index) {
		return array2[i];
	}
}

public class GenericMyArrayTest {
	public static void main(String[] args) {

		GenericMyarray<String> myArray1=new GenericMyarray<String>();
		String str=myArray1.add(new String("test"));
		System.out.println(str);
		
		GenericMyarray<Integer> myArray2=new GenericMyarray<Integer>();
		Integer num=myArray2.add(new Integer(100));
		System.out.println(num);
	}
}

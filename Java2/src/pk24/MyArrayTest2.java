package pk24;

class Myarray{
	private Object[] array=new Object[10];
	int i;
	public void add(Object obj) {
		array[i++]=obj;
	}
	public Object get(int index) {
		return array[i];
	}
}
public class MyArrayTest2 {
	public static void main(String[] args) {

		Myarray myArray1=new Myarray();
		myArray1.add(new String("test"));
		String str=(String)myArray1.get(0);//강제형변환
		System.out.println(str);
		
		Myarray myArray2=new Myarray();
		myArray2.add(new Integer(100));
		Integer num=(Integer)myArray2.get(0);//강제형변환
		System.out.println(num);
		
	}

}

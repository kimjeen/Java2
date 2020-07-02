package pk24;
//java 1.5이전 일반
public class ThreePrinter {

	private Object material;

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	
	
	
}

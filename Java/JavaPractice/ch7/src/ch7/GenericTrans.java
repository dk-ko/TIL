package ch7;

class GenericClass<T> {
	private T tparam;
	public T getTparam() {
		return tparam;
	}
	public void setTparam(T tparam){
		this.tparam = tparam;
	}
}

public class GenericTrans {
	public static void main(String[] args) {
		GenericClass<String> gcs = new GenericClass<>();
		gcs.setTparam("generic class");
		System.out.println("반환 값->"+gcs.getTparam());
		
		GenericClass<Integer> gci = new GenericClass<Integer>();
		gci.setTparam(125);
		System.out.println("반환 값->"+gci.getTparam());
		
		GenericClass<Double> gcd = new GenericClass<Double>();
		gcd.setTparam(18.5);
		System.out.println("반환 값->"+gcd.getTparam());
	}
}

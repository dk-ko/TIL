package ch7;

class Utility{
	public static <T> GenericClass<T> gmove(T t){
		GenericClass<T> gt = new GenericClass<T>();
		gt.setTparam(t);
		return gt;
	}
}

public class GenericMethodEx {
	public static void main(String[] args) {
		GenericClass<String> gmex1 = Utility.gmove("java 2");
		String strValue = gmex1.getTparam();
		System.out.println("첫번째 호출방식 : "+strValue);
		
		GenericClass<Integer> gmex2 = Utility.<Integer>gmove(200);
		int intValue = gmex2.getTparam();
		System.out.println("두번째 호출방식 : "+intValue);
	}
}

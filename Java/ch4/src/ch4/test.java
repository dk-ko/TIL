package ch4;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer boxint = new Integer(200);
		Integer boxint2 = new Integer("200");
		//Integer boxint3 = new Integer("abc");
		
		int num = boxint.intValue();
		int num2 = boxint2.intValue();
		//int num3 = boxint3.intValue();
		System.out.println(boxint+boxint2);
		System.out.println(num+num2);
	}

}

package ch6;

public class MyExceptionTest {
	public void myMethod() throws MyException {
		MyException me = new MyException("Exception : wrong format");
		throw me;
	}
	public static void main(String[] args) {
		MyExceptionTest mE = new MyExceptionTest();
		try {
			mE.myMethod();
		} catch (MyException me){
			me.printStackTrace();
		}
	}
}

class MyException extends Exception {
	public MyException() { }
	public MyException(String msg){
		super(msg);
	}
}
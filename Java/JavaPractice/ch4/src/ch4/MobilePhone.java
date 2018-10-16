package ch4;

class Phone{
	void callUp(){
		System.out.println("calling someone");
	}
	void answer(){
		System.out.println("answering a phone");
	}
}
interface Cameralike{
	void takePhoto();
	void viewPhoto();
}

public class MobilePhone extends Phone implements Cameralike {
	public void takePhoto(){
		System.out.println("taking a photo");
	}
	public void viewPhoto(){
		System.out.println("viewing a photo");
	}
	public static void main(String[] args) {
		MobilePhone aMobilePhone = new MobilePhone();
		
		aMobilePhone.callUp();
		aMobilePhone.answer();
		aMobilePhone.takePhoto();
		aMobilePhone.viewPhoto();
		
	}
}

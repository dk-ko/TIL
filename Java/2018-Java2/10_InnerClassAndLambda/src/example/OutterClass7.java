package example;

import javax.swing.JOptionPane;

public class OutterClass7 extends OutterClass{
	String message = "class7";
	
	public OutterClass7(){
		super();
		
		getButton().addActionListener(e-> 
		{JOptionPane.showMessageDialog(OutterClass7.this, message);});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutterClass7 window = new OutterClass7();
		window.setVisible(true);
	}

}

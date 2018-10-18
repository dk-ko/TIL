package example;

import javax.swing.JOptionPane;

public class OutterClass8 extends OutterClass{
	
	String message = "class 8";
	
	public OutterClass8 () {
		super();
		
		getButton().addActionListener(e->JOptionPane.showMessageDialog(OutterClass8.this, message));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutterClass8 window = new OutterClass8();
		window.setVisible(true);
	}

}

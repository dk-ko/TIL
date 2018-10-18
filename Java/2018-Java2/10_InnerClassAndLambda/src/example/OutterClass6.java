package example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class OutterClass6 extends OutterClass{

	String message = "click";

	public OutterClass6(){
		super();
		getButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(OutterClass6.this, message);
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutterClass6 window = new OutterClass6();
		window.setVisible(true);
	}
}

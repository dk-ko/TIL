package example;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OutterClass extends JFrame{
	protected JButton button;

	public OutterClass() {
		setBounds(100,100,450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		button = new JButton("button");
		button.setBounds(100,100,100,30);
		getContentPane().add(button);
	}
	
	protected JButton getButton(){
		return this.button;
	}
}

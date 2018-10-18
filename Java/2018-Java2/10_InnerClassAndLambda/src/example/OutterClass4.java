package example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OutterClass4 extends JFrame{
	
	String message = "click";
	
	public OutterClass4(){
		setBounds(100,100,450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("button");
		button.setBounds(100,100,100,30);
		getContentPane().add(button);
		
		ActionListener listener = new MyActionListener();
		button.addActionListener(listener);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutterClass4 window = new OutterClass4();
		window.setVisible(true);
	}
	
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(OutterClass4.this,message);
		}
	}

}

package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void run() {
		JFrame frame=new JFrame();
		JButton button=new JButton();
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		button.setText("Click to get a fortune");
	     System.out.println("Button clicked");
	     
	    
	     
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int rand=new Random().nextInt(5);
		printFortune( rand);
	}
	public void printFortune(int fortune) {
		if(fortune==0) {
		JOptionPane.showMessageDialog(null, "You have a Big brain");	
		}
		if(fortune==1) {
			JOptionPane.showMessageDialog(null, "You will have good luck");
		}
		if(fortune==2) {
			JOptionPane.showMessageDialog(null, "Today is not your lucky day");
		}
		if(fortune==3) {
			JOptionPane.showMessageDialog(null, "You will win a Github sticker today");
		}
		if(fortune==4) {
			JOptionPane.showMessageDialog(null, "You have a Small brain");
		}
	}
	
	
		// TODO Auto-generated method stub
		
}
	



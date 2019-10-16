package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button=new JButton();
	JButton buttontwo=new JButton();
	JButton buttonthree=new JButton();
	public void run() {
JFrame frame= new JFrame();
JPanel panel=new JPanel();
panel.add(button);
panel.add(buttonthree);
panel.add(buttontwo);
button.setText("Click for cute video about ducks.");
buttontwo.setText("Click for cute video about frogs.");
buttonthree.setText("Click for cute video about unicorns.");
button.addActionListener(this);
buttontwo.addActionListener(this);
buttonthree.addActionListener(this);
frame.add(panel);
frame.setVisible(true);
frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			showDucks();
		}
		if(e.getSource()==buttontwo) {
			showFrog();
		}
		if(e.getSource()==buttonthree) {
			showFluffyUnicorns();
		}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}

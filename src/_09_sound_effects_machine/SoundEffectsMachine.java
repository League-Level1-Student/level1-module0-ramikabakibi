package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SoundEffectsMachine implements ActionListener{
	JButton button=new JButton();
	JButton buttontwo=new JButton();
	JButton buttonthree=new JButton();
	public void run() {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	button.setText("Play for Rooster Crow");
	buttontwo.setText("Play for some guy saying woohoo!");
	buttonthree.setText("Play for evil laugh");
	buttontwo.addActionListener(this);
	buttonthree.addActionListener(this);
	panel.add(buttontwo);
	panel.add(buttonthree);
	button.addActionListener(this);
	frame.setVisible(true);
	panel.add(button);
	frame.add(panel);
	frame.pack();
	
}
private void playSound(String fileName) {

    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

    sound.play();

}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			playSound("rooster.wav");
		}
		if(e.getSource()==buttontwo) {
			playSound("wohoo.wav");
		}
		if(e.getSource()==buttonthree) {
			playSound("laugh.wav");
		}
	}

}

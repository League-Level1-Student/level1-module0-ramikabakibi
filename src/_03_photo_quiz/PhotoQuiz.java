package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String string = "https://bulinews.com/i/640/1397.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component comp;
		// 3. use the "createImage()" method below to initialize your Component
		comp = createImage(string);

		// 4. add the image to the quiz window
		quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("Who is the manager of Man United?");

		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("Jose Mourinho")) {
			JOptionPane.showMessageDialog(null, "CORRECT");

		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line
		// of code)
		String s = "https://www.telegraph.co.uk/content/dam/football/2019/04/21/TELEMMGLPICT000194750402_trans_NvBQzQNjv4BqOnF-pGyuMayIW5_daymjxrEu4odvKfIxFVccPQZWyAc.jpeg?imwidth=450";
		Component c;
		c = createImage(s);
		// 11. add the second image to the quiz window
		quizWindow.add(c);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String b = JOptionPane.showInputDialog("Who is the manager of Man City?");
		if (b.equals("Pep Guardiola")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}

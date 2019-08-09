package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob= new Robot();
	
void drawHouse(int height){
	rob.penDown();
	rob.setPenColor(Color.red);
	rob.setPenWidth(5);
	rob.setSpeed(40);
	rob.move(height);
	rob.turn(90);
	rob.move(40);
	rob.turn(90);
	rob.move(height);
	rob.turn(270);
	rob.setPenWidth(7);
	rob.setPenColor(Color.GREEN);
	rob.move(50);
	rob.turn(270);
}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Houses b =new Houses();
rob.setX(10);
rob.setY(500);
for(int i=0;i<10;i++) {
	b.drawHouse();
//I'm on number 4	
}


	}

}

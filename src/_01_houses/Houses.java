package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob= new Robot();
	void drawHouse(Color color) {
		Random rand= new Random();
		int x=rand.nextInt(3);
		if(x==0) {
			rob.setPenColor(Color.red);
		}
		if(x==1) {
			rob.setPenColor(Color.GREEN);
		}
		if(x==2) {
			rob.setPenColor(Color.blue);
		}
		//on number 6
	}
void drawHouse(int height, Color color ){
	rob.penDown();
	rob.setPenColor(color);
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
void drawHouse(String height) {
	if(height.equals("small")) {
		drawHouse(60);
	}
	else if(height.equals("medium")){
		drawHouse(120);
	}
	else if(height.equals("large")) {
		drawHouse(250);
	}
 }

void drawHouses() {
	Houses b =new Houses();
	rob.setX(10);
	rob.setY(500);

	Random rand= new Random();
	for(int i=0;i<9;i++) {
		int j=rand.nextInt(3);
		if(j==0) {
		drawHouse("small");
		}
		else if(j==1) {
			drawHouse("medium");
		}
		else if(j==2) {
		drawHouse("large");
		}
		
		
	}


		}


		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Houses().drawHouses();


	}

}

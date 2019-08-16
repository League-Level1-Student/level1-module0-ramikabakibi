package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob= new Robot();
	Color getHouseColor() {
		Random rand= new Random();
		int x=rand.nextInt(3);
		Color color=Color.black;
		if(x==0) {
			color =Color.blue;
		}
		if(x==1) {
			color =Color.red;
		}
		if(x==2) {
			color = Color.green;
		}
		return color;
		
	}
	void drawHouses() {
		Houses b =new Houses();
		rob.setX(10);
		rob.setY(500);

		Random rand= new Random();
		for(int i=0;i<9;i++) {
			int j=rand.nextInt(3);
			if(j==0) {
			drawHouse("small", getHouseColor());
			}
			else if(j==1) {
				drawHouse("medium", getHouseColor());
			}
			else if(j==2) {
			drawHouse("large", getHouseColor());
			}
			
			
		}


			}

void drawHouse(String height, Color color ){
	rob.penDown();
	rob.setPenColor(color);
	rob.setPenWidth(5);
	rob.setSpeed(40);
	if(height.equals("small")) {
		rob.move(60);
		drawPointyRoof();
	}
	else if(height.equals("medium")){
		rob.move(120);
		drawPointyRoof();
	}
	else if(height.equals("large")) {
		rob.move(250);
		drawFlatRoof();
	}
	
	
	if(height.equals("small")) {
		rob.move(60);
	}
	else if(height.equals("medium")){
		rob.move(120);
	}
	else if(height.equals("large")) {
		rob.move(250);
	}
	
	rob.turn(270);
	rob.setPenWidth(7);
	rob.setPenColor(Color.GREEN);
	rob.move(50);
	rob.turn(270);
}
void  drawPointyRoof(){
	 rob.turn(45);
		rob.move(40);
		rob.turn(90);
		rob.move(40);
		rob.turn(45);
}
void drawFlatRoof() {
rob.turn(90);
rob.move(40);
rob.turn(90);
}

 




		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Houses().drawHouses();


	}

}

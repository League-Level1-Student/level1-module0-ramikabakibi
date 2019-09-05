int paddleX;
PImage backgroundImage;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
int paddleY;
int y=(int)random(1000-10)+10;
int yspeed=-10;
int speed=10;
int x;


void setup(){
size(700,700);
background(0);
minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
backgroundImage=loadImage("image.jpg");
backgroundImage.resize(width,height);
}

void draw(){
  int paddleX=mouseX;
  int paddleY=690;
  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, width, height);
  fill(#20BC55);
  stroke(#20BC55);
  rect(paddleX,paddleY,230,200);
  fill(#E3292C);
  stroke(#E3292C);
  
  ellipse(x+=speed,y+=yspeed,25,25);
  
  if(x>=width){
    speed=-10;
    
    
  }
  else if(x==0){
    
 speed=10;   
}
if(y<=0){
  yspeed=10;
}
else if(y>height){

  intersects(x, y, paddleX, paddleY, 230);
  yspeed=-10;
}

}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}

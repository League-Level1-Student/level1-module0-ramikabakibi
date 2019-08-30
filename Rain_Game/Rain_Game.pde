int y;
int randomNumber=(int) random(1000);
int score=0;
void setup() {
  size(1000, 1000);
}

void draw() {

  background(#7B5BA7);
  fill(#02AEF0);
  stroke(#02AEF0);
  ellipse(randomNumber, y+=15, 30, 30);
  if (y>1000) {
    checkCatch(randomNumber);
    y=0;

    randomNumber= (int) random(1000);
  }
  fill(#98A0A2);
  stroke(#98A0A2);
  rect(mouseX, 929, 90, 70);

  fill(0, 0, 0);
  textSize(16);
  text("Score:" +score, 20, 20);
}


void checkCatch(int x) {

  if (x > mouseX && x < mouseX+100) {

    score++;
    println("Your schdkdhakdj");
  } else if (score > 0) 
    score--;

  println("Your score is now: " + score);
}

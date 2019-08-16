PImage pictureOfRecord;
int amountToRotate=800;
void setup(){
  size(700,700);                                 //in setup method
        pictureOfRecord= loadImage("Record.jpeg");
        pictureOfRecord.resize(700,700);
}

 void draw(){
 image(pictureOfRecord, 0, 0);
   if(mousePressed){
  rotateImage(pictureOfRecord, amountToRotate);
  image(pictureOfRecord, 0, 0);
  amountToRotate=amountToRotate+60;
  }
  
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
//on number 7
   
     

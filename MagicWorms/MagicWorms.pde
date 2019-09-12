float maxX;
float maxY;
float x=0.0;
float y=0.0;
void setup(){
  
  size(1000,1000);
  background(#000000);
  
}

void draw(){
  for(int i=0; i<300;i++){
    fill(#EA1313);
    
    ellipse( getWormX(i),getWormY(i),40,40);
makeMagical(frameCount, (int)i);
  }

 
  
}
float frequency = 10;
    float noiseInterval = PI;

    void makeMagical(int red, int green) {
        fill( red, green, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }

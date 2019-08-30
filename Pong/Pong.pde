int x;
void setup(){
size(1000,1000);
background(0);
}

void draw(){
  fill(#E3292C);
  stroke(#E3292C);
  background(0);
  ellipse(x+=10,500,25,25);
  if(x>=1000){
    
    ellipse(x-=10,500,25,25);
  }
}
//on number 6

void setup(){
  size(500,500);
}
void draw(){
  background(#FFFFFF);
  noStroke();
  fill(#FF0000);
  ellipse(150,200,150,150);
  ellipse(212,200,150,150);
  fill(#55AA00);
  rect(176,103,12,32);
  if(mousePressed){
    fill(#FFFFFF);   
    ellipse(80,200,30,30);
  }  
}
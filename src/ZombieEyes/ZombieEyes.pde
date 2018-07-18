void setup(){
  size(1160,629);
  PImage face = loadImage("trump.jpeg");
  image(face,0,0);
face.resize(300,300);
}
void draw(){
  fill(mouseX,mouseY);
  ellipse(570,195,20,20);
  ellipse(698,175,20,20);
  fill(#000000);
ellipse(570,195,9,9);
ellipse(698,175,9,9);

}
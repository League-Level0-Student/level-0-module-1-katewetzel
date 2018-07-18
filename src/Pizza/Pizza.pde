import ddf.minim.*;
Minim minim;
AudioPlayer sound;
void setup(){
  size(500,500); 
  fill(#FFBB77);
  ellipse(250,250,200,200);
  fill(#FF3300);
  ellipse(250,250,175,175);
  fill(#FFCC33);
  ellipse(250,250,165,165);
  minim = new Minim(this);
  sound = minim.loadFile("244655__greenvwbeetle__pop-1.flac");
}
void draw(){
  PImage pepperoni = loadImage("pepperoni.ppm.gif");
  pepperoni.resize(10,10);
  image(pepperoni,200,200);
  PImage bacon = loadImage("baconbit.ppm.gif");
  bacon.resize(10,10);
  image(bacon,209,211);
  if(mousePressed) {
    image(pepperoni,mouseX,mouseY);
    image(bacon,mouseX+9,mouseY+11);
    sound.play();
    sound.rewind();
  }
    
  
}
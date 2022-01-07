import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  int sizeX = 600;
  int sizeY = 600;
  int circleX;
  int circleY;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(sizeX, sizeY);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	
    
  for(int i = 0; i <= sizeX/2; i ++){
    line(i, sizeY/2, i, sizeY);
    stroke(0 + i +1);
  } 
  stroke(0);
  fill(212,15,125);
  for(int lineX = sizeX/20; lineX < sizeX/2; lineX += (sizeX/20)){
    if(lineX == sizeX/2){
      fill(255);
    }
    line(lineX, 0, lineX, height/2);
    
  }

  for(int lineY = sizeY/20; lineY <= height/2; lineY += (sizeY/20)){
    line(0, lineY, sizeX/2, lineY);
  }

  for( circleX = sizeX/10; circleX <= sizeX/2; circleX += (sizeX/12)){      
    for( circleY = sizeY/10; circleY <= sizeY/2; circleY += (sizeY/12)){
    ellipse(circleX + (30 * sizeX)/62, circleY - (sizeX*2)/180, sizeX/18, sizeX/18);
  }

  }
  translate(3*sizeX/4, 3*sizeX/4);
  for(int o = 0; o < 8; o++){
    rotate(TWO_PI/8);
    fill(219,93,52);
    stroke(0);
    ellipse(0,0,sizeX/20,sizeX/3);
    fill(38,108,45);
    stroke(38,108,45);
    ellipse(0, 0, sizeX*875/10000, sizeX*875/10000);
  }

  }
}
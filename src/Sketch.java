import processing.core.PApplet;

// This is the main class that runs the Processing sketch
public class Sketch extends PApplet {
    // Processing sketch code goes here
    public void settings() {
        size(800, 400);
    }

    public void draw() {
    // unscramble these lines
    background(250, 235, 210);
    fill(240, 130, 30);
    rect(192, 145, 16, 35);
    noStroke();
    ellipse(200, 250, 130, 160);
    stroke(170, 80, 10);
    ellipse(225, 160, 40, 20);
    fill(120, 80, 50);
    ellipse(140, 250, 120, 150);
    noStroke();
    strokeWeight(3);
    fill(80, 120, 50);
    rect(0, 320, 400, 80);
    ellipse(260, 250, 120, 150);
    }

}

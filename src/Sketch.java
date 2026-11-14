import processing.core.PApplet;

// This is the main class that runs the Processing sketch
public class Sketch extends PApplet {
    // Processing sketch code goes here

    public void settings() {
        fullScreen(1);
        // size(800, 400);
    }

    public void setup() {

    }

    public void draw() {
        // unscramble these lines
        background(250, 235, 210);
        noStroke(); // no outline for shapes
        fill(120, 80, 50); // brown
        rect(0, 320, 400, 80); // ground
        fill(240, 130, 30); // orange
        strokeWeight(3); // set outline thickness
        stroke(170, 80, 10); // brown outline
        ellipse(140, 250, 120, 150); // left pumpkin
        ellipse(260, 250, 120, 150); // right pumpkin
        ellipse(200, 250, 130, 160); // middle pumpkin
        noStroke(); // no outline for shapes
        fill(80, 120, 50); // green
        rect(192, 145, 16, 35); // stem
        ellipse(225, 160, 40, 20); // leaf
    }
}

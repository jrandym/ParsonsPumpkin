import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        // XRender draws a black canvas on the dev container's VNC display; must be set before AWT starts
        System.setProperty("sun.java2d.xrender", "false");
		// String[] appletArgs = new String[] { "Sketch" };
		// PApplet.main(appletArgs);
        PApplet.main("Sketch");
    }
}
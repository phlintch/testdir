package test;
import easygraphics.EasyGraphics;
public class test extends EasyGraphics {
	public static void main (String[] args) {
		launch(args);
	}
	public void run() {
		int i = 0;
		makeWindow("Test",500,500);
		setSpeed(1);
		do {
			
	     setColor(0, 0, 255);
	     int bl� = fillRectangle(50, 50, 250, 100);
	     setColor(0, 255, 0);
	     int gr�nn = fillRectangle(150,50, 250, 100);
	     setColor(255,0,0);
	     int r�d = fillRectangle(250,50, 250, 100);
	     moveRectangle(bl�, 200, 50);
	     moveRectangle(gr�nn, 200, 150);
	     moveRectangle(r�d, 200, 250);
	     i++;
		} while (i < 10);
	}
}

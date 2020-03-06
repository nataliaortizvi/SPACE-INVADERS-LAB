package View;

import Model.Juego;
import processing.core.PApplet;

public class Main extends PApplet {
	
	Screen2View start;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");
	}
	public void settings () {
		size (700, 700);
		
	}
	
	public void setup () {
		start = new Screen2View(this);
		
	}
	
	public void draw () {
	background(120,180,350);
	start.inicioJuego();
	
	}
	
	public void mousePressed() {
	start.inicioRaton();
		
	}
	
	public void keyPressed() {
	start.inicioTecla();
	}
		
}

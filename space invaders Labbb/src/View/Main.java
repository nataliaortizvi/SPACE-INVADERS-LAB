package View;

import Model.Juego;
import processing.core.PApplet;

public class Main extends PApplet {
	
	Juego game;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");
	}
	public void settings () {
		size (700, 700);
		
	}
	
	public void setup () {
		game = new Juego(this);
		
	}
	
	public void draw () {
	background(120,180,350);
	game.ejecutar();
	
	}
	
	public void mousePressed() {
	game.mouse();
		
	}
	
	public void keyPressed() {
	game.key();
	}
		
}

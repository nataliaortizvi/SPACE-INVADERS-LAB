package View;

import processing.core.PApplet;

public class Main extends PApplet {
	
	Screen1View start;
	Screen2View game;
	Screen3View end;
	int pant;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");
	}
	public void settings () {
		size (700, 700);
		
	}
	
	public void setup () {
		start = new Screen1View(this);
		game = new Screen2View(this);
		end = new Screen3View(this);
		pant = 0;
		
	}
	
	public void draw () {
		switch(pant) {
		case 0:
			//pantalla de inicio
			start.inicio();
			fill(255);
			textSize(75);
			text("SPACE INVADERS", 50, 300);
			fill(250);
			noStroke();
			rect(250,350, 200,80);
			if(mouseX > 250 && mouseX < 450 && mouseY > 350 && mouseY < 430) {
				fill(355,0,0);
				rect(250,350, 200,80);
			}
			fill(0);
			textSize(40);
			text("PLAY", 300, 400);
			
			break;
		case 1:
			//pantalla de juego
			game.inicioJuego();
			
			break;
		case 2:
			//pantalla de ganaste o perdiste
			end.inicioFinal();
			
			break;
		}	
	//start.inicioJuego();
	
	}
	
	public void mousePressed() {
		switch(pant) {
		case 0:
			if(mouseX > 250 && mouseX < 450 && mouseY > 350 && mouseY < 430) {
			pant = 1;
			}
			
			break;
		case 1:
			break;
		case 2:
			break;
		}
		
	}
	
	public void keyPressed() {
	game.inicioTecla();
	}
		
}

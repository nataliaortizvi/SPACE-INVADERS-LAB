package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Juego {
	public PApplet app;
	int screen;
	ArrayList<Enemigo> enemigos;
	Heroe h;
	
	public Heroe getH() {
		return h;
	}
	
	public Juego(PApplet app) {
		this.app = app;
		screen = 0;
		
		//se crean personaes del juego
		h = new Heroe(350,640,app);
		enemigos = new ArrayList<>();
		
		//se recorre el arrelgo de enemigos para crear bastantes
		for(int i = 0; i<enemigos.size(); i++) {
			enemigos.get(i).pintar();
			enemigos.get(i).mover();
		
			enemigos.add (new Enemigo(5,50,app));
			}	
	}
	
	public void ejecutar() {
		
		switch(screen) {
		case 0:
			//pantalla de inicio
			app.background(230,340,23);
			break;
		case 1:
			//pantalla de juego
			app.background(240,30,123);
			
			h.pintar();
			
			for (int i = 0; i < enemigos.size(); i++) {
			enemigos.get(i).pintar();
			enemigos.get(i).mover();
			}
			
			break;
		case 2:
			//pantalla de ganaste o perdiste
			app.background(330,40,93);
			break;
		}	
	}
	
	public void mouse() {
		switch(screen) {
		case 0:
			screen = 1;
			break;
		case 1:
			
			break;
		case 2:
			
			break;
		}
	}
	
	public void key() {
		h.keyPressed();
	}
	
	
	
	
}

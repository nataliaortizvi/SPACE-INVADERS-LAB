package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Juego {
	PApplet app;
	ArrayList<Enemigo> enemigos;
	Heroe h;
	
	public Juego(PApplet app) {
		this.app = app;
		
		//se crean personajes del juego
		h = new Heroe(350,640,app);
		enemigos = new ArrayList<>();
		
		//se recorre el arreglo de enemigos para crear bastantes
		for(int i = 0; i < 12; i++) {
			enemigos.add(new Enemigo(70 * i,50,app));
			//enemigos.add(new Enemigo(70 * i, 80, app));
			///enemigos.add(new Enemigo(70 * i, 110, app));
		}	
	}

	public void ejecutarInicio() {
		//pantalla inicio
		app.background(0);
		app.fill(255);
		//app.text("PLAY", 300,350);
		//app.textSize(30);
		//app.text("PLAY", 100, 100);
		app.noStroke();
		app.rect(250, app.height/2, 200,80);
	}
	
	public void ejecutarJuego() {
		//pantalla de juego
		app.background(0);
		
		h.pintar();
		
		for (int i = 0; i < enemigos.size(); i++) {
		enemigos.get(i).pintar();
		enemigos.get(i).mover();
			
		System.out.println(enemigos.get(i).getPosY());
			
		//if(enemigos.get(i).getPosY() > 43000) {
		//	screen = 2;
		//}
			//System.out.println(enemigos.size());

		}
			
		for (int i = 0; i < h.getBalas().size(); i++) {
			for (int j = 0; j < enemigos.size(); j++) {
				if(PApplet.dist(h.getBalas().get(i).getX(), h.getBalas().get(i).getY(), enemigos.get(j).getPosX()+25,						enemigos.get(j).getPosY())<25) {
						
				enemigos.remove(j);
				//h.getBalas().get(i).splice(1,i);	
				h.getBalas().get(i).setX(5000);
			}
		}
	}
}	
	
	public void ejecutarFinal() {
		//pantalla de ganaste o perdiste
		app.background(330,40,93);
	}
	
	
	/*public void mouse() {
		switch(screen) {
		case 0:
			screen = 1;
			break;
		case 1:
			
			break;
		case 2:
			
			break;
		}
	}*/
	
	public void key() {
		h.keyPressed();
	}

	public Heroe getH() {
		return h;
	}
	
	
	
	
}

package Model;



import static processing.core.PConstants.ENTER;
import static processing.core.PConstants.LEFT;
import static processing.core.PConstants.RIGHT;

import java.util.ArrayList;

import Model.Bala;
import processing.core.PApplet;

public class Heroe {
	int posX;
	int posY;
	int tam;
	int vel;
	PApplet app;
	
	ArrayList<Bala> balas;
	
	public Heroe(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam = 25;
		this.vel = 10;
		this.app = app;
		balas = new ArrayList<>();
	}
	
	public void pintar() {
		app.fill(22,340,120);
		app.noStroke();
		app.rect(this.posX,this.posY,this.tam+50,this.tam);
		for (int i = 0; i < balas.size(); i++) {
			balas.get(i).pintar();
		}
	}
	
	public void moverDerecha () {
		if(this.posX < 625) {
			this.posX += this.vel;
		}else {
			this.posX += 0;
		}
	}
	public void moverIzquierda () {
		if(this.posX < 0) {
			this.posX -= 0;
		}else {
			this.posX -= this.vel;
		}
	}
	
	public void keyPressed() {
		if (app.keyCode == RIGHT) {
			moverDerecha();
		}
		if (app.keyCode == LEFT) {
			moverIzquierda();
		}
		if (app.keyCode== ENTER) {
			disparar();
		}
	}
	public void setBalas(ArrayList<Bala>balas) {
		this.balas = balas;
	}
	public ArrayList<Bala> getBalas() {
		return balas;
	}

	public void disparar() {
		Bala b = new Bala(this.posX, this.posY,app);
		balas.add(b);
		System.out.println(balas.size());
	}

	
	//getters y setters
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	

}

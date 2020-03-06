package Model;

import processing.core.PApplet;

public class Bala {
	int x;
	int y;
	int tam;
	int vel;
	PApplet app;
	
	public Bala(int x, int y, PApplet app) {
		this.x = x;
		this.y = y;
		this.tam = 20;
		this.vel = 5;
		this.app = app;
	}
	
	public void pintar() {
		disparar();
	}
	
	public void disparar () {
		app.fill(35,100,330);
		app.ellipse(this.x, this.y, this.tam, this.tam);
		this.y -= this.vel;
	}
	
	
	
	
	//getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
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

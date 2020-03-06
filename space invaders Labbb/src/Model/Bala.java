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
		this.x = x;
		this.tam = 50;
		this.vel = 6;
		this.app = app;
	}
	
	public void Pintar() {
		app.fill(35,100,330);
		app.ellipse(this.x, this.y, this.tam, this.tam);
	}
	
	
	//getters and setters
	public void mover () {
		this.x -= this.vel;
	}

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

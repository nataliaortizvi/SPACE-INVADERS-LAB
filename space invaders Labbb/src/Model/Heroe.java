package Model;

import processing.core.PApplet;

public class Heroe {
	int posX;
	int posY;
	int tam;
	int vel;
	PApplet app;
	
	public Heroe(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam = 50;
		this.vel = 2;
		this.app = app;
	}
	
	public void Pintar() {
		app.fill(355,100,30);
		app.rect(350,400,this.tam*50,this.tam);
	}
	
	public void moverDerecha () {
		if(this.posX < 600) {
			this.posX += this.vel;
		}else {
			this.posX -= 0;
		}
	}
	public void moverIzquierda () {
		if(this.posY < 0) {
			this.posY += this.vel;
		}else {
			this.posY -= 0;
		}
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

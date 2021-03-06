package Model;

import processing.core.PApplet;

public class Enemigo {
	int posX;
	int posY;
	int tam;
	int vel;
	PApplet app;
	
	public Enemigo(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam = 50;
		this.vel = 8;
		this.app = app;
	}
	
	public void pintar() {
		app.fill(235,100,330);
		app.rect(this.posX, this.posY, this.tam, this.tam-30);
	}
	
	public void mover() {
		this.posX += this.vel;
		
		if(this.posX >= 670) {
			this.posY += 90;
			this.vel *= -1;
		}else if(this.posX <= 0) {
			this.posY += 90;
			this.vel *= -1;
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

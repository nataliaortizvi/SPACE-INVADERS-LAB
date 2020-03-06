package Controller;

import Model.Juego;
import processing.core.PApplet;

public class Screen3Controller {
	PApplet app;
	Juego logicaJuego;
	
	public Screen3Controller(PApplet app) {
		this.app = app;
		this.logicaJuego = new Juego(app);
		
	}
	
	public void iniciar() {
		logicaJuego.ejecutarFinal();
	}
	
}

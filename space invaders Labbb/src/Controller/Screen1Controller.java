package Controller;

import Model.Juego;
import processing.core.PApplet;

public class Screen1Controller {
	PApplet app;
	Juego logicaJuego;
	
	public Screen1Controller(PApplet app) {
		this.app = app;
		this.logicaJuego = new Juego(app);
		
	}
	
	public void iniciar() {
		logicaJuego.ejecutarInicio();
	}
	
}

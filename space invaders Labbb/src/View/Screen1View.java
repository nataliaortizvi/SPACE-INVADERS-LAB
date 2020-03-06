package View;

import Controller.Screen1Controller;
import processing.core.PApplet;

public class Screen1View {
	PApplet app;
	Screen1Controller controlador;
	
	public Screen1View(PApplet app) {
		this.app = app;
		this.controlador = new Screen1Controller(app);
	}
	
	public void inicio(){
		controlador.iniciar();
	}

}

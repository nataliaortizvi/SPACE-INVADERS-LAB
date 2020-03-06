package View;

import Controller.Screen3Controller;
import processing.core.PApplet;

public class Screen3View {
	PApplet app;
	Screen3Controller controlador;
	
	public Screen3View(PApplet app) {
		this.app = app;
		this.controlador = new Screen3Controller(app);
		
	}
	
	public void inicioFinal(){
		controlador.iniciar();
	}

}

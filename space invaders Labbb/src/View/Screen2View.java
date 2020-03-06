package View;

import Controller.Screen2Controller;
import processing.core.PApplet;

public class Screen2View {
	
	PApplet app;
	Screen2Controller controlador;
	
	public Screen2View(PApplet app) {
		this.app = app;
		this.controlador = new Screen2Controller(app);
		
	}
	
	public void inicioJuego(){
		controlador.iniciar();
	}
	public void inicioTecla() {
		controlador.tecla();
	}
	public void inicioRaton() {
		controlador.raton();
	}
	

}

package controlador;

import interfaz.PanelA;
import mundo.MundoA;

public class Controlador {
	
	private MundoA mia;
	private PanelA pnlA;
	
	public Controlador() {
		mia = new MundoA();
	}
	
	public void aceptar () {
		mia.aceptar();
		pnlA.estadoSwitch();
	}
	
	public void cancelar () {
		mia.cancelar();
		pnlA.estadoSwitch();
	}
	
	public void estadoSwitch() {
		mia.estadoSwitch();
	}

	public void setSwitch(boolean switch1) {
		mia.setSwitch(switch1);
	}
	
	public void conectar (PanelA pnlA) {
		this.pnlA = pnlA;
	}

}

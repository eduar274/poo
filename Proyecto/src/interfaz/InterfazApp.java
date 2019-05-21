package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazApp extends JFrame{
	
	PanelA pnlA;
	Controlador ctrl;

	public InterfazApp(Controlador ctrl) {
		this.ctrl = new Controlador();
		pnlA = new PanelA(ctrl);
		ctrl.conectar(pnlA);
		
		setSize(500,500);
		setTitle("Interfaz");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		pnlA.setBounds(45, 60, 300, 300);
		add(pnlA);
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		InterfazApp frmMain = new InterfazApp(new Controlador());
		frmMain.setVisible(true);
	}

}

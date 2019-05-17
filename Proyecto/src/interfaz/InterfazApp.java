package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class InterfazApp extends JFrame implements ActionListener{
	
	PanelA pnlA;

	public InterfazApp() {
		// TODO Auto-generated constructor stub
		pnlA = new PanelA();
		
		setSize(500,500);
		setTitle("Qué se dice Padrecito");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		pnlA.setBounds(45, 60, 300, 300);
		add(pnlA);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		InterfazApp frmMain = new InterfazApp();
		frmMain.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

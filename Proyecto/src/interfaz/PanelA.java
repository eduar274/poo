
package interfaz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class PanelA extends JPanel implements ActionListener{
	
	Controlador ctrl;
	
	JLabel a = new JLabel("");
	JButton aceptar = new JButton("Aceptar");
	JButton cancelar = new JButton("Cancelar");


	public PanelA(Controlador ctrl){
		
		this.ctrl = ctrl;
		
		setSize(500,500);
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("TEZ")));
		a.setBounds(10, 10, 100, 30);
		a.setFont(new Font(null, Font.ITALIC, 12));
		
		aceptar.setBounds(10,80, 280, 30);
		aceptar.addActionListener(this);
		add(aceptar);
		
		cancelar.setBounds(10,120, 280, 30);
		cancelar.addActionListener(this);
		add(cancelar);
	}
	
	public void estadoSwitch() {
		ctrl.estadoSwitch();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase(aceptar.getText())) {
			ctrl.aceptar();
			
		}else {
			if(e.getActionCommand().equalsIgnoreCase(cancelar.getText())) {
				ctrl.cancelar();
				
			}
		}
	}
}

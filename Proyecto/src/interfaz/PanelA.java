
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

public class PanelA extends JPanel implements ActionListener{
	
	JLabel a = new JLabel("Nooooo");
	JLabel b= new JLabel("Moooo");
	
	JButton c = new JButton("(☞ﾟ∀ﾟ)☞");
	JButton d = new JButton("(☞ﾟ∀ﾟ)☞");
	JButton f = new JButton("ᕙ(⇀‸↼‶)ᕗ");
	static boolean x = false;
	static boolean y = false;
	static boolean z = false;

	public PanelA(){
		setSize(500,500);
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("TEZ")));
		a.setBounds(10, 10, 100, 30);
		a.setFont(new Font(null, Font.ITALIC, 12));
		//add(a);
		
		//add(b);
		c.setBounds(10,80, 280, 30);
		c.addActionListener(this);
		add(c);
		d.setBounds(15, 15, 100, 30);
		add(d);
		f.setBounds(35, 200, 100, 30);
		add(f);
		f.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase(c.getText())) {

			if(x) {
				d.setVisible(true);
				x = false;
			}else {
				d.setVisible(false);
				x = true;
			}
		}else {
			if(e.getActionCommand().equalsIgnoreCase(d.getText())) {

				if(y) {
					f.setVisible(true);
					y = false;
				}else {
					f.setVisible(false);
					y = true;
				}
			}else {
				if(e.getActionCommand().equalsIgnoreCase(f.getText())) {

					if(z) {
						c.setVisible(true);
						z = false;
					}else {
						c.setVisible(false);
						z = true;
					}
				}
			}
		}
		
		
	}
}

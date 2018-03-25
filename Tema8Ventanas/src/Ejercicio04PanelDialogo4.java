import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejercicio04PanelDialogo4 extends JFrame {

	public static void main(String[] args) {
		
		Object[] options= {"Futurama","Los Simpson","Héroes"};
		
		
		JOptionPane.showOptionDialog(null, "Haz click en tu serie favorita", "Eleccion de serie", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options, null);

	}

}
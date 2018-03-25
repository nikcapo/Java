import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * 
 * @author nik
 */
public class Ejercicio01PanelDialogo extends JFrame {
	/**
	 * Method that creates a showConfirmDialog window with 2 opciones...
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?", "Confirmacion de formateo",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

	}

}

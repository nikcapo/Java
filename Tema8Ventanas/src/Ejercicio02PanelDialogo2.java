import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejercicio02PanelDialogo2 extends JFrame {

	public static void main(String[] args) {
		JOptionPane.showInputDialog(null, "Escribe tu DNI:", "Confirmacion de identidad", JOptionPane.QUESTION_MESSAGE);

	}

}
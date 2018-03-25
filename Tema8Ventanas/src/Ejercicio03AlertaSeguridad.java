import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejercicio03AlertaSeguridad extends JFrame {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Se ha detectado un escaneo de red desde la IP 192.168.1.51",
				"Alerta de seguridad", JOptionPane.WARNING_MESSAGE);
	}

}

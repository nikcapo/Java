import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.jws.Oneway;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Ejercicio4Formulario extends JFrame {
	public Ejercicio4Formulario() {
		super("Comentarios");
		setSize(300, 180);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lblComnt = new JLabel("Deja un comentario");
		add(lblComnt);

		JTextArea txtComnt = new JTextArea("En un lugar de La Mancha, de cuyo nombre...");

		txtComnt.setWrapStyleWord(true);
		txtComnt.setPreferredSize(new Dimension(288, 100));

		JScrollPane scrPanel = new JScrollPane(txtComnt);
		scrPanel.setPreferredSize(new Dimension(250, 100));
		add(scrPanel);

		JButton btnEnviar = new JButton("Enviar");
		add(btnEnviar);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejercicio4Formulario e = new Ejercicio4Formulario();

	}

}

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

public class Ejercicio3BarrasProgreso extends JFrame {
	public Ejercicio3BarrasProgreso() {
		super("Parámetros críticos");
		setSize(320, 120);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JProgressBar pbCombustible = new JProgressBar();
		pbCombustible.setStringPainted(true);
		pbCombustible.setMaximum(100);
		pbCombustible.setMinimum(0);
		pbCombustible.setValue(20);
		pbCombustible.setForeground(Color.red);
		
		JProgressBar pbPresionMotor1 = new JProgressBar();
		pbPresionMotor1.setStringPainted(true);
		pbPresionMotor1.setMaximum(100);
		pbPresionMotor1.setMinimum(0);
		pbPresionMotor1.setValue(75);
		pbPresionMotor1.setForeground(new Color(0, 190, 0));
		
		JProgressBar pbPresionMotor2 = new JProgressBar();
		pbPresionMotor2.setStringPainted(true);
		pbPresionMotor2.setMaximum(100);
		pbPresionMotor2.setMinimum(0);
		pbPresionMotor2.setValue(75);
		pbPresionMotor2.setForeground(new Color(0, 190, 0));
		
		JLabel lblCombustible = new JLabel("Combustible");
		JLabel lblPresionMotor1 = new JLabel("Presión motor 1");
		JLabel lblPresionMotor2 = new JLabel("Presión motor 2");
		
		add(pbCombustible);
		add(lblCombustible);
		
		add(pbPresionMotor1);
		add(lblPresionMotor1);
		
		add(pbPresionMotor2);
		add(lblPresionMotor2);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Ejercicio3BarrasProgreso e = new Ejercicio3BarrasProgreso();

	}

}

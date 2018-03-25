import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.jws.Oneway;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class Ejercicio2ControlDeslizante2 extends JFrame{
	public Ejercicio2ControlDeslizante2() {
		super("Termostato");
		setSize(300,300);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSlider sldBarra = new JSlider();
		add(sldBarra);
		JLabel lblTemp = new JLabel("Temperatura (ºC)");
		add(lblTemp);
		sldBarra.setMaximum(25);
		sldBarra.setMinimum(0);
		sldBarra.setValue(17);
		sldBarra.setMajorTickSpacing(5);
		sldBarra.setMinorTickSpacing(1);
		sldBarra.setPaintTicks(true);
		sldBarra.setPaintLabels(true);
		sldBarra.setLocation(40,10);
		sldBarra.setPreferredSize(new Dimension(50, 290));
		sldBarra.setOrientation(SwingConstants.VERTICAL);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		Ejercicio2ControlDeslizante2 e = new Ejercicio2ControlDeslizante2();

	}

}

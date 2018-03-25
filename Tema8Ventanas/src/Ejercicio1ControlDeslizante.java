import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.jws.Oneway;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class Ejercicio1ControlDeslizante extends JFrame{
	public Ejercicio1ControlDeslizante() {
		super("Velocidad de crucero");
		setSize(300,50);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JSlider sldBarra = new JSlider();
		add(sldBarra);
		sldBarra.setMaximum(120);
		sldBarra.setMinimum(10);
		sldBarra.setValue(90);
		sldBarra.setMajorTickSpacing(20);
		sldBarra.setMinorTickSpacing(5);
		sldBarra.setPaintTicks(true);
		sldBarra.setPaintLabels(true);
		sldBarra.setPreferredSize(new Dimension(290, 40));
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		Ejercicio1ControlDeslizante e = new Ejercicio1ControlDeslizante();

	}

}

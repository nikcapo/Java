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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

public class Ejercicio2Lista extends JFrame {
	public Ejercicio2Lista() {
		super("Seleccion de modelo");
		setSize(300, 160);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblModel = new JLabel("¿Modelo?");
		
		
		
		
		String modelos[]= {"Peugeot","Volkswagen","Renault","Seat","Ferrari","Porsche","Jauguar","Dacia"};
		JList<String> listModelos = new JList<String>(modelos);
		
		
		JScrollPane scrollList = new JScrollPane(listModelos);
		
		add(scrollList);
		scrollList.setPreferredSize(new Dimension(110, 135));
		add(lblModel);
		
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Ejercicio2Lista e = new Ejercicio2Lista();

	}

}

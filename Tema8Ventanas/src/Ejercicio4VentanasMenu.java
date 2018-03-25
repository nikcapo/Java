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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

public class Ejercicio4VentanasMenu extends JFrame {
	public Ejercicio4VentanasMenu() {
		super("Asistente matemático");
		setSize(320, 150);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenu menuAritmetica = new JMenu("Aritmética");
		JMenu menuCalculo = new JMenu("Cálculo");
		
		JMenuItem itemSuma = new JMenuItem("Suma");
		JMenuItem itemResta = new JMenuItem("Resta");
		JMenuItem itemMult = new JMenuItem("Multiplicación");
		JMenuItem itemDiv = new JMenuItem("División");
		JMenuItem itemPorcent = new JMenuItem("Porcentaje");
		
		menuAritmetica.add(itemSuma);
		menuAritmetica.add(itemResta);
		menuAritmetica.addSeparator();
		menuAritmetica.add(itemMult);
		menuAritmetica.add(itemDiv);
		menuAritmetica.addSeparator();
		menuAritmetica.add(itemPorcent);
		
		JMenuItem itemDeri = new JMenuItem("Derivada");
		JMenuItem itemInte = new JMenuItem("Integral");
		JMenuItem itemPoli = new JMenuItem("Polinomio de Taylor");
		JMenuItem itemEcu = new JMenuItem("Ecuación diferencial");
		
		menuCalculo.add(itemDeri);
		menuCalculo.add(itemInte);
		menuCalculo.addSeparator();
		menuCalculo.add(itemPoli);
		menuCalculo.add(itemEcu);
		
		JMenuBar barra = new JMenuBar();
		barra.add(menuAritmetica);
		barra.add(menuCalculo);
		
		setJMenuBar(barra);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Ejercicio4VentanasMenu e = new Ejercicio4VentanasMenu();

	}

}

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

public class Ejercicio5Pestanyas extends JFrame {
	public Ejercicio5Pestanyas() {
		super("Opciones de la aplicación");
		setSize(300, 200);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panEditor = new JPanel(new FlowLayout(FlowLayout.LEFT));
		ImageIcon editorIcon = new ImageIcon("Iconos/73.png");
		JCheckBox chkResaltar = new JCheckBox("Resaltar palabras clave");
		JCheckBox chkGuardar = new JCheckBox("Guardar como xml");
		
		panEditor.add(chkResaltar);
		panEditor.add(chkGuardar);
		
		JPanel panVentanas = new JPanel(new FlowLayout(FlowLayout.LEFT));
		ImageIcon ventanasIcon = new ImageIcon("Iconos/65.png");
		JCheckBox chkLaterales = new JCheckBox("Mostrar barras laterales");
		JCheckBox chkMenus = new JCheckBox("Mostrar barra de menús");
		panVentanas.add(chkLaterales);
		panVentanas.add(chkMenus);
		
		
		JTabbedPane pestanyas= new JTabbedPane();
		pestanyas.addTab("Editor",editorIcon,panEditor);
		pestanyas.addTab("Ventanas",ventanasIcon ,panVentanas);
		pestanyas.setPreferredSize(new Dimension(290, 170));
		add(pestanyas);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Ejercicio5Pestanyas e = new Ejercicio5Pestanyas();

	}

}

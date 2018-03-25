import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Ejercicio1Toolbar extends JFrame {
	public Ejercicio1Toolbar() {
		super("Planifiador personal");
		setSize(400, 180);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icnFile= new ImageIcon("Iconos/1.png");
		ImageIcon icnStats= new ImageIcon("Iconos/11.png");
		ImageIcon icnSave= new ImageIcon("Iconos/22.png");
		ImageIcon icnIdea= new ImageIcon("Iconos/3.png");
		
		ImageIcon icnCalen= new ImageIcon("Iconos/44.png");
		ImageIcon icnCam= new ImageIcon("Iconos/66.png");
		ImageIcon icnTv= new ImageIcon("Iconos/67.png");
		ImageIcon icnTool= new ImageIcon("Iconos/73.png");
		
		JButton btnFile = new JButton(icnFile);
		JButton btnStats = new JButton(icnStats);
		JButton btnSave = new JButton(icnSave);
		JButton btnIdea = new JButton(icnIdea);
		
		JButton btnCalen= new JButton(icnCalen);
		JButton btnCam = new JButton(icnCam);
		JButton btnTv = new JButton(icnTv);
		JButton btnTool = new JButton(icnTool);
		
		JToolBar barra = new JToolBar();
		barra.add(btnFile);
		barra.add(btnStats);
		barra.add(btnSave);
		barra.add(btnIdea);
		barra.addSeparator();
		barra.add(btnCalen);
		barra.add(btnCam);
		barra.add(btnTv);
		barra.addSeparator();
		barra.add(btnTool);
		
		add(barra);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Ejercicio1Toolbar e = new Ejercicio1Toolbar();

	}

}

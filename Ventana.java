import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.color.*;
import javax.swing.JFrame;

public class Ventana extends JFrame {

	public Ventana() {
		super("Polígonos"); 											//Nombre de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//Terminar programa al cerrar ventana
		MyPanel pd=new MyPanel();										//Crear objeto del panel
		this.add(pd);													//Agregar panel
		this.add(new PanelControles(pd), BorderLayout.WEST);			//Agregar panel hacia la izquierda
		this.pack();										
		int pantallaX=(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();				//Ancho
		int pantallaY=(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();				//Largo
		this.setLocation(((pantallaX-this.getWidth())/2), ((pantallaY-this.getHeight())/2));	//Centrar la ventana
		this.setVisible(true);																	//Hacer visible la ventana
	}
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();								//Crea una ventana nueva
	}
}

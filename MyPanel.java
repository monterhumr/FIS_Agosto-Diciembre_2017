import java.awt.Font;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;


public class MyPanel extends JPanel{
	private JLabel lPrint;												//Etiqueta
	
	public MyPanel() {
		super();
		this.setPreferredSize(new Dimension(100,150));
		this.lPrint = new JLabel("");									//Label
		this.add(this.lPrint);
	}
	
	public void setLPrint(String s){
		this.lPrint.setText("<html>Perimetro<br>"+s+"</html>");
	}
}

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane; 

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

public class PanelControles extends JPanel implements ActionListener
{
	private JLabel lAdd;				//Etiqueta
	private JLabel lX;
	private JLabel lY;
	
	private JTextField tfX;			//Ingresar coordenadas
	private JTextField tfY;	
	
	private JButton bAceptar;			//Botón normal
	
	
	private ArrayList<double[]> a;
	
	private MyPanel pd;													//Crear un panel nuevo
	
	public PanelControles(MyPanel pd){
		super();
		this.setPreferredSize(new Dimension(150,150));					//Dimension de este panel
		this.pd=pd;														//Agregar el panel principal
		this.lAdd = new JLabel("Agregar vertice siguiente");			//Label
		this.lX = new JLabel("     X:");								//Label
		this.lY = new JLabel("     Y:");								//Label
		this.a=new ArrayList<>();
		this.a.trimToSize();
		
		this.tfX=new JTextField(10);									//Text-field X
		this.tfX.addActionListener(this);
		
		this.tfY=new JTextField(10);									//Text-field Y
		this.tfY.addActionListener(this);

		this.bAceptar=new JButton("Terminar poligono");					//Botón normal
		this.bAceptar.addActionListener(this);					  		//Que lo escuchen :V
		
									
		this.add(this.lAdd);											//Agregar los botones al panel
		this.add(this.lX);
		this.add(this.tfX);
		this.add(this.lY);
		this.add(this.tfY);
		this.add(this.bAceptar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {						//BOTONES AQUI
		if(e.getSource()==this.bAceptar){								//BOTON ACEPTAR
			if(a.size()>2){
				Poligonos p= new Poligonos(a);
				pd.setLPrint(p.polyP());
				this.a=new ArrayList<>();
				this.a.trimToSize();
			}
			else{
				JOptionPane.showMessageDialog(null, "Los vertices ingresados no son suficientes para crear un poligono");
			}
		}else{
			double[] d={Double.parseDouble(tfX.getText()),Double.parseDouble(tfY.getText())};
			tfX.setText("");
			tfY.setText("");
			int i=0; 
			while(i<a.size()){
				if(d[0]==(a.get(i))[0]&&d[1]==(a.get(i))[1]){
					JOptionPane.showMessageDialog(null, "Vertice ya ingresado, ingrese otro vertice porfavor");
					break;
				}
				i++;
			}
			if(i==a.size())
				a.add(d);
		}
		
	}
}

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Poligonos {
	private ArrayList<double []> poligono;
	
	public Poligonos(){
		this(null);
	}
	
	public Poligonos(ArrayList<double []> poli){
		this.poligono=poli;
	}
	
	public String polyP(){
		return polyP(poligono);
	}
	
	private static String polyP(ArrayList<double []> c){
		int i=0;
		double coordstore=0;
		double [] x1=c.get(1);
		double [] inicio=c.get(0);
		while (i<c.size()){
			x1=c.get(i);
			if (i+1<c.size()){
				double [] x2=c.get(i+1);
				coordstore+= Math.sqrt((Math.pow(x2[0]-x1[0], 2))+(Math.pow(x2[1]-x1[1], 2)));
			}
			i++;
		}
		coordstore+= Math.sqrt((Math.pow(inicio[0]-x1[0], 2))+(Math.pow(inicio[1]-x1[1], 2)));
		DecimalFormat numlen = new DecimalFormat("#.00");
		return numlen.format(coordstore);
	}
}

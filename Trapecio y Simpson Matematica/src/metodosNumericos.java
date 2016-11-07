import java.util.ArrayList;

public class metodosNumericos{
	
	/*Declaro constantes con los datos que plantea el problema*/
	public static final double h0=5.20;
	public static final double h1=1.10;
	public static final double p0=1000*h0;
	public static final double p1=1000*h1;

	
	
	/*Metodo para calcular una funcion-se le pasa un valor "x" para que pueda realizar el calculo*/
	public ArrayList<Double> calcularFuncion(double a,double b,int n,double l){
		
		double h=(b-a)/n;
		double fx=0;
		ArrayList<Double> iteraciones=new ArrayList<Double>();
		
		for(int i=0;i<=n;i++){
			double x=a+i*h;
			fx=p1+(p0-p1)/Math.PI*Math.acos(2*x/l);
			iteraciones.add(fx);
			
		}
		
		return iteraciones;
	}
	
public ArrayList<Double> calcularFuncion2(double a,double b,int n,double l){
		
		double h=(b-a)/n;
		double fx=0;
		ArrayList<Double> iteraciones2=new ArrayList<Double>();
		
		for(int i=0;i<=n;i++){
			double x=a+i*h;
			fx=(p1+(p0-p1)/Math.PI*Math.acos(2*x/l))*x;
			iteraciones2.add(fx);
		}
		
		return iteraciones2;
	}
		
	/*Metodo que resuelve a traves de la formula del trapecio*/
	public double trapecio(ArrayList<Double> miVector,double a,double b,int n){
		
		double resultado;
		double h=(b-a)/n; 
		double sumatoria=0;	
	
		for(int i=1;i<n;i++){			
			sumatoria=sumatoria+(2*miVector.get(i));
			
		}	
		resultado=(h/2)*(miVector.get(0)+sumatoria+miVector.get(n));
		
		return resultado;
	}

	
	/*Metodo para calcular a traves del metodo de simpson*/
	public double simpson(ArrayList<Double> miVector,double a,double b,int n){
		
		double resultado=0;
		double h=(b-a)/n;
		double sumatoria=0;
		
		for(int i=1;i<=n-2;i+=3){
			sumatoria=sumatoria+3*(miVector.get(i));	
		}
		
		for(int i=2;i<=n-1;i+=3){
			sumatoria=sumatoria+3*(miVector.get(i));
		}
		
		for(int i=3;i<=n-3;i+=3){	
			sumatoria=sumatoria+2*(miVector.get(i));
						
		}
		
		resultado=(3.0/8.0)*h*(miVector.get(0)+sumatoria+miVector.get(n));
		
		
		return resultado;
	}
	
}
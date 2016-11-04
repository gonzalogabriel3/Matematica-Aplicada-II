import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio{
	
	
	
	public static void main(String[] args) {
		
	DecimalFormat cantDecimales=new DecimalFormat("000.00");	
			
	/*Inicializo dos variables que cada una va a contener el resultado de los metodos*/
	double resultadoTrapecio1;
	double resultadoTrapecio2;
	double resultadoSimpson1;
	double resultadoSimpson2;
	metodosNumericos mtn= new metodosNumericos();
	ArrayList<Double> miVector=new ArrayList<Double>();
	ArrayList<Double> miVector2=new ArrayList<Double>();
	
	
	Scanner in=new Scanner(System.in);
	Scanner in2=new Scanner(System.in);
	Scanner in3=new Scanner(System.in);
	Scanner in4=new Scanner(System.in);
	
	int opcion=1;
	System.out.println("Ingrese valor de L");
	double l=in.nextDouble();
	System.out.println("Ingrese valor de n");
	int n=in.nextInt();
	
	do{
	
	if(opcion==3){
	System.out.println("Ingrese valor de L");
	l=in.nextDouble();
	
	System.out.println("Ingrese valor de n");
	n=in.nextInt();
	
	}
	miVector=mtn.calcularFuncion(-l/2, l/2,n,l);
	miVector2=mtn.calcularFuncion2(-l/2, l/2,n,l);
	
	System.out.println("Que metodo desea usar: \n[1]Trapecio  [2]Simpson  [3]Volver a ingresar valor de L [0]Salir");
	opcion=in4.nextInt();
		if(opcion==1){
			resultadoTrapecio1=mtn.trapecio(miVector,-l/2,l/2,n);
			resultadoTrapecio2=mtn.trapecio(miVector2, -l/2, l/2,n);
			
			System.out.println("Resultado obtenido con el metodo del trapecio:"+cantDecimales.format(resultadoTrapecio1)+"\n");
			System.out.println("Resultado obtenido con el metodo del trapecio 2:"+cantDecimales.format(resultadoTrapecio2)+"\n");
			
		}else if(opcion==2){
			resultadoSimpson1=mtn.simpson(miVector,-l/2,l/2,n);
			resultadoSimpson2=mtn.simpson(miVector2,-l/2,l/2,n);
			
			System.out.println("Resultado obtenido con el metodo de simpson: "+cantDecimales.format(resultadoSimpson1)+"\n");
			System.out.println("Resultado obtenido con el metodo de simpson 2: "+cantDecimales.format(resultadoSimpson2)+"\n");
		}
		
	
	
	}while(opcion!=0);
	
	System.out.println("FIN PROGRAMA!!!");
	
	}
		
}

package empresapantojaandres;
import java.util.Scanner;

public class Tecnico extends Personal {
	double bonificacion = 400; int selec;
	double sueldo;
	
	Scanner dls = new Scanner (System.in);
	int nivelt;
	

	public Tecnico(String nombre, int edad, int aniost, String genero, long cedula, int nivelt) {
		super(nombre, edad, aniost, genero, cedula);
		this.nivelt = nivelt;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void datospagos() {
		System.out.println("Ingreseque nivel del titulo del tecnico: ");
		nivelt = dls.nextInt();
		System.out.println("el nivel del tecnico es: "+nivelt);
		System.out.println("Ingrese cuanto cobra normalmente: ");
		sueldo = dls.nextDouble();
		System.out.println("Puntualidad del tecnico");
		System.out.println("1: LLega temprano ");
		System.out.println("2: LLega tarde");

		 selec = dls.nextInt();
		switch (selec) {
		case 1:
			incentivos();
		case 2:
			incentivos2();		
		}
		

		
	}
	public void incentivos() {
		if (nivelt>=3 && selec==1) {
			sueldo = sueldo+sueldo*0.10+bonificacion;
			System.out.println("Su sueldo con bonificacion es: "+ sueldo);
		}else if (nivelt>=3 && selec==2) {
			sueldo = sueldo+sueldo*0.10;
			System.out.println("Su sueldo con bonificacion es: "+ sueldo);
		}else {
			System.out.println("Su sueldo con bonificacion es: "+ sueldo);
		}
	}
	public void incentivos2() {
		if (nivelt>=3 && selec==2) {
			sueldo = sueldo+sueldo*0.10+bonificacion;
			System.out.println("Su sueldo con bonificacion es: "+ sueldo);
		}else if (nivelt>=3 && selec==2) {
			sueldo = sueldo+sueldo*0.10;
			System.out.println("Su sueldo con bonificacion es: "+ sueldo);
		}else {
			System.out.println("Su sueldo con bonificacion es: "+ sueldo);
		}
	}

}

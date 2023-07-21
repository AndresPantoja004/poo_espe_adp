package empresapantojaandres;

public class Docente extends Personal {
	int asignatura;
	double bonificacion = 400; int puntual;
	double sueldo;

	public Docente(String nombre, int edad, int aniost, String genero, long cedula, int asignatura) {
		super(nombre, edad, aniost, genero, cedula);
		this.asignatura= asignatura;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void datospagos() {
		System.out.println("Ingreseque la asignatura que imparte: ");
		System.out.println("1: Calculo ");
		System.out.println("2: POO ");
		System.out.println("3: Cultura Ambiental ");
		asignatura = dls.nextInt();

		System.out.println("La asignatura que imparte: "+asignatura);
		System.out.println("Ingrese cuanto cobra normalmente: ");
		sueldo = dls.nextDouble();
		System.out.println("Puntualidad del Profesor");
		System.out.println("1: LLega temprano ");
		System.out.println("2: LLega tarde");
		 puntual = dls.nextInt();
		 incentivos();
		
		

		
	}
	public void incentivos() {
		if (asignatura==2 && puntual==1) {
			sueldo = sueldo+sueldo*0.10+bonificacion;
			System.out.println("Su sueldo con bonificacion es: "+ sueldo);
		}else if (asignatura==1 && puntual==1) {
			sueldo = sueldo+sueldo*0.10;
			System.out.println("Su sueldo es: "+ sueldo);
		}else if (asignatura==1 && puntual==1) {
			System.out.println("Su sueldo con bonificacion es: "+ sueldo);
		}else {
			System.out.println("Su sueldo es: "+ sueldo);		
	}
	
	}
}

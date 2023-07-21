package empresapantojaandres;

public class Limpieza extends Personal {
	int cuartosencarg; int basura;
	double sueldo; double bonificacion = 325.5;

	public Limpieza(String nombre, int edad, int aniost, String genero, long cedula) {
		super(nombre, edad, aniost, genero, cedula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void datospagos() {
		System.out.println("Ingrese cuantos cuartos tiene a cargo: ");
		cuartosencarg = dls.nextInt();
		System.out.println("Cuartos quee tiene a su cargo "+cuartosencarg);
		System.out.println("Ingrese cuanto cobra normalmente: ");
		sueldo = dls.nextDouble();
		System.out.println("Basura encontrada en los cuartos a cargo");
		System.out.println("1: Muy poca ");
		System.out.println("2: Mucha");
		basura = dls.nextInt();
		 incentivos();
	}
	public void incentivos () {
		if (basura==1) {
			sueldo = sueldo+sueldo*0.35*bonificacion;
			System.out.println("Su sueldo con bonificacion por buena limpieza es: "+sueldo+"$");
		}else if (basura==2) {
			sueldo = sueldo+sueldo*0.35*bonificacion;
			System.out.println("Su sueldo sin bonificaicon por mala limpieza: "+sueldo+"$");
		}else {
			System.out.println("No existe la opcion");
		}
	}

}

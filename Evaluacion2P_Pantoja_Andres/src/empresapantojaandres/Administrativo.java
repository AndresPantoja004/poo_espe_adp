package empresapantojaandres;

public class Administrativo extends Personal {
	int personalac; double bonificacion= 525.5;
	double sueldo;
	int comport;

	public Administrativo(String nombre, int edad, int aniost, String genero, long cedula, int personalc) {
		super(nombre, edad, aniost, genero, cedula);
		this.personalac = personalac;
	}

	@Override
	public void datospagos() {
		System.out.println("Ingrese cuanta gente tiene a cargo: ");
		personalac = dls.nextInt();
		System.out.println("La gente a cargo que tiene es de: "+personalac);
		System.out.println("Ingrese cuanto cobra normalmente: ");
		sueldo = dls.nextDouble();
		System.out.println("Como ha sido el comportamiento del administrativo");
		System.out.println("1: Respetuoso ");
		System.out.println("2: Maleducado");
		comport = dls.nextInt();
		 incentivos();
		
	}
	public void incentivos () {
		if (comport==1) {
			sueldo = sueldo + bonificacion + sueldo*0.5;
			
		}else if (comport==2){
			sueldo = sueldo - sueldo*0.2;
		}else {
			System.out.println("No existe esa opcion");
		}
		
	}

}

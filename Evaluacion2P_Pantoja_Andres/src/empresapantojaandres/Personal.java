package empresapantojaandres;
import java.util.Scanner;
	public abstract class Personal {
		Scanner dls = new Scanner (System.in);
		private String nombre;
		private int edad;
		private int aniost;
		private String genero;
		private long cedula;
		
		public Personal (String nombre, int edad, int aniost, String genero, long cedula) {
			this.nombre=nombre;
			this.aniost=aniost;
			this.cedula=cedula;
			this.edad=edad;
			this.genero=genero;
			
		}
		
		public double getCedula() {
			System.out.println("Ingrese su cedula: ");
			cedula = dls.nextLong();
			return cedula;
		}

		public void setCedula(long cedula) {
			this.cedula = cedula;
		}
		
		public double getAniost() {
			System.out.println("Ingrese años trabajados: ");
			aniost = dls.nextInt();
			return aniost;
		}

		public void setAniost(int aniost) {
			this.aniost = aniost;
		}

		public String getNombre() {
			System.out.println("Ingrese nombre: ");
			nombre = dls.next();
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			System.out.println("Ingrese su edad: ");
			edad = dls.nextInt();
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getGenero() {
			System.out.println("Ingrese su genero: ");
			genero = dls.next();
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}
		public abstract void datospagos ();

}

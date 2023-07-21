package empresapantojaandres;

import java.util.Scanner;

public class Empresas {

	public static void main(String[] args) {
		Mostrardatos(new Docente(null, 0, 0, null, 0, 0));
		Mostrardatos(new Tecnico(null, 0, 0, null,0, 0));
		Mostrardatos(new Docente(null, 0, 0, null,0, 0));
		Mostrardatos(new Limpieza(null, 0, 0,null, 0));
	
	}
	
	private static void Mostrardatos(Personal p) {
		int selec;
		Scanner dls = new Scanner (System.in);
		
		System.out.println("======Menu Empresa=====");
		System.out.println("1: Docente");
		System.out.println("2: Tecnico");
		System.out.println("3: Administrativo");
		System.out.println("4: Limpieza");
		System.out.println("========================");
		selec = dls.nextInt();
		
		switch (selec) {
		case 1:
			System.out.println("El nombre es: "+p.getNombre());
			System.out.println("La edad es: "+p.getEdad());
			System.out.println("Años trabajados: "+p.getAniost());
			System.out.println("SU genero es: "+p.getGenero());
			System.out.println("Su cedula es "+p.getCedula());
			p.datospagos();
			break;
		case 2:
			System.out.println("El nombre es: "+p.getNombre());
			System.out.println("La edad es: "+p.getEdad());
			System.out.println("Años trabajados: "+p.getAniost());
			System.out.println("SU genero es: "+p.getGenero());
			System.out.println("Su cedula es "+p.getCedula());
			p.datospagos();
			
			break;
		case 3:
			System.out.println("El nombre es: "+p.getNombre());
			System.out.println("La edad es: "+p.getEdad());
			System.out.println("Años trabajados: "+p.getAniost());
			System.out.println("SU genero es: "+p.getGenero());
			System.out.println("Su cedula es "+p.getCedula());
			p.datospagos();
			break;
		case 4: 
			System.out.println("El nombre es: "+p.getNombre());
			System.out.println("La edad es: "+p.getEdad());
			System.out.println("Años trabajados: "+p.getAniost());
			System.out.println("SU genero es: "+p.getGenero());
			System.out.println("Su cedula es "+p.getCedula());
			p.datospagos();
			break;
		}
		
	}

}

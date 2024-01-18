package prueba;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String nombre;
		
		String continuar = "SI";
		
		int posicion = 0;
		
		int valorPremio = 0;
		
		boolean muerto = false;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca su nombre: ");
		nombre = sc.nextLine();
		
		Ruleta ruleta = new Ruleta (nombre);
		
		// Llamamos a la función para cargar el cargador
		ruleta.cargaCargador();
		do {
			System.out.println("Procedemos a disparar");
			ruleta.dispara (posicion);
			
			if (ruleta.dispara (posicion)) {
				System.out.println("Acabo tu partida, moriste.");
				muerto = true;
				break;
			} 
			
			valorPremio += 100;
			System.out.println("Te salvaste");
			System.out.println("Has conseguido: " + valorPremio + " euros");
			posicion++;
			if (posicion < 5) {
				System.out.println("¿Quiere continuar? (Cada disparo suma 100 euros) SI    NO");
				continuar = sc.nextLine();
					
			}
			
			

		}while (posicion < 5 && continuar.equalsIgnoreCase("SI"));
		
		
		if (posicion == 5) {
			System.out.println("Enhorabuena" + nombre + ", lograste salvarte de todas las balas, serás recompensado con 500 euros extra");
			System.out.println(nombre + ", has conseguido un total de: " + (valorPremio +=500) + " euros");
		} else if (!muerto) {
			System.out.println(nombre +", has ganado un total de: " + valorPremio + " euros");
		}
		
		sc.close();
	}

}

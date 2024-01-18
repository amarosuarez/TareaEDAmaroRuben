package prueba;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String nombre;
		
		String continuar;
		
		int posicion = 0;
		
		int valorPremio = 0;
		
		boolean muerto = false;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca su nombre: ");
		nombre = sc.nextLine();
		
		Ruleta ruleta = new Ruleta (nombre);
		
		// Llamamos a la función para cargar el cargador
		Ruleta.cargaCargador;
		do {
			System.out.println("Procedemos a disparar");
			Ruleta.dispara (posicion);
			
			if (Ruleta.dispara (posicion)) {
				System.out.println("Acabo tu partida, moriste.");
				muerto = true;
				break;
			} 
			
			valorPremio += 100;
			System.out.println("Te salvaste");
			System.out.println("Has conseguido: " + valorPremio);
			System.out.println("¿Quiere continuar? (Cada disparo suma 100 euros) SI    NO");
			continuar = sc.nextLine();
			
			
			posicion++;
		}while (posicion < 6 && continuar.equalsIgnoreCase("SI"));
		
		
		if (posicion == 6) {
			System.out.println("Enhorabuena lograste salvarte de todas las balas, serás recompensado con 500 euros extra");
			System.out.println("Has conseguido un total de: " + (valorPremio +=500) + " euros");
		} else if (!muerto) {
			System.out.println("Has ganado un total de: " + valorPremio);
		}
	}

}
package prueba;


/***
 * Clase que contiene los métodos para jugar a la ruleta rusa
 * @author Amaro
 * @version 1.0
 */
public class Ruleta {

	/***
	 * Atributo donde se almacena el nombre del jugador
	 */
	String jugador = "";
	
	/***
	 * Atributo que contiene en que posición se encuentra la bala
	 */
	boolean[] cargador = new boolean[6];
	
	/***
	 * Constructor vacío
	 */
	public Ruleta() {}
	
	/**
	 * Constructor con parámetros
	 * @param jugador Parámetro que obtiene el nombre del jugador
	 */
	public Ruleta(String jugador) {
		jugador = this.jugador;
	}
	
	/***
	 * Función que genera la posición donde se almacenará la bala y la almacena en el cargador
	 */
	void cargaCargador() {
		// Variable que genera la posición en la que se encontrará la bala
		int num;
		
		// Variable que almacena si hay bala
		boolean bala = false;
		
		// Generamos la posición
		num = (int) (Math.random() * 6);
		System.out.println(num);
		
		// Bucle para rellenar el cargador
		for (int i=0; i<cargador.length; i++) {
			// Si el cargador se encuentra en la posición generada aleatoriamente significa que tiene bala
			if (i==num) bala = true;
			
			// Almacenamos en el cargador
			cargador[i] = bala;
			
			// Reiniciamos el valor de la bala
			bala = false;
		}
	}
	
	/***
	 * Función que devuelve si la bala es disparada
	 * @param posicion Parametro que obtiene la posición
	 * @return Devolvemos si se dispara la bala o no
	 */
	boolean dispara(int posicion) {
		// Devolvemos el valor de la posición del cargador
		return cargador[posicion];
	}
	
}

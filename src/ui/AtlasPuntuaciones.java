// Análisis (completar)
// Descripción del programa:
// Entradas:
// Salidas:
// Ejemplo:


package ui; // No olvidar especificar el paquete / carpeta de nuestro programa

import java.util.Scanner; // Para poder usar Scanner, debemos importarlo

public class AtlasPuntuaciones {

	// Declaración del Escaner que nos ayudará en todo el programa
	private Scanner escaner;

	// Declaración de nuestras constantes a utilizar
	private static final int
	max_jug = 10;
	private static final int
	max_ron = 5;



	private AtlasPuntuaciones() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{
		
		int canjugadores, canrondas;
		// Declaracion de todas las variables a usar en el programa
		System.out.println("Ingrese el numero de jugadores: ");
		canjugadores = escaner.nextInt();
		
		
		System.out.println("Ingrese el numero de rondas: ");
		canrondas = escaner.nextInt();
		int[] puntua = new int[canrondas];
		int[] sumaPuntajes = new int[canrondas];
		

		for (int i = 0; i < canjugadores; i++) {
			for(int j = 0; j < canrondas; j++) {
				System.out.println("jugador" + (i+1) + "- puntaje en ronda" + (j+1));
				System.out.print(">");
				puntua[i] = escaner.nextInt();
				sumaPuntajes[i] = calcularSumaTotal(puntua, canrondas);
			}
			System.out.println("puntaje" + (i+1) + ":" + sumaPuntajes[i]);
			

			
		}


		// Notificacion al usuario de la solicitud de dato

		// Capturamos el dato con nuestro Scanner (que se llama, escaner)



		// Realizamos los cálculos delegandolos a los métodos


		// Notificación al usuario de los resultados


	}

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}

	/**
	 * Descripción: El método calcularSumaTotal permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public int calcularSumaTotal(int[] numeros, int puntajes) {
        // Completar
		int suma = 0;
		for (int i = 0; i<puntajes; i++) {
			suma += numeros[i];
		}
		


		return suma;
    }

	/**
	 * Descripción: El método calcularPromedio permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public double calcularPromedio(int[] numeros) {
        // Completar
		return 0;
    }

	/**
	 * Descripción: El método encontrarMayor permite ...
	 * @param double[] numeros
	 * @return 
	 */
    public double encontrarMayor(double[] numeros) {
        // Completar
		return 0;
    }

	

	
}
package programacionbasica2;

import java.util.Scanner;

public class InterfazCuentaGanados {
	
	public final static int SI = 1;
	public final static int NO = 0;

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("---- Bienvenido al Cuenta Ganados ----");
		CuentaGanados nuevo = new CuentaGanados();
		
		Integer opciones = 0;
		
		do {
			System.out.println("¿Ha ingresado ganado? SI = 1 ; NO = 0");
			opciones = entrada.nextInt();
			switch(opciones) {
			case SI:
				nuevo.contador();
				break;
			case NO:
				System.out.println("Total de ganado: " + nuevo.getValorActual());
				System.out.println("¿Desea resetear el contador? SI = 1 ; NO = 0");
				Integer reset = entrada.nextInt();
				if(reset == SI) {
					nuevo.resetear();
					System.out.println("El valor actual por reseteo es: " + nuevo.getValorActual());
				} else {
					System.out.println("Hasta un nuevo ingreso.");
				}
				break;
			default:
				System.out.println("Ingrese un valor valido.");
			}
			
		} while(opciones != NO);
		

	}

}

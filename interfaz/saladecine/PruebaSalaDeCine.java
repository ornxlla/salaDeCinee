package saladecine;

import java.util.Scanner;

public class PruebaSalaDeCine {
	public final static int CONSULTAR_SI_ESTA_OCUPADA = 1;
	public final static int OCUPAR_BUTACA = 1;
	public final static int CANTIDAD_DE_BUTACAS_OCUPADAS = 2;
	public final static int ACOMODAR_GRUPO = 3;
	public final static int SALIR = 0;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		SalaDeCine sala = new SalaDeCine("Cinemark");
		System.out.println("Bienvenido a " + sala.getNombreDelCine());
		
		Integer opcion = SALIR;
		
		do {
			System.out.println("Que desea hacer? \n1: Consultar si una butaca esta ocupada \n2: Consultar la cantidad de butacas ocupadas"
					+ "\n3: Acomodar un grupo \n4: Salir");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case CONSULTAR_SI_ESTA_OCUPADA:
				System.out.println("Ingrese la fila");
				int fila = teclado.nextInt();
				System.out.println("Ingrese la columna");
				int columna = teclado.nextInt()-1;
				if(sala.estaOcupada(fila, columna) == false) {
					System.out.println("La butaca no esta ocupada, desea reservarla? 1. Si, 2. No."); 
					int siONo = teclado.nextInt();
					if(siONo == OCUPAR_BUTACA) {
						if(sala.seComproButaca(fila, columna)) {
							System.out.println("Se ocupo la butaca");
							}
						}
					} else {
						System.out.println("Ocurrio un error.");
				}
			case CANTIDAD_DE_BUTACAS_OCUPADAS:
				System.out.println("Las cantidad de butacas ocupadas son: " + sala.cantidadDeButacasOcupadas());
			}
		} while (opcion != SALIR);
	}

}

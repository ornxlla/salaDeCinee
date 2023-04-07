package saladecine;

public class SalaDeCine {
	private Butaca enLaSala[][] = new Butaca [20][15];
	private Integer cantidadDeButacasOcupadas;
	private String nombreDelCine;
	
	public SalaDeCine(String nombreDelCine) {
		this.cantidadDeButacasOcupadas = 0;
		this.nombreDelCine = nombreDelCine;
		this.inicializarMatriz();
	}
	
	
	public String getNombreDelCine() {
		return nombreDelCine;
	}


	public Boolean estaOcupada(Integer fila, Integer columna) {
		Boolean ocupada = enLaSala[fila][columna].getOcupada();
		return ocupada;
	} 
	
	public boolean seComproButaca(Integer fila, Integer columna) {
		Boolean seOcupo = false;
		if(this.estaOcupada(fila, columna) == false) {
			seOcupo = true;
			enLaSala[fila][columna].setOcupada(true);
			this.cantidadDeButacasOcupadas = this.cantidadDeButacasOcupadas + 1;
		} 
		return seOcupo;
	}
	
	public Integer cantidadDeButacasOcupadas() {
		return this.cantidadDeButacasOcupadas;
	}
	
	public void inicializarMatriz() {
		for(int i = 0; i<enLaSala.length; i++) {
			for(int j = 0; j<enLaSala[i].length; j++) {
				if(enLaSala[i][j] == null) {
				enLaSala[i][j] = new Butaca();
				}
			}
		}
	}
}

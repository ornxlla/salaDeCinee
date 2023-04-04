package programacionbasica2;

public class CuentaGanados {

	// ATRIBUTOS
	private final static Integer VALOR_MAXIMO = 9999;
	private final static Integer VALOR_MINIMO = 0;
	private Integer valorActual;
	
	// CONSTRUCTOR
	public CuentaGanados() {
		this.valorActual = CuentaGanados.VALOR_MINIMO;
	}
	
	// METODOS
	public static Integer getValorMaximo() {
		return CuentaGanados.VALOR_MAXIMO;
	}

	public static Integer getValorMinimo() {
		return CuentaGanados.VALOR_MINIMO;
	}

	public Integer getValorActual() {
		return valorActual;
	}
	
	public void contador() {
		if(this.valorActual >= CuentaGanados.VALOR_MINIMO && this.valorActual <= CuentaGanados.VALOR_MAXIMO) {
			this.valorActual = this.valorActual + 1;
		}
	}
	
	public void resetear() {
		this.valorActual = CuentaGanados.VALOR_MINIMO;
	}
}

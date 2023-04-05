package figuras;

public class Rectangulo {

	private Double ancho;
	private Double alto;
	
	private Rectangulo(Double ancho, Double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public Double getPerimetro() {
		return this.ancho*2 + this.alto*2;
	}
	
}

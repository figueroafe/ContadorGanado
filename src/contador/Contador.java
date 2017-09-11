package contador;

public class Contador {
	private int numero;

	public void contar() {
		this.numero++;
	}

	public void reiniciar() {
		this.numero = 0;
	}

	public int mostrar() {
		return this.numero;
	}

}

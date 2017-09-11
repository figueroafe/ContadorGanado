package contador;

public class App {
	public static void main(String[] args) {

		Contador c = new Contador();
		System.out.println(c.mostrar());

		c.contar();
		System.out.println(c.mostrar());

		System.out.println(c.mostrar() == 0);

	}

}

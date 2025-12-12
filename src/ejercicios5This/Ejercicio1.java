package ejercicios5This;

public class Ejercicio1 {
	public void main() {
		Person person;
		person = new Person("Hugo", 19);

		System.out.printf("%s\n", person.toString());

		System.out.println("Solo damos por parametros nombre y edad, lo demas es por defecto.");
	}

	public static void main(String[] args) {
		new Ejercicio1().main();
	}

}

package ejercicios5Constructores;

public class Ejercicio2 {
	public void main() {
		Person2 person;
		person = new Person2("Hugo", 19, 1.63f, "Estudiante");

		System.out.printf("%s", person.toString());
	}

	public static void main(String[] args) {
		new Ejercicio2().main();
	}

}

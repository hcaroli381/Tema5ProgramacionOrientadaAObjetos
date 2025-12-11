package ejercicios5GetYSet;

import java.util.Scanner;

public class Ejercicio1 {
	public void main() {
		String nombre;
		Scanner keyboard = new Scanner(System.in);
		Person hombre = new Person();
		System.out.println("Este es el nombre de la persona : ");
		System.out.printf("%s\n", hombre.getName());

		System.out.println("Introduce el nombre de la persona :");
		nombre = keyboard.nextLine();
		hombre.setName(nombre);
		System.out.println("Este es el nombre de la persona : ");
		System.out.printf("%s\n", hombre.getName());

	}

	public static void main(String[] args) {
		new Ejercicio1().main();
	}

}

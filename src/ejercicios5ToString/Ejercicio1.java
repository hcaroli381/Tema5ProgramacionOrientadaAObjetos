package ejercicios5ToString;

import java.util.Scanner;

public class Ejercicio1 {
	public void main() {
		String name, work;
		int age;
		float height;
		Scanner keyboard = new Scanner(System.in);
		Person person = new Person();

		System.out.println("Introduzca su nombre :");
		name = keyboard.nextLine();
		person.setName(name);

		System.out.println("Introduzca su edad :");
		age = keyboard.nextInt();
		person.setAge(age);

		System.out.println("Introduzca su altura (usa , y no .):");
		height = keyboard.nextFloat();
		person.setHeight(height);

		System.out.println("Introduzca su trabajo :");
		keyboard.nextLine();
		work = keyboard.nextLine();
		person.setWork(work);

		System.out.printf(person.toString());
	}

	public static void main(String[] args) {
		new Ejercicio1().main();
	}

}

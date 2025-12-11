package ejercicios5GetYSet;

import java.util.Scanner;

public class Ejercicio2 {
	public void main() {
		String name, work;
		int age;
		float height;
		Scanner keyboard = new Scanner(System.in);
		Person person = new Person();

		System.out.printf("Su nombre es : %s\nSu edad es : %d\nSu altura es : %.2f\nSu trabajo es : %s\n",
				person.getName(), person.getAge(), person.getHeight(), person.getWork());

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

		System.out.printf("Su nombre es : %s\nSu edad es : %d\nSu altura es : %.2f\nSu trabajo es : %s\n",
				person.getName(), person.getAge(), person.getHeight(), person.getWork());

	}

	public static void main(String[] args) {
		new Ejercicio2().main();
	}

}

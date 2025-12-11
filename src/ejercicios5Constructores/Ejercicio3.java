package ejercicios5Constructores;

import java.util.Scanner;

public class Ejercicio3 {
	Scanner keyboard = new Scanner(System.in);

	public void main() {
		Student student;
		student = new Student(0, null);
		String name;
		int matricula;
		double nota1, nota2;

		System.out.println("Introduce el nombre del alumno :");
		name = keyboard.nextLine();
		student.setName(name);

		System.out.println("Introduce el numero de matricula del alumno :");
		matricula = keyboard.nextInt();
		student.setMatricula(matricula);

		System.out.println("Introduce la primera nota del alumno :");
		keyboard.nextLine();
		nota1 = keyboard.nextDouble();
		student.setNota1(nota1);

		System.out.println("Introduce la segunda nota del alumno :");
		nota2 = keyboard.nextDouble();
		student.setNota2(nota2);

		System.out.printf("%s", student.toString());

	}

	public static void main(String[] args) {
		new Ejercicio3().main();
	}

}

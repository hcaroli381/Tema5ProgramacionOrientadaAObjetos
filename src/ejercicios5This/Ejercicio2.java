package ejercicios5This;

public class Ejercicio2 {
	public void main() {
		Worker worker1, worker2;
		worker1 = new Worker("Hugo", 19, 1.63f, "Programador", 1500.23);
		worker2 = new Worker("Nuria", 18, 1.23f, "Profesora", 2323.23);
		System.out.printf("El salario de %s es : %.2f$\nEl salario de %s es %.2f$\n", worker1.getName(),
				worker1.getSalary(), worker2.getName(), worker2.getSalary());
		System.out.printf("Si sumamos los dos salarios el salario de %s es : %.2f$\n", worker1.getName(),
				worker1.addSalary(worker2));
		System.out.printf("A %s le vamos a doblar el salario, su salario ahora es : %.2f$", worker1.getName(),
				worker1.doubleSalary());
	}

	public static void main(String[] args) {
		new Ejercicio2().main();
	}

}

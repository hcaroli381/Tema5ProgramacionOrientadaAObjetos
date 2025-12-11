package ejercicios5Constructores;

public class Student {
	private int matricula;
	private String name;
	private double nota1;
	private double nota2;

	public Student(int matricula, String name) {
		this.matricula = matricula;
		this.name = name;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getName() {
		return name;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double mediaNotas(double nota1, double nota2) {
		return ((nota1 + nota2) / 2);
	}

	public String toString() {
		return String.format(
				"El nombre del alumno es : %s\nEl numero de matricula de %s es : %d\nLas notas de %s son : %.2f y %.2f\nLa nota media de %s es : %.2f\n",
				name, name, matricula, name, nota1, nota2, name, mediaNotas(nota1, nota2));
	}

}

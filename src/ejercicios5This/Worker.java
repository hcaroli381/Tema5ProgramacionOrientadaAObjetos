package ejercicios5This;

public class Worker

{

	private String name;

	private int age;

	private float height;

	private String work;

	private double salary;

	public Worker(String name, int age, float height, String work, double salary) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.work = work;
		this.salary = salary;
	}

	public Worker(String name, int age, float height, String work) {
		this(name, age, height, work, 1500);
	}

	public Worker(String name, int age, float height) {
		this(name, age, height, "unemployed");
	}

	public Worker(String name, int age) {
		this(name, age, 1.50f);
	}

	public Worker(String name) {
		this(name, 16);
	}

	public Worker() {
		this("unnamed");
	}

	public String getName() {

		return name;

	}

	public int getAge() {
		return age;
	}

	public float getHeight() {
		return height;
	}

	public String getWork() {
		return work;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {

		this.name = name;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double addSalary(Worker worker) {
		return worker.salary + this.salary;
	}

	public double doubleSalary() {
		return addSalary(this);
	}

	public String toString() {
		return String.format(
				"Su nombre es : %s\nSu edad es : %d\nSu altura es : %.2f\nSu trabajo es : %s\nSu salario es %f", name,
				age, height, work, salary);
	}

}
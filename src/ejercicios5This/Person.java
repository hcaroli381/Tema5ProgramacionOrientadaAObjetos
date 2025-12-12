package ejercicios5This;

public class Person

{

	private String name;

	private int age;

	private float height;

	private String work;

	public Person(String name, int age, float height, String work) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.work = work;
	}

	public Person(String name, int age, float height) {
		this(name, age, height, "unemployed");
	}

	public Person(String name, int age) {
		this(name, age, 1.50f);
	}

	public Person(String name) {
		this(name, 16);
	}

	public Person() {
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

	public String toString() {
		return String.format("Su nombre es : %s\nSu edad es : %d\nSu altura es : %.2f\nSu trabajo es : %s\n", name, age,
				height, work);
	}

}
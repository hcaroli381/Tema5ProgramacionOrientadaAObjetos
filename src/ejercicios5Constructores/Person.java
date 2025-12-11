package ejercicios5Constructores;

public class Person

{

	private String name;

	private int age;

	private float height;

	private String work;

	public Person() {
		name = "unnamed";
		age = 0;
		height = 0.0f;
		work = "unemployment";
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
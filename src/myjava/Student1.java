package myjava;

public class Student1 {

	private String name;
	private int age;
	private int rollNimber;
	private String id;

	public Student1(String name, int age, int rollNimber, String id) {
		super();
		this.name = name;
		this.age = age;
		this.rollNimber = rollNimber;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 30 && age < 60) {
			this.age = age;
		}

		else {
			System.out.println("Age not allowed");
		}
	}

	public int getRollNimber() {
		return rollNimber;
	}

	public void setRollNimber(int rollNimber) {
		this.rollNimber = rollNimber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", rollNimber=" + rollNimber + ", id=" + id + "]";
	}
	
	void study(String s1)
	{
		System.out.println( s1 + "I am studying");
	}

}

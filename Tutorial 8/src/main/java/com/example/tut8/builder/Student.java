package com.example.tut8.builder;

//Create the Student class with a static nested (inner class)
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	//TO-DO: Implement the constructor
	public Student(StudentBuilder studentBuilder) {
		this.id = studentBuilder.id;
		this.lastName = studentBuilder.lastName;
		this.firstName = studentBuilder.firstName;
		this.age = studentBuilder.age;
		this.address = studentBuilder.address;
		this.phone = studentBuilder.phone;
	}

	//TO-DO: Implement GETTERs & SETTERs for given attributes

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//TO-DO: Implement toString() method to display student's information
	@Override
	public String toString() {
		return "Student{ " + "id=" + id +
				", first name=" + firstName + '\'' + ", last name=" + lastName + '\'' +
				", age=" + age + '\'' + ", phone" + phone + '\'' + ", address=" + address + '\'' +
				'}';
	}
	
	// Create the StudentBuilder inner class
	public static class StudentBuilder {
		//TO-DO: Declare the similar attributes with Student class
		private int id;
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String address;

		//TO-DO: Implement the constructor
		public StudentBuilder(int id, String firstName, String lastName) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
//			this.age = age;
//			this.phone = phone;
//			this.address = address;
		}

		//TO-DO: Implement the 3 below methods
		public StudentBuilder withOptionalAge(int age) {
			this.age = age;
			return this;
		}

		public StudentBuilder withOptionalPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public StudentBuilder withOptionalAddress(String address) {
			this.address = address;
			return this;
		}

		public Student buildStudent() {
			validateStudentData();
			return new Student(this);
		}

		private boolean validateStudentData() {
			// Validation process, check if student is registered in the database
			return true;
		}
	}
}

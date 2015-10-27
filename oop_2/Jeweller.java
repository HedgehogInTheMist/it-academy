package oop_2;

public class Jeweller {

	private String surname;
	private String name;

	Jeweller() {
	}

	Jeweller(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package domain;

import java.util.*;


public class Person extends Entity{

	private String Name;
	private String Surname;
	private String PESEL;
	private String Sex;
	private Student student;
	
	private List<Address> addressses;
	
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getPESEL() {
		return PESEL;
	}

	public void setPESEL(String pESEL) {
		PESEL = pESEL;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Address> getAddressses() {
		return addressses;
	}

	public void setAddressses(List<Address> addressses) {
		this.addressses = addressses;
	}


}

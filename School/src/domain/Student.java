package domain;

import java.util.*;


public class Student extends Entity{

	private String index;
	private List<Mark> marks;
	private Person person;
	private List<Role> roles;
	
	public Student()
	{
		marks = new ArrayList<Mark>();
		roles = new ArrayList<Role>();
	}
	
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public List<Mark> getMarks() {
		return marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
}

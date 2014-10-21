package domain;

import java.util.ArrayList;
import java.util.List;

public class Role extends Entity {
	
	private String name;
	private List<Privilege> privilege;
	private List<Student> students;
	
	public Role()
	{
		privilege = new ArrayList<Privilege>();
		students = new ArrayList<Student>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Privilege> getPrivilege() {
		return privilege;
	}

	public void setPrivilege(List<Privilege> privilege) {
		this.privilege = privilege;
	}

	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}

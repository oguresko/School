
public class Person {

	private String Name;
	private String Surname;
	private String PESEL;
	
	private Student Student;

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

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public Person getStudent() {
		return Student;
	}

	public void setStudent(Person student) {
		Student = student;
	}
	
}

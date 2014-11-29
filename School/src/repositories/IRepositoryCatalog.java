package repositories;

import domain.*;

public interface IRepositoryCatalog {
	
	public IStudentRepository getStudents();
	public IRepository<Person> getPersons();
	public IRepository<Role> getRoles();

}

package impl;


import java.sql.Connection;

import domain.Person;
import domain.Role;
import repositories.IRepository;
import repositories.IRepositoryCatalog;
import repositories.IStudentRepository;
import unitofwork.IUnitOfWork;

public class RepositoryCatalog implements IRepositoryCatalog{

	private Connection connection;
	private IUnitOfWork uow;
	
	public RepositoryCatalog(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}
	
	@Override
	public IStudentRepository getStudents() {
			return new StudentRepository(connection, new StudentBuilder(), uow);
	}
	
	@Override
	public IRepository<Person> getPersons() {
			return new PersonRepository(connection, new PersonBuilder(), uow);
	}
	
	@Override
	public IRepository<Role> getRoles() {
			return null;
	}

}

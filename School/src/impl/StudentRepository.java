package impl;

import java.sql.*;
import java.util.List;

import repositories.IStudentRepository;
import unitofwork.IUnitOfWork;
import domain.Mark;
import domain.Person;
import domain.Role;
import domain.Student;

public class StudentRepository
	extends Repository<Student> implements IStudentRepository{
	
	public StudentRepository(Connection connection,
			IEntityBuilder<Student> builder, IUnitOfWork uow) {
		super(connection,builder, uow);
	}
	
	@Override
	protected void setUpInsertQuery(Student entity) throws SQLException {
		insert.setString(1, entity.getIndex());
	}
	@Override
	protected void setUpUpdateQuery(Student entity) throws SQLException {
		update.setString(1, entity.getIndex());
	}
	
	@Override
	protected String getTableName() {
		return "students";
	}
	
	@Override
	protected String getUpdateQuery() {
		return
				"UPDATE students SET (index)=(?) WHERE id=?";
	}
	
	@Override
	protected String getInsertQuery() {
		return "INSERT INTO students(index)"
				+ "VALUES(?)";
	
	}

	@Override
	public List<Student> withMark(Mark mark) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> withMark(int markId) {
		// TODO Auto-generated method stub
		return null;
	}

}

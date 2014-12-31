package impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Student;

public class StudentBuilder implements IEntityBuilder<Student> {
	
	@Override
	public Student build(ResultSet rs) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setIndex(rs.getString("Index"));
		return student;
	
	}

}

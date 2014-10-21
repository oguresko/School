package impl;

import java.util.List;

import domain.Mark;
import domain.Student;
import repositories.IStudentRepository;
import repositories.IRepository;

public class DummyStudentRepository implements IStudentRepository {

	
	private DummyDb db;
	
	public  DummyUserRepository(DummyDb db) {
			super();
			this.db = db;
		}
	@Override
	public void save(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student get(int id) {
		public Student get(int id) {
				for(Student u: db.students)
						if(u.getId()==id)
							return u;
			return null;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
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

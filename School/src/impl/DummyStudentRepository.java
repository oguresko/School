package impl;

import java.util.List;

import domain.Mark;
import domain.Student;
import repositories.IStudentRepository;
import repositories.IRepository;

public class DummyStudentRepository implements IStudentRepository {

	
	private DummyDb db;
	
	public  DummyStudentRepository(DummyDb db) {
			super();
			this.db = db;
		}
	@Override
	public void save(Student entity) {
			db.students.add(entity);
		
	}

	@Override
	public void update(Student entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Student entity) {
			db.students.remove(entity);
		
	}

	@Override
		public Student get(int id) {
				for(Student u: db.students)
						if(u.getId()==id)
							return u;
			return null;
	}

	@Override
	public List<Student> getAll() {
			return db.students;
	}

	@Override
	public List<Student> withMark(Mark mark) {
			return withMark(mark.getId());
	}

	@Override
	public List<Student> withMark(int markId) {
		// TODO Auto-generated method stub
		return null;
	}

}

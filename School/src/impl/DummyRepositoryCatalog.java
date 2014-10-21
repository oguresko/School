package impl;

import repositories.IRepositoryCatalog;
import repositories.IStudentRepository;

public class DummyRepositoryCatalog implements IRepositoryCatalog{
	
		DummyDb db = new DummyDb();

		@Override
		public IStudentRepository getStudents() {
			
			return new DummyStudentRepository();
	}
}

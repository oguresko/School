package repositories;
import java.util.List;

import domain.*;

public interface IStudentRepository extends IRepository<Student>{
	
	public List<Student> withMark(Mark mark);
	public List<Student> withMark(int markId);
	

}

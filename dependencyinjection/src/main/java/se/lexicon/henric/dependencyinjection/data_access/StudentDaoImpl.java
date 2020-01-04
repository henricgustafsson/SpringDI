package se.lexicon.henric.dependencyinjection.data_access;

import java.util.List;

import org.springframework.stereotype.Component;

import se.lexicon.henric.dependencyinjection.models.Student;


@Component
public class StudentDaoImpl implements StudentDao{

	
	List<Student> students;
	
	
	public StudentDaoImpl() {
	
	}

	
	
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}

}

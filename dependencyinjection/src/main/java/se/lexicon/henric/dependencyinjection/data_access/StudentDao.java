package se.lexicon.henric.dependencyinjection.data_access;

import java.util.List;

import se.lexicon.henric.dependencyinjection.models.Student;

public interface StudentDao {
	
	Student save(Student student);
	Student find(int id);
	List<Student> findAll();
	void Delete(int id);
}

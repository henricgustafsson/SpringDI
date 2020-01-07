package se.lexicon.henric.dependencyinjection.service;

import java.util.List;

import se.lexicon.henric.dependencyinjection.models.Student;

public interface StudentManagement {

	Student create();
	Student save(Student student);
	Student find(int id);
	List<Student> findAll();
	Student edit(Student student);
	
}

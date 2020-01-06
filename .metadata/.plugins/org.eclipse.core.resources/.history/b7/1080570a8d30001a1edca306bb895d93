package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import se.lexicon.henric.dependencyinjection.data_access.StudentDao;
import se.lexicon.henric.dependencyinjection.util.UserInputService;

@Component
public class StudentManagementImpl {

	UserInputService service;
	StudentDao studentDao;
	
	@Autowired
	public StudentManagementImpl(UserInputService service, StudentDao studentDao) {
		this.service = service;
		this.studentDao = studentDao;
	}
}

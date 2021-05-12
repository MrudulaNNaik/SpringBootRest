package com.example.demorest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
	
	@RequestMapping("students")
	public List<Student> getStudents(){
		List<Student> students =  new ArrayList<>();
		
		students.add(new Student(1, "a", 1, 11));
		students.add(new Student(2, "b", 2, 22));
		students.add(new Student(3, "c", 3, 31));
		students.add(new Student(4, "d", 4, 41));
	
		return students;
		
	}

}

package com.servlet.dao;

import java.util.ArrayList;
import java.util.List;

import com.servlet.entity.Student;

public class StudentDAO {

	public static List<Student> students = null;

	public StudentDAO() {
		students = new ArrayList<Student>();
		students.add(new Student(1, "Nirav", "Ahmedabad"));
		students.add(new Student(2, "John", "Texas"));
		students.add(new Student(3, "Philip", "Ohio"));
		students.add(new Student(4, "Rick", "New York"));
	}

	public static List<Student> findAll() {
		return students;
	}
}

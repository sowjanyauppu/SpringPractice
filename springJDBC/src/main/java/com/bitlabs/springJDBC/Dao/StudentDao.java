package com.bitlabs.springJDBC.Dao;

import java.util.List;

import com.bitlabs.springJDBC.Student;

public interface StudentDao {
//	public int insert(Student student);
	public int update(Student student);
	public int delete(int id);
	public Student viewOne(int studentId);
	public List<Student> viewAllRecords();
}

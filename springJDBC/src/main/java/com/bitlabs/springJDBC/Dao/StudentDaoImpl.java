package com.bitlabs.springJDBC.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bitlabs.springJDBC.Student;

public class StudentDaoImpl implements StudentDao {
private JdbcTemplate jdbcTemplate;
	
public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
/*	//inert method
	public int insert(Student student) {
		String query="insert into Student(id,name,address) values(?,?,?)";
		int result=jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
		return result;
	} */
	//update method
	public int update(Student student) 
	{
		String query="update student set name=?,address=? where id=?";
		int r=jdbcTemplate.update(query,student.getName(),student.getAddress(),student.getId());
		return r;
		
	}
	public int delete(int id) {
		//delete data based on id
		String query="delete from student where id=?";
		int res=jdbcTemplate.update(query,id);	
		
		return res;
	}
	public Student viewOne(int studentId) {
		RowMapper<Student> rowMapper=new RowMapperImpl();
		String query="select * from student where id=?";
		Student student=jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return student;
	}
	public List<Student> viewAllRecords() {
	String query="select * from student";
	List<Student> students=jdbcTemplate.query(query, new RowMapperImpl());
	
		return students;
	}

}

package com.bitlabs.springJDBC;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitlabs.springJDBC.Dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/bitlabs/springJDBC/config.xml");
       StudentDao studentdao=context.getBean("studentDao",StudentDao.class);
     /*  //insert
       Student student=new Student();
       student.setId(2);
       student.setName("john");
       student.setAddress("canada");
       int result=studentdao.insert(student);
       System.out.println("one row is updated"+result); */
       //update
     /*  Student student1=new Student();
       student1.setId(2);
       student1.setName("raj kumar");
       student1.setAddress("vijayawada");
       int r=studentdao.update(student1);
       System.out.println("data has updated"+r); */
       //delte
       Scanner sc=new Scanner(System.in);
     /*  System.out.println("enter student id to delete");
       int sId=sc.nextInt();
       int res=studentdao.delete(sId);
       System.out.println("data has been deleted"+res); */
       
       //fetching single record from database using queryForObject() using RowMapper
     /*  System.out.println("enter student id to get the record");
       int studentId=sc.nextInt();
       Student student=studentdao.viewOne(studentId);
       if (student != null) {
    	  // System.out.println(student.getId()+" "+student.getName()+" "+student.getAddress());
           System.out.println(student);
       }
    	    
    	 else {
    	    System.out.println("No student found with the given ID");
    	 } */
       
       //view all records using query() in RowMapper
       List<Student> students=studentdao.viewAllRecords();
       for(Student s:students)
       {
    	   System.out.println(s);
       }
    }
}

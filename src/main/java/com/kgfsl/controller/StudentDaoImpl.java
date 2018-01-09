package com.kgfsl.controller;

import com.kgfsl.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	
   List<Student> students;

   public StudentDaoImpl(){
      students = new ArrayList<Student>();
      Student student1 = new Student("Din",0);
      Student student2 = new Student("Dinesh",1);
      students.add(student1);
      students.add(student2);		
   }
  
   public void deleteStudent(Student student) {
      students.remove(student.getRollNo());
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
   }

   public List<Student> getAllStudents() {
      return students;
   }

   public Student getStudent(int rollNo) {
      return students.get(rollNo);
   }

   public void updateStudent(Student student) {
      students.get(student.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
   }
}
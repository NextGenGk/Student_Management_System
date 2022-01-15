package com.example.new_sms.Service;

import com.example.new_sms.Entity.Student;

import java.util.List;

public interface StudentService {

    // Get All Students
    List<Student> getAllStudents();

    // Add Student
    Student saveStudent(Student student);

    // Get Student By ID
    Student getStudentById(int id);

    // Update Student
    Student updateStudent(Student student);

    // Delete Student By ID
    void deleteStudentsById(int id);

}

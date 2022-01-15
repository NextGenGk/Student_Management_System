package com.example.new_sms.StudentServiceImpl;

import com.example.new_sms.Entity.Student;
import com.example.new_sms.Repository.StudentRepository;
import com.example.new_sms.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Get All Students
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Add Student
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Get Student By ID
    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    // Update Student
    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    // Delete Student By ID
    @Override
    public void deleteStudentsById(int id) {
        studentRepository.deleteById(id);
    }
}

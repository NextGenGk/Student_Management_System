package com.example.new_sms.Controller;

import com.example.new_sms.Entity.Student;
import com.example.new_sms.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class MyController {

    private StudentService studentService;
    public MyController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Get All Student
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    // Create Student Object
    @GetMapping("/students/new")
    public String createStudentForm(Model model){

        // create student object to hold the student data
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }

    // Add Student (POST)
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    // Edit Student
    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable int id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    // Update Student
    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable int id, @ModelAttribute("student") Student student, Model model){

        // get Student from database by Id
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        // save updated student object
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    // Delete Student
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudentsById(id);
        return "redirect:/students";
    }
}

package com.example.new_sms;

import com.example.new_sms.Entity.Student;
import com.example.new_sms.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewSmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NewSmsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Gaurav","Kumar","gaurav@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Saurabh","Kumar","saurabh@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Sona","Kumar","sona@gmail.com");
//		studentRepository.save(student3);
//

	}
}

package com.jhonny.cruddemo;

import com.jhonny.cruddemo.dao.StudentDAO;
import com.jhonny.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			//createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			//queryForStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			deleteAllStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		Student student = new Student("Jhonny", "jui", "jhonny@gmail.com");
		Student student2 = new Student("Bruce", "Wayne", "bruce@gmail.com");
		Student student3 = new Student("Mike", "bravo", "mike@gmail.com");

		studentDAO.saveStudent(student);
		studentDAO.saveStudent(student2);
		studentDAO.saveStudent(student3);
	}

	private void createStudent(StudentDAO studentDAO) {
		Student student = new Student("Jhonny", "Wayne", "jhonny@gmail.com");
		studentDAO.saveStudent(student);
		System.out.println("Student saved. Generated ID: " + student.getId());
	}

	private void readStudent(StudentDAO studentDAO) {
		Student student = new Student("Rose", "Araujus", "rose@gmail.com");

		studentDAO.saveStudent(student);

		System.out.println("Id saved " + student.getId());

		Student studentFound = studentDAO.findById(student.getId());
		System.out.println(studentFound);
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for (Student student: students) System.out.println(student);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("Wayne");
		for (Student student: students) System.out.println(student);
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student studentToUpdate = studentDAO.findById(1L);
		studentToUpdate.setFirstName("Batman");
		studentDAO.update(studentToUpdate);
		System.out.println(studentToUpdate);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;
		System.out.println("Deleting student with id: " + studentId);
		studentDAO.delete(studentId);
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int rows = studentDAO.deleteAll();
		System.out.println("Rows deleted: " + rows);
	}
}

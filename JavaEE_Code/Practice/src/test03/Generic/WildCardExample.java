package test03.Generic;

import java.util.Arrays;

/**
 * Person하위에 Worker, Student가 있다. Student 아래 HighStudent가 있다.
 * Course<?>: 수강생은 모든 타입(Person, Worker, Student, HighStudent)이 될 수 있다.
 * Course<? extends Student>: 수강생은 Student HighStudent만 될 수 있다.
 * Course<? super Worker>: 수강생은 Worker와 Person만 될 수 있다.
 * @author sungh
 *
 */
public class WildCardExample{
	//모든 과정
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	//학생 과정
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
		
	}
	//직장인 과정
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		//모든 과정 등록 가능
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		//학생 과정만 등록 가능
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		//직장인과 일반인 과정만 등록 가능
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		
	}

}

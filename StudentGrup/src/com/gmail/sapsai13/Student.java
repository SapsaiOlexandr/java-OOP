package com.gmail.sapsai13;

public class Student extends Human implements Comparable <Student> {
	private String specialization;
	private int course;
	private double averageScore;
	
	@Override
	public int compareTo(Student stu) {
		
		return this.getSurname().compareTo(stu.getSurname());
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String surname, int age, String address, String phoneNumber) {
		super(name, surname, age, address, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String surname, int age, String address, String phoneNumber, String specialization, int course, double averageScore) {
		super(name, surname, age, address, phoneNumber);
		this.specialization = specialization;
		this.course = course;
		this.averageScore = averageScore;
	}
	
	public void info () {
		System.out.println(super.getSurname() + " "+ super.getName() );
		System.out.println(super.getAge() + " years old");
		System.out.println("lives at " + super.getAddress());
		System.out.println("Phone Number " + super.getPhoneNumber());
		System.out.println("specialization " + specialization);
		System.out.println("course " + course);
		System.out.println("Average Score " + averageScore);
		
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

	@Override
	public String toString() {
		return "Student [specialization=" + specialization + ", course=" + course + ", averageScore=" + averageScore
				+  super.toString() + "]";
	}
	

}

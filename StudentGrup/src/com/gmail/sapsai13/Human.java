package com.gmail.sapsai13;

public class Human {
	private String name;
	private String surname;
	private int age;
	private String address;
	private String phoneNumber;
	
	
	public Human() {
		super();
	}
	public Human(String name, String surname, int age, String address, String phoneNumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public void humanInfo () {
		System.out.println(surname + " "+ name );
		System.out.println(age + " years old");
		System.out.println("lives at " + address);
		System.out.println("Phone Number " + phoneNumber);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", surname=" + surname + ", age=" + age + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	

}

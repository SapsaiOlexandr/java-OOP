package com.gmail.sapsai13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human chosenOne = new Human ("Vasil","Bleck",39, "Kiev, Bedera str. 21", "0663332211");
		chosenOne.info();
		
		Student first = new Student ("Vasil","Bleck",39, "Kiev, Bedera str. 21", "0663332211", "IT", 2, 4.5 );
		System.out.println(first.getSpecialization());
		System.out.println(first.getSurname() );
		first.info();
		System.out.println(first.toString()); 
	}

}

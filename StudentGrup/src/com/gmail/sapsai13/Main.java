package com.gmail.sapsai13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human chosenOne = new Human ("Holms","Bleck",39, "Kiev, Bedera str. 21", "0663332211");
		chosenOne.info();
		
		Student first = new Student ("Vasil","Bleck",39, "Kiev, Vasilkovska str. 21", "0663332211", "IT", 2, 4.5 );
		Student sekond = new Student ("Alex","Red",15, "Odessa, Deribasova str. 12", "0663332212", "IT", 2, 4 );
		Student three = new Student ("Vasil","Wight",15, "Odessa, Deribasova str. 12", "0663332212", "IT", 2, 4 );
		Student four = new Student ("Alex","Yelov",15, "Odessa, Deribasova str. 12", "0663332212", "IT", 2, 4 );
		Student five = new Student ("Olya","Absent",15, "Odessa, Deribasova str. 12", "0663332212", "IT", 2, 4 );
		Student six = new Student ("Alex","Tekila",15, "Odessa, Deribasova str. 12", "0663332212", "IT", 2, 4 );
		Student seven = new Student ("Jeck","Deniels",15, "Odessa, Deribasova str. 12", "0663332212", "IT", 2, 4 );
		Student eight = new Student ("Alex","Red",15, "Odessa, Deribasova str. 12", "0663332212", "IT", 2, 4 );
		Student nain = new Student ("Jeck","Redd",15, "Odessa, Deribasova str. 12", "0663332212", "IT", 2, 4 );
		Student ten = new Student ("Alex","Redddd",15, "Odessa, Deribasova str. 12", "0663332212", "IT", 2, 4 );
		
		
		
		
		
		first.info();
		// System.out.println(first.toString()); 
		Group atp = new Group();
		
		atp.addStud(first);
		atp.addStud(sekond);
		atp.addStud(three);
		atp.addStud(four);
		atp.addStud(five);
		atp.addStud(six);
		atp.addStud(seven);
		atp.addStud(eight);
		atp.addStud(nain);
		atp.addStud(ten);
		// atp.addStud(first);
		
		System.out.println(atp.toString());
		atp.delStud(sekond);
		
		System.out.println(atp.toString());
		
	}

}

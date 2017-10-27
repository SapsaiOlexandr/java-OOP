package com.gmail.sapsai13;

import java.util.Scanner;

public class Group implements Voenkom {
	private Student[] groupStud = new Student[10];
	private int studNum = 0;

	public void addStud(Student stud) {

		if (studNum == 10) {
			throw new IllegalArgumentException("You are trying to add an extra student");
		}

		for (int i = 0; i <= studNum; i++) {
			if (groupStud[i] == null) {
				groupStud[i] = stud;
				studNum++;
				break;

			}
		}
	}

	public void delStud(Student stud) {
		for (int i = 0; i <= studNum; i++) {
			if (stud.hashCode() == groupStud[i].hashCode()) {
				groupStud[i] = null;
				studNum--;
				break;
			}
		}

	}

	private void sortBySurname() {
		for (int i = 0; i < groupStud.length - 1; i++) {
			for (int j = i + 1; j < groupStud.length; j++) {
				if (compSurname(groupStud[i], groupStud[j]) > 0) {
					Student temp = groupStud[i];
					groupStud[i] = groupStud[j];
					groupStud[j] = temp;
				}
			}
		}
	}

	public void sortByParametr() {
		Scanner sc = new Scanner(System.in);
		String param;
		for (;;) {
			System.out.println("Enter parametr 'Name' or 'Surname' or 'Age'");
			param = sc.nextLine().toLowerCase();

			if (param.equals("name") || param.equals("surname") || param.equals("age")) {
				System.out.println(123);
				break;
			}
		}
		switch (param) {
		case "name": {

			for (int i = 0; i < groupStud.length - 1; i++) {
				for (int j = i + 1; j < groupStud.length; j++) {
					if (compName(groupStud[i], groupStud[j]) > 0) {
						Student temp = groupStud[i];
						groupStud[i] = groupStud[j];
						groupStud[j] = temp;
					}
				}
			}

			break;

		}

		case "age": {

			for (int i = 0; i < groupStud.length - 1; i++) {
				for (int j = i + 1; j < groupStud.length; j++) {
					if (compAge(groupStud[i], groupStud[j]) > 0) {
						Student temp = groupStud[i];
						groupStud[i] = groupStud[j];
						groupStud[j] = temp;
					}
				}
			}

			break;

		}
		case "surname": {

			for (int i = 0; i < groupStud.length - 1; i++) {
				for (int j = i + 1; j < groupStud.length; j++) {
					if (compSurname(groupStud[i], groupStud[j]) > 0) {
						Student temp = groupStud[i];
						groupStud[i] = groupStud[j];
						groupStud[j] = temp;
					}
				}
			}

			break;

		}

		}

		sc.close();
	}

	private int compSurname(Student studI, Student studJ) {
		if (studI != null && studJ == null) {
			return 1;
		}
		if (studI == null && studJ != null) {
			return -1;
		}
		if (studI == null && studJ == null) {
			return 0;
		}
		return studI.getSurname().compareTo(studJ.getSurname());
	}

	private int compName(Student studI, Student studJ) {
		if (studI != null && studJ == null) {
			return 1;
		}
		if (studI == null && studJ != null) {
			return -1;
		}
		if (studI == null && studJ == null) {
			return 0;
		}
		return studI.getName().compareTo(studJ.getName());
	}

	private int compAge(Student studI, Student studJ) {
		if (studI != null && studJ == null) {
			return 1;
		}
		if (studI == null && studJ != null) {
			return -1;
		}
		if (studI == null && studJ == null) {
			return 0;
		}

		if (studI.getAge() > studJ.getAge()) {
			return 1;
		} else if (studI.getAge() == studJ.getAge()) {
			return 0;
		} else {
			return -1;
		}

	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		
		for (int i = 0; i < 10; i++) {
			if (groupStud[i] != null) {
				builder.append("Surname  " + groupStud[i].getSurname() + ", name  " + groupStud[i].getName()
						+ ", Specialist  " + groupStud[i].getSpecialization() + "\n");
			}
		}

		return builder.toString();
	}

	@Override
	public Group Warriors() {
		Group warrior = new Group();
		for (int i = 0; i < 10; i++) {

			if (groupStud[i] != null && groupStud[i].getAge() > 18) {
				warrior.addStud(groupStud[i]);

			}
		}

		return warrior;
	}

}

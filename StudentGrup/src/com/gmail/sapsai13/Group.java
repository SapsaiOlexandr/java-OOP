package com.gmail.sapsai13;

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

	private int compSurname(Student i, Student j) {
		if (i != null && j == null) {
			return 1;
		}
		if (i == null && j != null) {
			return -1;
		}
		if (i == null && j == null) {
			return 0;
		}
		return i.getSurname().compareTo(j.getSurname());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		sortBySurname();

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
		for (int i = 0; i > 10; i++) {

			if (this.groupStud[i] != null & this.groupStud[i].getAge() > 18) {
				warrior.addStud(this.groupStud[i]);

			}
		}

		return warrior;
	}

}

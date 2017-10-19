package com.gmail.sapsai13;

public class Group {
	private Student[] groupStud = new Student[10];
	private int studNum = 0;

	public void addStud(Student stud) {
		if (dublStud(stud)) {
			groupStud[studNum] = stud;
			studNum++;
		}
	}

	public boolean dublStud(Student stud) {
		boolean rez = true;
		for (int i = 0; i < studNum; i++) {
			if (stud.hashCode() == groupStud[i].hashCode()) {
				rez = false;
			}

		}
		return rez;
	}

}

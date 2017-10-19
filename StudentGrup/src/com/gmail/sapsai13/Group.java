package com.gmail.sapsai13;

import java.util.Arrays;

public class Group {
	private Student[] groupStud = new Student[10];
	private int studNum = 0;

	public void addStud(Student stud) {

		for (int i = 0; i <= studNum; i++) {
			if (groupStud[i] == null) {
				groupStud[i] = stud;
				studNum++;

			}
		}
	}

	public void delStud(Student stud) {
		for (int i = 0; i <= studNum; i++) {
			if (stud.hashCode() == groupStud[i].hashCode()) {
				groupStud[i] = null;
				studNum--;
			}
		}

	}

	@Override
	public String toString() {
		return "Group [groupStud=" + Arrays.toString(groupStud) + "]";
	}
}

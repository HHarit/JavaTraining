package com.abs.quest1;

public class ProjectMain {
	public static void main(String[] args) {

		Project project = new TeamOne();
		project.doTask();

		TeamOne teamOne = (TeamOne) project;
		teamOne.softwaresUsed("ecillpse", "maven", "jenkins");

		project = new TeamTwo();
		project.doTask();

	}
}

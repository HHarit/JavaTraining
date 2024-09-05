package com.abs.quest1;

class TeamOne extends Project {
	// override doTask - "Project implemented using Java"
	// create own method as void
	void doTask() {
		System.out.println("Project Inheritence");
	}

	void softwaresUsed(String... tools) {
		for (String tool : tools) {
			System.out.println(tool);
		}
	}
}

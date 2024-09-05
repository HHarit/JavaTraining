package com.over.quest3;

public class ProcessMain {
	public static void main(String[] args) {
		Processor ObjProcessor = new Processor();
		ObjProcessor.calculate(16.0);
		ObjProcessor.calculate(5, 4);
		ObjProcessor.calculate(10.5, 3.5);
		ObjProcessor.calculate(2.0, 3);

	}
}

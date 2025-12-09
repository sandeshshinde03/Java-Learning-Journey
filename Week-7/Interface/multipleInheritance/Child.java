package com.multipleInheritance;

public class Child implements Father, Mother {
	@Override
	public void eatPaniPuri() {
		System.out.println("Child eat panipuri...");
	}

}

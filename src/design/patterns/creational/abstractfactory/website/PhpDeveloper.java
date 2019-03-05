package design.patterns.creational.abstractfactory.website;

import design.patterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer{

	@Override
	public void writeCode() {
		System.out.println("Phph developer writes php code...");
		
	}

}

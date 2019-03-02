package design.patterns.creational.factory;

public class Program {
	
	static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
		if(speciality.equalsIgnoreCase("java")) {
			return new JavaDeveloperFactory();
		} else if(speciality.equalsIgnoreCase("c++")) {
			return new CppDeveloperFactory();
		} else {
			throw new RuntimeException(speciality + " is unknown");
		}
	}
	
	public static void main(String args[]) {
		DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("php");
		Developer developer = developerFactory.createDeveloper();
		developer.writeCode();
		
	}
}

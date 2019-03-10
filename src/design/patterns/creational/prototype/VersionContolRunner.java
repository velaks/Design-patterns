package design.patterns.creational.prototype;

public class VersionContolRunner {
	public static void main(String[] args) {
		Project master = new Project(1, "Super proj", "Source code");
		System.out.println(master);
		
		ProjectFactory factory = new ProjectFactory(master);
		Project masterClone = factory.cloneProject();
		System.out.println("\n");
		System.out.println(masterClone);
	}

}

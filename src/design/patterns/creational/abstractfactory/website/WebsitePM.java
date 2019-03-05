package design.patterns.creational.abstractfactory.website;

import design.patterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager{

	@Override
	public void manageProject() {
		System.out.println("Website PM manages Website project...");
		
	}

}

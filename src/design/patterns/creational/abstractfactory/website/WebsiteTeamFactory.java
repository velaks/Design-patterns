package design.patterns.creational.abstractfactory.website;

import design.patterns.creational.abstractfactory.Developer;
import design.patterns.creational.abstractfactory.ProjectManager;
import design.patterns.creational.abstractfactory.ProjectTeamFactory;
import design.patterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory{

	@Override
	public Developer getDeveloper() {
		
		return new PhpDeveloper();
	}

	@Override
	public Tester getTester() {
		
		return new ManualTester();
	}

	@Override
	public ProjectManager getProjectManager() {
		
		return new WebsitePM();
	}

}

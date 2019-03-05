package design.patterns.creational.abstractfactory;

import design.patterns.creational.abstractfactory.banking.BankingTeamFactory;
import design.patterns.creational.abstractfactory.website.WebsiteTeamFactory;

public class ActionSiteProject {
	public static void main (String[] args) {
		ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
		Developer developer =  projectTeamFactory.getDeveloper();
		Tester tester = projectTeamFactory.getTester();
		ProjectManager projectManager = projectTeamFactory.getProjectManager();
		
		System.out.println("Creating action website...");
		developer.writeCode();
		tester.testCode();
		projectManager.manageProject();
	}

}

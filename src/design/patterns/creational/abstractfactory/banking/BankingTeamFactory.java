package design.patterns.creational.abstractfactory.banking;

import design.patterns.creational.abstractfactory.Developer;
import design.patterns.creational.abstractfactory.ProjectManager;
import design.patterns.creational.abstractfactory.ProjectTeamFactory;
import design.patterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory{

	@Override
	public Developer getDeveloper() {
		return new JavaDeveloper();
	}

	@Override
	public Tester getTester() {
		return new QATester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new BankingPM();
	}

}

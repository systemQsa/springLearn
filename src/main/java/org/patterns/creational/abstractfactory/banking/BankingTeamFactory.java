package org.patterns.creational.abstractfactory.banking;

import org.patterns.creational.abstractfactory.Developer;
import org.patterns.creational.abstractfactory.ProjectManager;
import org.patterns.creational.abstractfactory.ProjectTeamFactory;
import org.patterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
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

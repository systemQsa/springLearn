package org.patterns.creational.abstractfactory.banking;

import org.patterns.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("banking PM manages banking project...");
    }
}

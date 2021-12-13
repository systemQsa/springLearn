package org.patterns.creational.abstractfactory.website;

import org.patterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages project");
    }
}

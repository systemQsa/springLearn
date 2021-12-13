package org.patterns.structural.facade;

public class Developer {
    public void doJobBeforeDeadLIne(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems");
        } else{
            System.out.println("Developer is reading Habr");
        }
    }
}

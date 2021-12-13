package org.patterns.structural.facade;

public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        job.doJOb();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLIne(bugTracker);
    }

}

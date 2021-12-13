package org.patterns.structural.proxy;

public class RealProject implements Project{
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading project from " + url);
    }
    @Override
    public void run() {
        System.out.println("running project " + url);
    }
}

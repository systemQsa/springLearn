package org.patterns.creational.abstractfactory.website;

import org.patterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php developer writes code...");
    }
}

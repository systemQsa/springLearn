package org.patterns.creational.abstractfactory.website;

import org.patterns.creational.abstractfactory.Tester;

public class ManualTester  implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code...");
    }
}

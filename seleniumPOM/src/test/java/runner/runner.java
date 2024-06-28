package runner;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class runner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        List<String> suites = new ArrayList<>();
        suites.add("/Users/apple/AquaProjects/seleniumPOM/testng.xml");
        testng.setTestSuites(suites);
        testng.run();
    }
}

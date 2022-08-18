package de.novi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void printIndividual() {
        Generator generator = new Generator();
        System.out.println(generator.genIndividual().toString());
    }
}

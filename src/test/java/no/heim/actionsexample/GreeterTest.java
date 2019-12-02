package no.heim.actionsexample;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class GreeterTest {


    @Test
    public void greetingShouldBeCorrect() {
        assertThat(new Greeter().getGreeting(), equalTo("Hello World"));
    }
}
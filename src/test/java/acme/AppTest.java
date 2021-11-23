package acme;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldCapitalize(){
        assertEquals( "HELLO", App.capitalize("hello") );
    }
}

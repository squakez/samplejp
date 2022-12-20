package acmea;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppATest {

    @Test
    public void shouldCapitalize(){
        assertEquals( "A: HELLO", AppA.capitalize("hello") );
    }
}

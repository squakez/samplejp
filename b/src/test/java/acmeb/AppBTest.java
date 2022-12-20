package acmeb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppBTest {

    @Test
    public void shouldCapitalize(){
        assertEquals( "B: HELLO", AppB.capitalize("hello") );
    }
}

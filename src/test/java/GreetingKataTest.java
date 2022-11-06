import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingKataTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testGreet(){
        assertEquals("Hello, xs",GreetingKata.greeting(new String[]{"xs"}));
    }

    @Test
    public void testGreetNull(){
        assertEquals("Hello, my friend",GreetingKata.greeting(null));
    }

    @Test
    public void testGreetShouting(){
        assertEquals("HELLO JERRY!",GreetingKata.greeting(new String[]{"JERRY"}));
    }

    @Test
    public void testGreetTwoNames(){
        assertEquals("Hello Jill and Jane.",GreetingKata.greeting(new String[]{"Jill","Jane"}));
    }

    @Test
    public void testGreetMultipleNames(){
        assertEquals("Hello Amy, Brian and Charlotte.",GreetingKata.greeting(new String[]{"Amy", "Brian", "Charlotte"}));
    }
}
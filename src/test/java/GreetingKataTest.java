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
        assertEquals("Hello, xs",GreetingKata.greeting("xs"));
    }

    @Test
    public void testGreetNull(){
        assertEquals("Hello, my friend",GreetingKata.greeting(null));
    }
}
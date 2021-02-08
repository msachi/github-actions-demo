package hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GreeterTest {

   private Greeter greeter;
	
   @Before
   public void setUp() {
      greeter = new Greeter();
   }

   @Test
   public void greeterSaysHello()
   {
      assertEquals(greeter.sayHello(), "Hello world!");
   }
}
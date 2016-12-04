import org.junit.*;

public class HelloWorldTest {

    // Run once, e.g. Database connection, connection pool
    @BeforeClass
    public static void runOnceBeforeClass() {
     }

    // Run once, e.g close connection, cleanup
    @AfterClass
    public static void runOnceAfterClass() {
    }

    // Should rename to @BeforeTestMethod
    // e.g. Creating an similar object and share for all @Test
    @Before
    public void runBeforeTestMethod() {
    }

    // Should rename to @AfterTestMethod
    @After
    public void runAfterTestMethod() {
    }

    @Test
    public void testGetMessage() 
    {
      assertEquals(HelloWorld.MESSAGE, HelloWorld.getMessage());
    }



}

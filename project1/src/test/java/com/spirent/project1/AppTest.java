package com.spirent.project1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	
	@Before
	public void setUp()
	{
		System.setOut(new PrintStream(outStream));
	}
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        App.main(new String[] {});
        
        Assert.assertEquals("Hello World!", outStream.toString());
    }
    
    @After
    public void cleanUp()
    {
    	System.setOut(null);
    }
}

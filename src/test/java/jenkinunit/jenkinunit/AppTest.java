package jenkinunit.jenkinunit;

import static org.junit.Assert.*;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
    	App p=new App();
    	assertEquals(20,p.add(10, 10));
    }
}

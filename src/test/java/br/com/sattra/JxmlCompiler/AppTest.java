package br.com.sattra.JxmlCompiler;

import java.io.File;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.sf.jasperreports.engine.JRException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
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

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Compilador compilador = Compilador.getInstance();
    	boolean teste = false;
    	try {
			teste = compilador.compilar(new File("input.jrxml").getAbsolutePath());
			
		} catch (JRException e) {
			
			e.printStackTrace();
		}
    	assertEquals(true, teste);
    }
    
}

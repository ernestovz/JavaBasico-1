/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MultiplicacionTest {
    
    public MultiplicacionTest() {
    }
    
@Test // es un test y no tiene main
 public void testMultiplication() {
 assertEquals("Multiplication", 6, 3 * 2);
}
}
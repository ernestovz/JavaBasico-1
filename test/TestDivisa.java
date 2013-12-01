/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import app.clase6.junit.modelo.Divisa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDivisa {

    public TestDivisa() {
    }


    
    @Test
 public void testSumar() throws Exception {
 System.out.println("sumar");
 Divisa divisaUNO = new Divisa(10, "Soles");
 Divisa divisaDOS = new Divisa(20, "Soles");
 Divisa divisaESPERADA = new Divisa(30, "Soles");
 
 Divisa divisaRESULTADO = divisaDOS.sumar(divisaUNO);
 assertEquals(divisaESPERADA.getImporte(), divisaRESULTADO.getImporte());
}
}
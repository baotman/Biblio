/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.ManagerBiblio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author farah
 */
public class ManagerBiblioFacadeTest {
    
    public ManagerBiblioFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of seConnecter method, of class ManagerBiblioFacade.
     */
    @Test
    public void testSeConnecter() {
        System.out.println("seConnecter");
        ManagerBiblio managerBiblio = new ManagerBiblio("ana_farah","farah");
        ManagerBiblioFacade instance = new ManagerBiblioFacade();
        int expResult = 12;
        int result = instance.seConnecter(managerBiblio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

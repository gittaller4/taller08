/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

import Taller.EmployeeType;
import Taller.Employee;
import java.util.Currency;
import java.util.Locale;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author coloma
 */
public class EmployeeTest extends TestCase{
    
    public EmployeeTest() {
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
     * Test of cs method, of class Employee.
     */
    @Test
    public void testCs() {
        System.out.println("cs1");
        Employee instance;
        instance = new Employee(570.50F,"USD",0.50F,EmployeeType.Supervisor);
        float expResult = 570.675F;
        float result = instance.cs();
        assertEquals(expResult, result, 1);
        
        System.out.println("cs2");
        Employee instance2 = new Employee(10f, "USD", 10f, EmployeeType.Manager);
        float expResult2 = 17.0F;
        float result2 = instance2.cs();
        assertEquals(expResult2, result2, 1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("cs3");
        Employee instance3 = new Employee(10f, "USD", 10f, EmployeeType.Worker);
        float expResult3 = 10.0f;
        float result3 = instance3.cs();
        assertEquals(expResult3, result3, 0.0f );
    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @Test
    public void testCalculateYearBonus() {
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("CalculateYearBonus 2");
        Employee instance2 = new Employee(10f, "al", 10f, EmployeeType.Manager);
        float expResult2 = 395.5F;
        float result2 = instance2.CalculateYearBonus();
        assertEquals(expResult2, result2,0.0f );
        
        System.out.println("CalculateYearBonus1");
        Employee instance = new Employee(570.50F,"EURO",0.50F,EmployeeType.Supervisor);
        float expResult = 734.975F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 1);
        
        System.out.println("CalculateYearBonus 3");
        Employee instance3 = new Employee(10f, "USD", 10f, EmployeeType.Worker);
        float expResult3 = 386.0F;
        float result3 = instance3.CalculateYearBonus();
        assertEquals(expResult3, result3,0.0f );
    }
    
}

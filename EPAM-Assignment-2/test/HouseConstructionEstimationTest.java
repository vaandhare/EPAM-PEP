/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import epam.excercise2.HouseConstructionEstimation;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andhare
 */
public class HouseConstructionEstimationTest {
    
    HouseConstructionEstimation HCE = new HouseConstructionEstimation();
    
    @Test
    public void testCalculation() {
		assertEquals(3000000, HCE.Calculation("Standard Materials", 2500, "Fully Automated Home"));
		assertEquals(3000000, HCE.Calculation("Standard Materials", 2500, "Not Fully Automated Home"));
		assertEquals(4500000, HCE.Calculation("High Standard Materials", 2500, "Not Fully Automated Home"));
		assertEquals(6250000, HCE.Calculation("High Standard Materials", 2500, "Fully Automated Home"));
		assertEquals(3750000, HCE.Calculation("Above Standard Materials", 2500, "Fully Automated Home"));
		assertEquals(3750000, HCE.Calculation("Above Standard Materials", 2500, "Not Fully Automated Home"));	
	}
    
}

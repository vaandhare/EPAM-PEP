
package epam.excercise2;

/**
 *
 * @author Andhare
 */
public class HouseConstructionEstimation {
   
    public int Calculation(String Material_Standard, double Area, String Fully_Auto_Home) {
		if(Material_Standard.equals("High Standard Materials") && Fully_Auto_Home.equals("Fully Automated Home"))
			return (int) (2500*Area);
                else if(Material_Standard.equals("Standard Materials"))
			return (int) (Area*1200);
		else if(Material_Standard.equals("Above Standard Materials"))
			return (int) (1500*Area);
		else if(Material_Standard.equals("High Standard Materials"))
			return (int) (1800*Area);
		return 0;
		
	}
    
}

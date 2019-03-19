
import epam.excercise2.Interest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andhare
 */
public class InterestTest {
    
    Interest In = new Interest();
    
    @Test
    public void testSimpleInterest(){
        assertEquals(500.0, In.Simple(1000.0, 10.0, 5.0),0.0);
        assertEquals(420.0, In.Simple(1000.0, 6.0, 7.0),0.0);
        assertEquals(600.0, In.Simple(3000.0, 5.0, 4.0),0.0);
    }
    
    @Test
    public void testCompoundInterest(){
        assertEquals(3820.3199999999997, In.Compound(20000.0, 3.0 ,6.0),0.0);
        assertEquals(680.1912812500009, In.Compound(2000.0, 6.0, 5.0),0.0);
        assertEquals(1467.1858073600015, In.Compound(2500.0, 6.0, 8.0),0.0);
    }
    
}

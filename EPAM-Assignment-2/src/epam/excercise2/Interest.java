
package epam.excercise2;

/**
 *
 * @author Andhare
 */
public class Interest {
    
    public double Simple(double P, double N, double R){
        return P * (N/100) * R;
    }
    
    public double Compound(double P, double N, double R){
        return (P*(Math.pow((1+(R/100)), N)))-P;
    }
    
}

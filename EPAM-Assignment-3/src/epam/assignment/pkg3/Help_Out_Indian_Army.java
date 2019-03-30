package epam.assignment.pkg3;

/**
 * @author Andhare
 */
import java.util.*;

public class Help_Out_Indian_Army
{
    public static void main(String args[]) 
	{
       	Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		long x, p, temp1, temp2, ans= 0;
		long S = sc.nextLong();
		long E = sc.nextLong();
		TreeMap <Long,Long> t1 = new TreeMap <Long,Long>();
		TreeMap <Long,Long> t2 = new TreeMap <Long,Long>();
		for(int i=0;i<n;i++){
			x=sc.nextLong();
			p=sc.nextLong();
			t1.put((x-p),(x+p));
        }

        List<Long> l1 = new ArrayList<Long>(t1.keySet());
        List<Long> l2 = new ArrayList<Long>(t1.values());
    	
    	temp1 = l1.get(0);
		temp2 = l2.get(0);
		
		for(int i=1;i<t1.size();i++)
		{
			if(l1.get(i)<=temp2)
				temp2= Math.max(temp2,l2.get(i));
			else {
				t2.put(temp1,temp2);
				temp1=l1.get(i);
				temp2=l2.get(i);
			}
		}
		
		t2.put(temp1,temp2);
	
        l1=new ArrayList<Long>(t2.keySet());
        l2=new ArrayList<Long>(t2.values());
        
		for(int i=0;i<l1.size();i++)
		{
			if(S>E){
				S=E;
				break;
			}
			if(l1.get(i)<=S && S<l2.get(i))
			    S = l2.get(i);
			else if(S<l1.get(i) && E>=l2.get(i)){
				ans+=l1.get(i)-S;
				S = l2.get(i);
			}
			else if(S<=l1.get(i) && E>=l1.get(i) &&  E<=l2.get(i)){
				ans+=l1.get(i)-S;
				S = E;
			}
			else if(S<=l1.get(i) && E<=l1.get(i)){
				ans+=E-S;
				S = E;
			}
		}
		if(S < E)
			ans += E - S;
		
		System.out.println(ans);
	}
}

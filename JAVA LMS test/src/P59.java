
public class P59 {

	public enum Months { JAN, FEB, MARCH, APRIL, MAY };

	public static void main(String args[]) {

	for(Months m: Months.values());

	Months[] m1 = Months.values();

	System.out.println(m1[4]);

	}
}

import java.text.NumberFormat;
import java.util.Locale;

public class P11 {

	public static void main(String args[]) {

		int val=52201350;

		Locale loc=new Locale("it");

		NumberFormat obj=NumberFormat.getInstance(loc);

		String b;

		b = obj.format( val);

		System.out.print(b);

		}
}

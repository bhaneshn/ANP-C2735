import java.util.Currency;
import java.util.Locale;
public class LocaleDemo {

public static void main(String[] args) {
	
	Locale obj=new Locale("in","IN");// in=language code , IN=country code
	long amount=1000;
	Currency curr=Currency.getInstance(obj);
	System.out.println(amount+" "+curr.getSymbol()+" "+curr.getDisplayName());
}
}

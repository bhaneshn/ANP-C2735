import java.util.ArrayList;
import java.util.List;

public class P30 {

	public static void main(String[] args)

	{

	List list1 = new ArrayList ( );

	List <Object> list2 = list1;

	list1.add(10);

	list1.add(11);

	list1.add("mona") ;

	list1.add(true);

	System.out.println(list1);

	System.out.println(list2);// this  statement print same line as list1

	}
}

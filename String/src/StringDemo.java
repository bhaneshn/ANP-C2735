
public class StringDemo {
	public static void main(String[]args) {
	String str1 = new String("Hello everybody   ");
	String str5 = new String("Hello everybody");
	String str2="hello";
	String str3="Everu";
	System.out.println(str2.charAt(0));
	char var=str3.charAt(4);
	System.out.println(var);
	String str4="the java program";
	String strSplit[]=str4.split(" \t");
	for(String st:strSplit) {
		System.out.println(st);
	}
		int compare=str1.compareToIgnoreCase(str5);
		System.out.println(compare);
		
		boolean result=str1.equals(str5);
		System.out.println(result);
		
		
	System.out.println(str5.indexOf("y"));
	
}
}

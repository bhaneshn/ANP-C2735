
public class JournalPaper extends WrittenItem {

	private int year;
	
	public JournalPaper(int year) {
		this.year=year;
	}
	
	void modelItem() {
		
		int pubYear=year;
		System.out.println("Published year : "+pubYear);
	}
	
	
}


public abstract class Item {
	private int id;
	private String title;
	private int copies;
	
	Item(){
		
	}
	public  Item(int Id,String Title,int Copies){
		this.id=Id;
		this.title=Title;
		this.copies=Copies;
	}
	public String toString() {
		String data="id :" +id + " title : " + title + " copies :" +copies;
		return data;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}

	public void getId(int id) {
		this.id=id;
	}
	
}

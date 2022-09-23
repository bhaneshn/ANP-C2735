
public abstract class WrittenItem extends Item {

	
	private String author;
	
	public WrittenItem(String Author){
		this.author=Author;
	}
	
	WrittenItem(){
		
		System.out.println("WrittenItem");
	}
	abstract void modelItem();
	
}

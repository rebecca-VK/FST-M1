package Activities;


//abstract class
abstract class Book{
	//variables
	String title;
	
	//abstract method to set the title
	public abstract void setTitle(String title);
	
	//abstract method to get the title
	public String getTitle() {
		return this.title;
	}
}

class MyBook extends Book{
	//implement the set title
	public void setTitle(String title) {
		this.title = title;
	}
}

class MyBook2 extends Book{
	
	public void  setTitle(String title) {
		if(title.length()<3) {
			System.out.println("Title is too small");
		}
		else {
			this.title = title;
		}
	}
}
public class Activity5 {
	
	public static void main(String []args) {
		
		MyBook bookobj = new MyBook();
		bookobj.setTitle("Testing concepts using JAVA programming");
		
		System.out.println(bookobj.getTitle());
	}
	

}

package demo_2024_projects_practice;

public class BasicLibrary {
	
	String Book[];
	int totalBookCount;
	
	
	public BasicLibrary() {
		Book = new String[100];
		totalBookCount=0;
	}
	
	
	public void addBook(String bookName){
		if(bookName.length()>=3) {
			 Book[totalBookCount] =bookName;
			 totalBookCount++;
			 System.out.println(bookName + ":Book has been added Successfully in library");
		}else 
		{
			System.out.println("invalid name");
		}
		
	}
	
	public void showBooks(){
		for(String bk:Book) {
			if(bk !=null)
			{
				System.out.println(bk);
				
			}else 
			{
				continue;
			}
			
		}
	}
	
	
	public void issuBook(String bookname) {
		for(int i =0; i<Book.length; i++) 
		{
			if( Book[i]!=null && Book[i].equalsIgnoreCase(bookname))
			{
			System.out.println(bookname + ":has been issued" );
			Book[i] =null;
			break;
			}else if(i==Book.length-1)
			{
			 System.out.println("Not found any book of given name: " + bookname);
			 break;
				
			}
		}
	}
	
	

}

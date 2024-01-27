package practice.demo;
import java.util.HashMap;


public class InhouseMemory {
	
   public String[][] getUserDb() {
		return userDb;
	}

private	String [][] userDb = {{"aj01","test@123"},
		{"aj02","test@124"},
		{"aj03","test@123"},
		{"aj04","test@123"},
		{"aj05","test@123"},
		{"aj06","test@123"},
		{"aj07","test@123"},
		{"aj08","test@123"},
		{"aj09","test@123"},
		{"aj10","test@123"}};



  public HashMap<String, Object> setData() {
      
	  
	  
      HashMap<String ,Object> hp = new HashMap<String, Object>();
      hp.put("user1","Akshhay");
      hp.put("user2", "Ajju");
      return hp;
      
  }
     
      
      
      
      
      

	
      
      

}

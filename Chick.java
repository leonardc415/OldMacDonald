class Chick //implements Animal 
{     
     //your code here
	 private String myType;     
     private String mySound;      
     public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick()     {         
         myType = "chicken";         
         mySound = "cluck";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}

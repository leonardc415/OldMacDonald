class Chick implements Animal 
{     
     //your code here
	 private String myType;     
     private String mySound;      
     public Chick(String type, String sound, String soundTwo)     {         
         myType = type;         
         if(Math.random() < .5){
  						mySound = "cheep";}
  					else{
  						mySound =  "cluck";}}     
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}

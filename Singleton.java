package Singleton;

//Double checked locking method   
public class Singleton {
  
   private static Singleton INSTANCE ;   
     
   private Singleton()
   {
	 
   }
 
	   public static Singleton getInstance()
	   {
		   
       if(INSTANCE == null) {   
           synchronized(Singleton.class) {   
               
               if(INSTANCE == null) {   
                   INSTANCE = new Singleton();   
                   System.out.println("Instance Created");
                   
               }   
           }   
       }   
       return INSTANCE;   
   }   
}   




public class Mobile {
    
	String Name;
    int ImeiNumbaer;
    int CameraMagnifier;
    float BatterHealth;

    Mobile(String Name,  int ImeiNumbaer, int CameraMagnifier, float BatterHealth) {
        this.Name = Name;
    	this.ImeiNumbaer = ImeiNumbaer;
        this.CameraMagnifier = CameraMagnifier;
        this.BatterHealth = BatterHealth;
    }

    Mobile (String Name,int ImeiNumbaer, int CameraMagnifier) {
        this(Name,ImeiNumbaer, CameraMagnifier, 0.0f);
    }

    Mobile(String Name, int ImeiNumbaer  ) {
        this(Name,ImeiNumbaer, 0); 
    }
    Mobile(String Name)
    {
    	this(Name,0);
    }

    public static void main(String[] args) {
        
    	Mobile mb = new Mobile("One plue Node2", 1234, 50, 100f);
        if (mb != null) {
        	System.out.println("Moblie Name  "+mb.Name);
            System.out.println("IMEI Numbaer is "+mb.ImeiNumbaer);
            System.out.println("Magnifier "+mb.CameraMagnifier+"px");
            System.out.println("Batter Health "+mb.BatterHealth+"%mh");
        }
        
        
        System.out.println();
        
        if(mb !=null) {
        Mobile mb1 = new Mobile("sumsung S9",43123, 43,99.7f);
          System.out.println("Moblie Name  "+mb1.Name); 
          System.out.println("IMEI Numbaer is "+mb1.ImeiNumbaer);
          System.out.println("Magnifier "+mb1.CameraMagnifier);
          System.out.println("Batter Health "+mb1.BatterHealth+"%");
          
         
          System.out.println();
          
          if(mb !=null) {
              Mobile mb2 = new Mobile("Iphone 15 pro",43123, 43,99);
                System.out.println("Moblie Name  "+mb2.Name);
                System.out.println("IMEI Numbaer is"+mb2.ImeiNumbaer);
                System.out.println("Magnifier "+mb2.CameraMagnifier);
                
                
               }
          }
    
      }
}

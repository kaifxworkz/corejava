

public class Bicycle {
      
	  String BicycleName;
      String BarndName;
      String Types;
      double price;
      String color;
      float  Age;
      String Frame;
      String Gears;
      int Wheels;
      String Brekes;
      
      Bicycle(String BicycleName,String BarndName,String Types , double price , String color,float  Age,String Frame,
      String Gears, int Wheels,String Brekes)
      {
    	  this.BicycleName =BicycleName;
    	  this.BarndName= BarndName;
    	  this.Types = Types;
    	  this.price = price;
    	  this.color = color;
    	  this.Age = Age;
    	  this.Frame = Frame;
    	  this.Wheels =Wheels;
    	  this.Brekes=Brekes;
      }
	 
	
	
	public static void main(String[] args) {
		Bicycle Bc = new Bicycle("Sprint", "HERO", "Mountain", 13599, "Black", 19.4f, "CarbonFibre", "18-speed", 2, "Disc");
		
		System.out.println("Bicycle Name:" + Bc.BicycleName);
		System.out.println("Brand Name:" + Bc.BarndName);
		System.out.println("Type :" + Bc.Types);
		System.out.println("Price :" + Bc.price);
		System.out.println("Color: "+ Bc.color);
		System.out.println("AGE :" + Bc.Age);
		System.out.println("Frame :" + Bc.Frame);
		System.out.println("Numbaer of Wheels :" + Bc.Wheels);
		System.out.println("Brakes :" + Bc.Brekes);

	}

}

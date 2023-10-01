package Odc;

public class Laptop {
	
	String LaptopName;
	int Battery;
	float RAM;
	String KeyBoard;
	float SSD;
	String ProcessName;
	double HardDisk;
	String GPU;
    float ScreenSize;
    String MotherBoard;
    
	
	
	Laptop(	String LaptopName,int Battery,float RAM,String KeyBoard,float SSD,String ProcessName,
	double HardDisk,String GPU,float ScreenSize,String MotherBoard)
	{
		this.LaptopName=LaptopName;
		this.Battery=Battery;
		this.RAM= RAM;
		this.KeyBoard = KeyBoard;
		this.SSD =SSD;
		this.ProcessName =ProcessName;
		this.HardDisk =HardDisk;
		this.GPU =GPU;
		this.ScreenSize=ScreenSize;
		this.MotherBoard = MotherBoard;
	}
	

	public static void main(String[] args) {
		
		 Laptop Lp = new Laptop("ASUS Tuf f15", 5200, 8, "RGB", 2, "Intel", 2, "NVIDIA GeForce", 17.4f, "Manufacturer");
        
		    System.out.println("Laptop Name: " + Lp.LaptopName);
	        System.out.println("Battery (mAh): " + Lp.Battery);
	        System.out.println("RAM (GB): " + Lp.RAM);
	        System.out.println("Keyboard: " + Lp.KeyBoard);
	        System.out.println("SSD (GB): " + Lp.SSD);
	        System.out.println("Processor: " + Lp.ProcessName);
	        System.out.println("Hard Disk (GB): " + Lp.HardDisk);
	        System.out.println("GPU: " + Lp.GPU);
	        System.out.println("Screen Size (inches): " + Lp.ScreenSize);
	        System.out.println("Motherboard: " + Lp.MotherBoard);
		
		
		
	}

}

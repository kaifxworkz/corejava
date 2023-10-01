package Odc;

public class SoftwareDeveloper {
	String SoftwereDeveloperTotles;
    String ProgramingLag;
    String SoftwereDeveloperTotles1;
    String SoftwereDeveloperTotles2;
    String SoftwereDeveloperTotles3;
    String SoftwereDeveloperTotles4;
    String SoftwereDeveloperTotles5;
    String SoftwereDeveloperTotles6;
    String SoftwereDeveloperTotles7;
    String SoftwereDeveloperTotles8;
	
	
	
    SoftwareDeveloper(	String SoftwereDeveloperTotles,String ProgramingLag, String SoftwereDeveloperTotles1, String SoftwereDeveloperTotles2, String SoftwereDeveloperTotles3,
    String SoftwereDeveloperTotles4,String SoftwereDeveloperTotles5,String SoftwereDeveloperTotles6, String SoftwereDeveloperTotles7,
    String SoftwereDeveloperTotles8)
    {
      this.SoftwereDeveloperTotles =SoftwereDeveloperTotles;
      this.ProgramingLag = ProgramingLag;
      this.SoftwereDeveloperTotles1 =SoftwereDeveloperTotles1;
      this.SoftwereDeveloperTotles2 = SoftwereDeveloperTotles2;
      this.SoftwereDeveloperTotles3 = SoftwereDeveloperTotles3;
      this.SoftwereDeveloperTotles4 = SoftwereDeveloperTotles4;
      this.SoftwereDeveloperTotles5 =SoftwereDeveloperTotles5;
      this.SoftwereDeveloperTotles6 = SoftwereDeveloperTotles6;
      this.SoftwereDeveloperTotles7 = SoftwereDeveloperTotles7;
      this.SoftwereDeveloperTotles8 =SoftwereDeveloperTotles8;
    }
	
	

	public static void main(String[] args) {
		
		SoftwareDeveloper SD = new SoftwareDeveloper("Javascript", "Python", "GO", "java", "PHP", "SQL","HTML","Swift","Ruby","C and C++" );
		
		
	System.out.println("10 most popular program softwere");
	System.out.println();
	System.out.println("Name of the Softwere: " + SD.SoftwereDeveloperTotles );
	System.out.println("Name of the Softwere: " + SD.SoftwereDeveloperTotles1 );
	System.out.println("Name of the Softwere: " + SD.SoftwereDeveloperTotles2 );
	System.out.println("Name of the Softwere: " + SD.SoftwereDeveloperTotles3 );
	System.out.println("Name of the Softwere: " + SD.SoftwereDeveloperTotles4 );
	System.out.println("Name of the Softwere: " + SD.SoftwereDeveloperTotles5 );
	System.out.println("Name of the Softwere: " + SD.SoftwereDeveloperTotles6 );
	System.out.println("Name of the Softwere: " + SD.SoftwereDeveloperTotles7 );
	System.out.println("Name of the Softwere: " + SD.SoftwereDeveloperTotles8 );
	System.out.println("Name of the Softwere: " + SD.ProgramingLag );
	
	}

}

package Odc;

public class Condition {

	public static void main(String[] args) {

      findZero(2);
      checkagr(8);
      OddorEven(2);
      Marks(99);
      Year(200);
	}
	
	 //Number is zero are not 
      static void findZero(int numbaer) {
    	
    	  if(numbaer>0) {
    		  System.out.println("The Numbaer is POSITIVE");
    	  }else if(numbaer<0) {
    		  System.out.println("The Number is NEGATIVE");
    	  }else {
    		  System.out.println("The Number is ZERO");
    	  }
    	  
      }
      
       
      //Vote or not
        static void checkagr(int age) {
        	if(age >= 18) {
        		System.out.println("Eliglbi to voot");
        	 }else if(age <= 8) {
        		 System.out.println("sorry");
        	 }
        	else {
        		System.out.println("not eligbli");
        	}
        }

        static void OddorEven(int Numbaer) 
        {
        	if(Numbaer %2 ==0) {
        		System.out.println("The Numbaer is Even");
        	}else {
        		System.out.println("The Numbaer is Odd");
        	}
        }
        
        
        
        //It is a program of grading system for file,Pass,Grade 
        static void Marks(int Marks) {
        	if(Marks < 50) {
        		System.out.println("Fail");
         	}else if(Marks >=50 && Marks<60) {
         		System.out.println("D grade");
         	}else if(Marks >=60 && Marks<70) {
         		System.out.println("C grade");
         	}else if(Marks >=70 &&  Marks<80) {
         		System.out.println("B grade");
         	}else if(Marks >=80 &&Marks<90) {
         		System.out.println("A grade");
         	}else if(Marks >=90 && Marks<100) {
         		System.out.println("A+ grade");
         	}else{
         		System.out.println("Invaild");;
         		}
        }
        
        
        //Leap Year
        static void Year(int year) {
        	if(year%4==0 && year%100!=0 &&year%400==0) {
        		System.out.println("Leap Year");
        	}else {
        		System.out.println("Common year");
        	}
        }
        
}


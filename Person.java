package Odc;

public class Person {
	
	    private String name;
	    private String address;
	    private String email;
	    private String phoneNumber;
	    private String dateOfBirth;
	    private String nationality;
	    private String gender;
	    private String occupation;
	    private String maritalStatus;
	    private String socialSecurityNumber;
	    private static String country;
	    private static String language;
	    private static int totalPersons;

	    static {
	        country = "Indian";
	        language = "Hindi";
	        totalPersons = 0;
	    }

	    public Person(String name, String address, String email, String phoneNumber, String dateOfBirth, String nationality, String gender, String occupation, String maritalStatus, String socialSecurityNumber) {
	        this.name = name;
	        this.address = address;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	        this.dateOfBirth = dateOfBirth;
	        this.nationality = nationality;
	        this.gender = gender;
	        this.occupation = occupation;
	        this.maritalStatus = maritalStatus;
	        this.socialSecurityNumber = socialSecurityNumber;
	        totalPersons++;
	    }

	    // Getter and setter methods for instance variables

	    public static void main(String[] args) {
	        Person person1 = new Person("John Doe", "123 Main St", "john@example.com", "555-1234", "01/15/1990", "American", "Male", "Engineer", "Single", "123-45-6789");
	        Person person2 = new Person("Jane Smith", "456 Elm St", "jane@example.com", "555-5678", "05/20/1985", "American", "Female", "Doctor", "Married", "987-65-4321");
	        Person person3 = new Person("David Brown", "789 Oak St", "david@example.com", "555-9876", "11/10/2000", "Canadian", "Male", "Student", "Single", "234-56-7890");

	        // Create more objects if needed

	        // Accessing static variables
	        System.out.println("Country: " + Person.country);
	        System.out.println("Language: " + Person.language);
	        System.out.println("Total Persons: " + Person.totalPersons);
	        
	    }
	}

	


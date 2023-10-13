

public class Mobile {

	    enum MobileType {
	        ANDROID, IOS, WINDOWS
	    }

	    private String name;
	    private MobileType type;
	    private int price;
	    private char grade;

	    public Mobile(String name, MobileType type, int price, char grade) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	        this.grade = grade;
	    }

	    public String getName() {
	        return name;
	    }

	    public MobileType getType() {
	        return type;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public char getGrade() {
	        return grade;
	    }

	    public static boolean compareMobileType(Mobile.MobileType first, Mobile.MobileType second) {
	        return first.equals(second);
	    }

	    public static boolean compareMobilePrice(Mobile first, Mobile second) {
	        return first.getPrice() == second.getPrice();
	    }

	    public static boolean compareMobileGrade(Mobile first, Mobile second) {
	        return first.getGrade() == second.getGrade();
	    }

	    public static void main(String[] args) {
	        Mobile mobile1 = new Mobile("Samsung", MobileType.ANDROID, 500, 'A');
	        Mobile mobile2 = new Mobile("iPhone", MobileType.IOS, 1000, 'A');

	        System.out.println(compareMobileType(mobile1.getType(), mobile2.getType()));
	        System.out.println(compareMobilePrice(mobile1, mobile2));
	        System.out.println(compareMobileGrade(mobile1, mobile2));
	    }
	}



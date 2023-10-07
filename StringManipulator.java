

public class StringManipulator {
    private String greeting = "Hello, World!";
    private String programmingLanguage = "Java is a versatile language.";
    private String importance = "String manipulation is important.";
    private String awesomeness = "Java programming is awesome!";
    private String exploration = "Let's explore string methods.";
    private String whitespaceTest = "   This is a whitespace test.   ";
    private String languages = "Java,Python,JavaScript,C++,C#";
    private String fruits = "apple,banana,cherry,dates";
    private String welcomeMessage = "Welcome to the world of Java programming.";
    private String learning = "I am learning Java.";

    public void isEmptyDemo() {
        System.out.println("\nisEmpty() Method:");
        System.out.println("Is 'greeting' empty? " + greeting.isEmpty());
        System.out.println("Is 'whitespaceTest' empty after trimming? " + whitespaceTest.trim().isEmpty());
    }

    public void lengthDemo() {
        System.out.println("\nlength() Method:");
        System.out.println("Length of 'programmingLanguage': " + programmingLanguage.length());
    }

    public void equalsDemo() {
        System.out.println("\nequals() Method:");
        System.out.println("Are 'importance' and 'awesomeness' equal? " + importance.equals(awesomeness));
    }

    public void charAtDemo() {
        System.out.println("\ncharAt() Method:");
        System.out.println("Character at index 7 in 'exploration': " + exploration.charAt(7));
    }

    public void caseConversionDemo() {
        System.out.println("\ntoUpperCase() and toLowerCase() Methods:");
        System.out.println("Uppercase 'fruits': " + fruits.toUpperCase());
        System.out.println("Lowercase 'welcomeMessage': " + welcomeMessage.toLowerCase());
    }

    public void trimDemo() {
        System.out.println("\ntrim() Method:");
        System.out.println("Trimmed 'whitespaceTest': \"" + whitespaceTest.trim() + "\"");
    }

    public void valueOfDemo() {
        System.out.println("\nvalueOf() Method:");
        int number = 42;
        String numberAsString = String.valueOf(number);
        System.out.println("Value of 42 as a String: " + numberAsString);
    }

    public void codePointAtDemo() {
        System.out.println("\ncodePointAt() Method:");
        int codePoint = languages.codePointAt(0);
        System.out.println("Code point at the beginning of 'languages': " + codePoint);
    }

    public void equalsIgnoreCaseDemo() {
        System.out.println("\nequalsIgnoreCase() Method:");
        System.out.println("Are 'awesomeness' and 'learning' equal (ignoring case)? " + awesomeness.equalsIgnoreCase(learning));
    }

    public void concatDemo() {
        System.out.println("\nconcat() Method:");
        String concatenated = greeting.concat(" ").concat(programmingLanguage);
        System.out.println("Concatenated 'greeting' and 'programmingLanguage': " + concatenated);
    }

    public void replaceDemo() {
        System.out.println("\nreplace() Method:");
        String replaced = welcomeMessage.replace("Java", "Python");
        System.out.println("Replaced 'Java' with 'Python' in 'welcomeMessage': " + replaced);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator();

        stringManipulator.isEmptyDemo();
        stringManipulator.lengthDemo();
        stringManipulator.equalsDemo();
        stringManipulator.charAtDemo();
        stringManipulator.caseConversionDemo();
        stringManipulator.trimDemo();
        stringManipulator.valueOfDemo();
        stringManipulator.codePointAtDemo();
        stringManipulator.equalsIgnoreCaseDemo();
        stringManipulator.concatDemo();
        stringManipulator.replaceDemo();
    }
}

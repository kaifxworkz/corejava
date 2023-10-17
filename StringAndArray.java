public class StringAndArray {
    public static void main(String[] args) {
        // Creating strings in both ways
        String string1 = "Hello";
        String string2 = new String("World");

        // Using string methods
        System.out.println("Length of string1: " + string1.length());
        System.out.println("Concatenated string: " + string1.concat(string2));
        System.out.println("Index of 'e' in string1: " + string1.indexOf('e'));
        System.out.println("Uppercase: " + string1.toUpperCase());
        System.out.println("Lowercase: " + string2.toLowerCase());
        System.out.println("Substring: " + string1.substring(1, 3));
        System.out.println("Replace: " + string2.replace('o', 'p'));
        System.out.println("Trim: " + "   Trimmed   ".trim());
        System.out.println("Equals: " + string1.equals(string2));
        System.out.println("CompareTo: " + string1.compareTo(string2));

        // Creating an int array
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Printing array values
        System.out.println("Printing array values from the middle:");
        for (int i = intArray.length / 2; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\nPrinting array values in reverse, skipping one value:");
        for (int i = intArray.length - 1; i >= 0; i -= 2) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\nPrinting only even numbers:");
        for (int value : intArray) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
    }
}

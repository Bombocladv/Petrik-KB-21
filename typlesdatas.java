import java.util.Scanner;

public class datatypes {

    public static void main(String[] args) {
        printdatatypes();
        Scanner scanner = new Scanner(System.in);
     
        //Числоль
        System.out.println("Введеня числа (int): ");
        String intInput = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println("Введений int: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Неправильний int.");
        }
      
        //Число з точечкою
        System.out.println("Введеня числа з точечкою (double): ");
        String doubleInput = scanner.nextLine();
        try {
            double doubleValue = Double.parseDouble(doubleInput);
            System.out.println("Введений double: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Неправильна точечка double.");
        }
       
        //Число з крапочкою
        System.out.println("Введеня числа з крапочкою (float): ");
        String floatInput = scanner.nextLine();
        try {
            float floatValue = Float.parseFloat(floatInput);
            System.out.println("Введений float: " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("Неправильний float.");
        }     
       
        //Міні число
        System.out.println("Введеня коротенького числа (short): ");
        String shortInput = scanner.nextLine();
        try {
            short shortValue = Short.parseShort(shortInput);
            System.out.println("Введений short: " + shortValue);
        } catch (NumberFormatException e) {
            System.out.println("Неправильнийй short.");
        }
  
        //Довжилезне число
        System.out.println("Введеня довгого числа (long): ");
        String longInput = scanner.nextLine();
        try {
            long longValue = Long.parseLong(longInput);
            System.out.println("Введений long: " + longValue);
        } catch (NumberFormatException e) {
            System.out.println("Неправильний long.");
        }
       
        //Булінгове значеня
        System.out.println("Введеня бульового значеня (true/false): ");
        String booleanInput = scanner.nextLine();
        boolean booleanValue = Boolean.parseBoolean(booleanInput);
        System.out.println("Введений boolean: " + booleanValue);
        scanner.close();
    }    
        //Іерогліф
        System.out.println("Введеня символу (char): ");
        String charInput = scanner.nextLine();
        if (charInput.length() == 1) {
            char charValue = charInput.charAt(0);
            System.out.println("Введений char: " + charValue);
        } else {
            System.out.println("Не той іерогліф.");
        }
      
    //Прімітівні типи даних
    public static void printdatatypes() {
        System.out.println("Про прітівівні типи в Javаa:");
        System.out.printf("%-10s | %-10s | %-20s | %-20s%n", "Тип", "Розмір (байти)", "Мін. знач.", "Макс. знач.");
        System.out.printf("%-10s | %-10d | %-20d | %-20d%n", "byte", 1, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%-10s | %-10d | %-20d | %-20d%n", "short", 2, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%-10s | %-10d | %-20d | %-20d%n", "int", 4, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%-10s | %-10d | %-20d | %-20d%n", "long", 8, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%-10s | %-10d | %-20s | %-20s%n", "float", 4, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("%-10s | %-10d | %-20s | %-20s%n", "double", 8, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("%-10s | %-10d | %-20s | %-20s%n", "char", 2, Character.MIN_VALUE, Character.MAX_VALUE);
        System.out.printf("%-10s | %-10s | %-20s | %-20s%n", "boolean", 1, "false", "true");
    }
}

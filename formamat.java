import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введення:");
        //Числоль
        System.out.print("Введеня числа (int): ");
        int a = Integer.parseInt(scanner.nextLine());
        //Числоль с крапочкою
        System.out.print("Введеня числа з крапочкою (double): ");
        double b = Double.parseDouble(scanner.nextLine());
        //Буллінг Значення
        System.out.print("Введеня бул. значеня (true/false): ");
        boolean d = Boolean.parseBoolean(scanner.nextLine());
        //строчечка
        System.out.print("Введеня строчки: ");
        String c = scanner.nextLine();

        System.out.println("Виведеня значенЬ:");
        System.out.printf("Число (8): %o%n", a);
        System.out.printf("Число (10): %d%n", a);
        System.out.printf("Число (16): %x%n", a);
        System.out.printf("Число з крапочкою (стандарт.): %f%n", b);
        System.out.printf("Число з крапочкою (експ.): %e%n", b);
        System.out.printf("Число з крапочкою (16): %a%n", b);
        System.out.printf("Строка: %s%n", c);
        System.out.printf("Строка (c): %s%c%n", c,'!');
        System.out.printf("Строка (16): %h%n", c);
        System.out.printf("Значенянь: %b%n", d);
        scanner.close();
    }
}

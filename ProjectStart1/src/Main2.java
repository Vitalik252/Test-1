import java.util.Scanner;

public class Main2 {
    public static void main(String[] agrs) {
        var scanner = new Scanner(System.in);

        System.out.println("Введіть вагу посилки: ");
        var weight = scanner.nextDouble();

        System.out.println("Введіть вартість доставки 1кг: ");
        var prise = scanner.nextDouble();


        var result = weight * prise;
        System.out.println("Ціна доставки посилки = " + result);
            }
        }



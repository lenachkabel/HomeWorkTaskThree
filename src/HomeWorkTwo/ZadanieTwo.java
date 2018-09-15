package HomeWorkTwo;
import java.util.Scanner;

public class ZadanieTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату");
        int a = scanner.nextInt();
        switch (a) {
            case 31: {
                System.out.println("январь,март, май июль август октябрь декабрь");
            }
            case 30: {
                System.out.println("апрель, июнь, сентябрь, ноябрь");
                break;
            }
            default: {
                System.out.println("Дата есть во всех месяцах");
            }
        }


    }
}

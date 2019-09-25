import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_1 {
    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            int num = in.nextInt();
            in.close();

            System.out.print("Число " + num + " ");

            // проверка числа на то, является ли оно простым или составным
            if ((num % 2==0)&&(num!=2)) {
                System.out.println("составное");
            } else {

                System.out.println("простое");}

            System.out.print("Число " + num + " ");
            // проверка числа на четность или нечетность
            if (num % 2 == 0) {    // необходимо, чтобы число делилось на 2 без остатка (деление по модулю)
                System.out.println("четное");
            } else {
                System.out.println("нечетное");

            } } catch(InputMismatchException e){ // отлавливаем исключение

            System.out.println("Ошибка при вводе числа! Необходимо вводить целое число!");
            System.out.println("Запустите программу еще раз и введите целое число.");

        }
    }
}

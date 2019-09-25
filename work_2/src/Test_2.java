import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_2 {
    public static void main(String args[]) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Пожалуйста, ведите первое число: ");
            int a = in.nextInt();
            System.out.print("Пожалуйста, ведите второе число: ");
            int b = in.nextInt();
            System.out.println("Наибольший общий делитель (НОД) = " + getNod(a, b) + ".");
            System.out.println("Наименьшее общее кратное (НОК) = " + getNok(a, b) + ".");
            in.close();
        } catch (InputMismatchException e){ // отлавливаем исключение

            System.out.println("Ошибка при вводе числа! Необходимо вводить целое число!");
            System.out.println("Запустите программу еще раз и введите целое число.");
        }

    }

    static int getNod(int a, int b) {
        int nod = 1;
        if (a > b)
            for (int i = b; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    return i;
                }
            } else {
            for (int j = a; j >= 1; j--) {
                if (a % j == 0 && b % j == 0) {
                    return j;
                }
            }
        }
        return nod;
    }

    static int getNok(int a, int b) {

        int nok;
        nok = a * b / getNod(a, b);
        return nok;

    }
}

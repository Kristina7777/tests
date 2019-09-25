import java.util.Scanner;

public class Test_5 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 0 до 100: ");
        int max_n = in.nextInt();
        in.close();

        if (max_n <= 100) {
            for (int num=0; num<=max_n;num ++) {

                if (num == inverse(num)) {
                    System.out.println("Число " + "<<" + num + ">>" + " является числом палиндромом");

                } else {
                    System.out.println("Число " + "<<" + num + ">>" + " не является числом палиндромом");

                }
            }

        } else {
            System.out.println("Некорректный ввод!");
            System.out.println("Необходимо ввести число от 0 до 100");
        }
    }

    private static int inverse ( int value){
        int result = 0;
        while (value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }

        return result;
    }
}

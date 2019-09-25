public class Test_6 {
    static int[] values = new int[] {150, 3, 894, 50, 270}; // стоимость
    static int[] weights = new int[] {4, 11, 20, 6, 7}; // вес
    static int W = 30; // максимальная грузоподъемность


    private static int knapsack(int i, int W) { // рюкзак
        if (i < 0) {
            return 0;
        }
        if (weights[i] > W) {
            return knapsack(i-1, W);
        } else {
            return Math.max(knapsack(i-1, W), knapsack(i-1, W - weights[i]) + values[i]);

        }
    }

    public static void main(String[] args) {
        System.out.println ("Рюкзак не превышает грузоподъемность = " + W);
        System.out.print ("Суммарная ценность груза максимизирована и = ");
        System.out.print(knapsack(values.length - 1, W));
    }
}

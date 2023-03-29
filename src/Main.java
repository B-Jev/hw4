import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println();

        double[] numberD = {1.57, 7.654, 9.986};
        System.out.println(numberD[0]);
        System.out.println(numberD[1]);
        System.out.println(numberD[2]);
        System.out.println();

        int[] numberV = {43, 573, 992, 564};
        System.out.println(numberV[0]);
        System.out.println(numberV[1]);
        System.out.println(numberV[2]);
        System.out.println(numberV[3]);
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.print(number[0] + ", ");
        System.out.print(number[1] + ", ");
        System.out.print(number[2]);
        System.out.println();

        double[] numberD = {1.57, 7.654, 9.986};
        System.out.print(numberD[0] + ", ");
        System.out.print(numberD[1] + ", ");
        System.out.print(numberD[2]);
        System.out.println();

        int[] numberV = {43, 573, 992, 564};
        System.out.print(numberV[0] + ", ");
        System.out.print(numberV[1] + ", ");
        System.out.print(numberV[2] + ", ");
        System.out.print(numberV[3]);
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.print(number[2] + ", ");
        System.out.print(number[1] + ", ");
        System.out.print(number[0]);
        System.out.println();

        double[] numberD = {1.57, 7.654, 9.986};
        System.out.print(numberD[2] + ", ");
        System.out.print(numberD[1] + ", ");
        System.out.print(numberD[0]);
        System.out.println();

        int[] numberV = {43, 573, 992, 564};
        System.out.print(numberV[3] + ", ");
        System.out.print(numberV[2] + ", ");
        System.out.print(numberV[1] + ", ");
        System.out.print(numberV[0]);
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача 4");
        int[] number = {1, 2, 33, 74, 12, 3};
        for (int index = 0; index < number.length; index++) {
            if (number[index] % 2 != 0) {
                number[index] = number[index] + 1;
            }
            System.out.print(number[index] + " ,");
        }
    }
}
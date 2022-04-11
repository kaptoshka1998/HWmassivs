package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //забыла создать новую ветку XD

        int[] array = generateRandomArray();
        System.out.println();

        //Задание 1

        int summ = 0;
        for (int i = 0; i < array.length; i++) {
           summ = summ + array [i];
        }
        System.out.println(summ);

        //Задание 2
        
        int max = 99000;
        int min = 201000;
        for (int i = 0; i < array.length; i++) {
            if (array [i] > max){
                max = array [i];
            }
            if (array [i] < min){
                min = array [i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");

        //Задание 3

        double middle = 0;
        for (int i = 0; i < array.length; i++) {
            summ = summ + array [i];
        }
        middle = summ / 30;
        System.out.println(middle);

        //Задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
            }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.print(arr[i] + " ");
        }

        return arr;


    }
}

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for(int e : arr) {
            sum += e;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей%n", sum);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minSum > arr[i]) {
                minSum = arr[i];
            }
            if (maxSum < arr[i]) {
                maxSum = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. "
                + "Максимальная сумма трат за день составила %d рублей%n", minSum, maxSum);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for(int e : arr) {
            sum += e;
        }
        double avg = (double) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n", avg);
    }

    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0  ; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}
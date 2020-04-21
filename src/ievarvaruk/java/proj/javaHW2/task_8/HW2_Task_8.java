package ievarvaruk.java.proj.javaHW2.task_8;

//Task 8
// Даны числа от 0 до 100.
// - Посчитать сумму четных и вывести на экран
// - Посчитать сумму нечетных и вывести на экран
// - Найти общую сумму всех чисел

public class HW2_Task_8 {
    public static void main(String[] args) {
        int k = 0;
        int j = 0;
        int k1;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                k = k + i;                      //Сумма всех отрицательных
            }
            if (i % 2 == 0) {
                j = j + i;                      //Сумма всех положительных
            }
        }
        k1 = k + j;                             //Общая сумма
        System.out.println("Сумма всех нечётных чисел от 0 до 100 равна " + k);
        System.out.println("Сумма всех чётных чисел от 0 до 100 равна " + j);
        System.out.println("Сумма всех чисел от 0 до 100 равна " + k1);
    }
}

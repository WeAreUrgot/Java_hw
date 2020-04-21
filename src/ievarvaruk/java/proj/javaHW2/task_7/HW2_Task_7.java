package ievarvaruk.java.proj.javaHW2.task_7;

public class HW2_Task_7 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                k = k + i;                      //Сумма всех отрицательных
            }
        }
        System.out.println("Сумма всех нечётных чисел от 0 до 100 равна " + k);
    }
}

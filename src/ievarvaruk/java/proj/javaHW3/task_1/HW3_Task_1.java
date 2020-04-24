package ievarvaruk.java.proj.javaHW3.task_1; // имена пакетов с маленькой буквы
// Создать массив из 3 элементов.
// При помощи класса сканер и пользователя заполнить его.
// Вывести сумму, наименьшее и наибольшее из чисел на экран.
import java.util.Scanner;
public class HW3_Task_1 {
    public static void main(String[] args) {
        int[] ar = new int[3]; //Ввод значений, работа с пользователем
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Введите " + (i + 1) + "-е значение: ");
            ar[i] = scanner.nextInt();
        }
        // старайся не оставлять комментарии в коде
        int min = ar[0]; //Ввод переменных для расчёта
        int max = ar[0];
        int summary = 0;
        
        // цикл стоит вынести в отдельный метод
        for (int val : ar) { //Использование введённого значения
            summary += val;
            if (min > val) { //Расчёт
                min = val;
            } else {
                max = val;
            }
        }
        System.out.println("Сумма элементов = " + summary);
        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение = " + min);
    }
}

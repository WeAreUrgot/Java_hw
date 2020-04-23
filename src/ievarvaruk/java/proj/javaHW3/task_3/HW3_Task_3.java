package ievarvaruk.java.proj.javaHW3.task_3;
//Task 3
//Есть массив чисел. Заменить каждый нечетный элемент массива на 0.

public class HW3_Task_3 {
    public static void main(String[] args) {
        int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 100); //"Рандомайзер" значений
            System.out.println((i + 1) + "-е значение: " + ar[i]);
        }
        {
            int i = 0;
            while (i < ar.length) {
                if (ar[i] % 2 != 0) {
                    ar[i] = 0;
                }
                i++;
            }
        }
        int i = 0;
        while (i < ar.length) {
            System.out.println("Новое " + i + " -е значение = " + ar[i]);
            i++;
        }
    }
}

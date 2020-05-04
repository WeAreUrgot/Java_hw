package ievarvaruk.java.proj.javahw3.task_6;

//Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого

import java.util.Arrays;

public class HW3_Task_6 {
    public static void main(String[] args) {
        int[] ar = new int[10];
        fill_in(ar);
        System.out.println(Arrays.toString(ar));
        sort(ar);
        System.out.println("==После сортировки==");
        System.out.println(Arrays.toString(ar));
    }

    public static void fill_in(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 100);
        }
    }
    public static void sort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0){
                ar[i] = 0;
            }
        }
    }
}

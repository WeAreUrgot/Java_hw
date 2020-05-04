package ievarvaruk.java.proj.javahw3.task_5;

//Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0]

import java.util.Arrays;

public class HW3_Task_5 {
    public static void main(String[] args) {
        int[] ar = new int[5];
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
        int tmp1 = ar[0];
        int tmp2 = ar[1];
        ar[0] = ar[4];
        ar[1] = ar[3];
        ar[4] = tmp1;
        ar[3] = tmp2;
    }

}

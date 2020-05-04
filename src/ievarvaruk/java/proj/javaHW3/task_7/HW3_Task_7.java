package ievarvaruk.java.proj.javaHW3.task_7;

import java.util.Arrays;

public class HW3_Task_7 {
    public static void main(String[] args) {
        int[] arrayToSort = {9, 1, 4, 0};

            System.out.println(Arrays.toString(arrayToSort));

            sort(arrayToSort);

            System.out.println("==After sort==");
            System.out.println(Arrays.toString(arrayToSort));
        }

        public static void sort(int[] array) {
            boolean needToSort = true;
            while (needToSort) {
                needToSort = false;
                for (int i = 1; i < array.length; i++) {
                    if (array[i - 1] > array[i]) {
                        swap(array, i - 1, i);

                        needToSort = true;
                    }
                }
            }
        }

        public static void swap(int[] array, int left, int right) {
            int tmp = array[right];
            array[right] = array[left];
            array[left] = tmp;
        }
}

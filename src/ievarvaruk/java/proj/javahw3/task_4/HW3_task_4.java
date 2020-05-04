package ievarvaruk.java.proj.javahw3.task_4;

//При помощи двумерного массива вывести на экран таблицу умножения

public class HW3_task_4 {
    public static void main(String[] args) {
        System.out.print(" ");
        int[][] ar = new int[11][11];
        for (int i = 1; (i) < ar.length; i++) {
            for (int j = 1; (j) < ar[i].length; j++) {
                if (j != 10) {
                    System.out.print(i + " * " + j + " = " + (i * j) + "  ");
                } else {
                    System.out.println(i + " * " + j + " = " + (i * j) + " ");
                }
                if ((i * j) < 10) {
                    System.out.print(" ");
                }
                if (i < 10) {
                    System.out.print(" ");
                }
            }
        }
    }
}

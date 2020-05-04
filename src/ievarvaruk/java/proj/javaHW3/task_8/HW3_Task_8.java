package ievarvaruk.java.proj.javaHW3.task_8;

//Нарисовать на консоли бабочку. Пример вывода в butterfly.png
//Как пользователь, я бы хотел иметь возможность задать размер бабочки (высоту и ширину)

import java.util.Arrays;

public class HW3_Task_8 {
    public static void main(String[] args) {
        int[][] ar = new int[5][5];
        int mid_1 = (ar.length/2);
        //fill_in(ar);
        //fill_in(mid_1);
        for (int i = 0; i < ar.length; i++) {
            //for (int j = 0; (j) < ar[i].length; j++) {
                //ar[i][j]=i+j;
                System.out.println(Arrays.toString(ar[i]));
                //System.out.print(j);
            //}

        }
    }
}
package ievarvaruk.java.proj.javahw2.task_4;
//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
public class HW2_Task_4 {
    public static void main(String[] args) {
        int x = Integer.valueOf(args[0]);
        int y = Integer.valueOf(args[1]);
        int z = 0;
        for (int i = 1; i < (y + 1); i++) {
            z = z + x;
        }
        System.out.println(args[0] + "*" + args[1] + "=" + z);
    }
}



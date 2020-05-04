package ievarvaruk.java.proj.javahw2.task_3;

//Task 3
//Вычислить: 1+2+4+8+...+256
public class HW2_Task_3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        for (int i = 1; i < 257; i++) {
            a = a * 2;
            b += a;
            i = a;
        }
        System.out.println(b);
    }
}
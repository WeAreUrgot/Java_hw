package ievarvaruk.java.proj.javahw2.task_6;

//Task 6
//Напишите программу вывода всех четных чисел от 2 до 100 включительно
public class HW2_Task_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " / ");
            }
        }
    }
}

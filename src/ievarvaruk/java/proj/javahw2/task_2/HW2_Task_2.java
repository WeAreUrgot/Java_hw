package ievarvaruk.java.proj.javahw2.task_2;

//Task 2
//Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class HW2_Task_2 {
    public static void main(String[] args) {
        int am = 1;
        for (int i = 1; i < 25; i++) {
            if (i % 3 == 0) {
                am = 2 * am;
                System.out.println("Прошёл" + i + " час. Поделились. Итого: " + am);
            }
        }
    }
}
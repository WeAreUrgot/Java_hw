package ievarvaruk.java.proj.javaHW2.task_1;

//Task 1
//Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
//день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
//суммарный путь пробежит спортсмен за 7 дней?

public class HW2_Task_1 {
    public static void main(String[] args) {
        double DayX = 10; //double т.к. работаем с числами с плавающей точкой
        double Sum = 0;
        for (int i = 1; i < 8; i++) {
            Sum += DayX + (Sum / 10);
        }
        Sum += DayX;
        System.out.println("За 7 дней путь спортсмена составил = " + Sum + " км");
    }
}

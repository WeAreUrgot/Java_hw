package ievarvaruk.java.proj.javahw2.task_5;

import java.text.DecimalFormat; // Да, да, я знаю, что мы этого не проходили. Но меня числа в результате бесили!

//Task 5
//Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
//для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
public class HW2_Task_5 {
    public static void main(String[] args) {
        double a = 2.51;
        for (int i = 1; i < 21; i++) {
            DecimalFormat df = new DecimalFormat("#.##"); //Выставляю формат отображения результата
            System.out.println(i + " дюйм = " + (df.format(i * a)) + " см");
        }
    }
}
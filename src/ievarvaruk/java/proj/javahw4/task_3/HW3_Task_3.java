package ievarvaruk.java.proj.javahw4.task_3;

import ievarvaruk.java.proj.javahw4.task_1.*;

public class HW3_Task_3 {
    private static Integer countEquals = 1;

    public static void main(String[] args) {
        HW4_Task1_jam[] arrayPerson = new HW4_Task1_jam[3];
        arrayPerson[0] = new HW4_Task1_jam("Aaron", 13);
        arrayPerson[1] = new HW4_Task1_jam("Bob", 15);
        arrayPerson[2] = new HW4_Task1_jam("Cristian", 24);
        Equals(arrayPerson);
        System.out.println("Количество одинаковых объектов = " + countEquals);
    }

    public static void Equals(HW4_Task1_jam[] arrayPerson) {
        for (int i = 0; i < arrayPerson.length; i++) {
            for (int j = i + 1; j < arrayPerson.length; j++) {
                System.out.println(arrayPerson[i].show() + "; " + arrayPerson[j].show() + "; Equals: " + arrayPerson[i].equals(arrayPerson[j]));
                boolean equals = arrayPerson[i].equals(arrayPerson[j]);
                if (equals) {
                    countEquals++;
                }
            }
        }
    }
}

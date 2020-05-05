package ievarvaruk.java.proj.javahw4.task_4;

import ievarvaruk.java.proj.javahw4.task_1.*;

public class HW4_Task_4 {
    public static void main(String[] args) {
        HW4_Task1_jam person = new HW4_Task1_jam();
        HW4_Task1_jam personOne = new HW4_Task1_jam();
        HW4_Task1_jam personTwo = new HW4_Task1_jam();
        HW4_Task1_jam personThree = new HW4_Task1_jam();
        System.out.println(person.showTextvalue());
        personOne.setText("Another value");
        System.out.println(personOne.showTextvalue());
        System.out.println(personTwo.showTextvalue());
        System.out.println(personThree.showTextvalue());
    }
}

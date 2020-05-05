package ievarvaruk.java.proj.javahw5.task_2;

import java.util.Arrays;

public class MainWarehouse {
    public static void main(String[] args) {
        Integer[] firstArray = {6, 5, 999, 24, 35};
        Warehouse warehouse = new Warehouse(firstArray);
        firstArray[0] = 4;
        System.out.println("==" + warehouse + "==");
        warehouse.next();
        Integer[] secArray = warehouse.getArray();
        System.out.println("== Second Array : " + Arrays.toString(secArray) + "==");
    }
}
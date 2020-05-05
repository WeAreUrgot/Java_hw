package ievarvaruk.java.proj.javahw5.task_2;

import java.util.Arrays;

public class Warehouse {
    private Integer[] array;
//  - это зачем?
    public Warehouse(Integer[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }
// - это зачем?
    public String toString() {
        return "First Array : " + Arrays.toString(array);
    }
// - это зачем?
    /* метод next() по условию должен вернуть 1 элемент массива, поэтому сигнатура должна быть
    public int next() {}
    */
    public void next() {
        for (int i = 0; i <= array.length; i++) {
            if (i == array.length) {
                System.out.println("++" + array[0] + "++");
            } else {
                System.out.println("--" + array[i] + "--");
            }
        }
    }
// - это зачем?
    // по условию массив нельзя изменять, а ты при помощи геттера предоставил к нему доступ, теперь его можно изменить
    public Integer[] getArray() {
        return array;
    }
}

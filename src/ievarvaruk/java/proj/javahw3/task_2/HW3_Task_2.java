package ievarvaruk.java.proj.javahw3.task_2; // имена пакетов с маленькой буквы

//Есть массив чисел. Найти среднее арифметическое число элементов массива

public class HW3_Task_2 {
    public static void main(String[] args) {
        int[] ar = new int[10];
        
        // не принципиально, но думаю цикл for здесь бы лучше подошел
        int i = 0;
        while (i < ar.length) {
            ar[i] = (int) (Math.random() * 100);
            System.out.println((i + 1) + "-е значение: " + ar[i]);
            i++;
        }
        // Sum -> sum - имена переменных с маленькой буквы
        int sum = 0; //Вычисление ср. арифметического
        for (int val : ar) {
            sum += val;
        }
        sum = sum / ar.length; // если получится дробное число, то ответ будет некорректным
        System.out.println("Среднее арифметическое: " + sum);
    }
}

package ievarvaruk.java.proj.javaHW3.task_2;

//Есть массив чисел. Найти среднее арифметическое число элементов массива
public class HW3_Task_2 {
    public static void main(String[] args) {
        int[] ar = new int[10];
        int i = 0;
        while (i < ar.length) {
            ar[i] = (int) (Math.random() * 100); //"Рандомайзер" значений
            System.out.println((i + 1) + "-е значение: " + ar[i]);
            i++;
        }
        int Sum = 0; //Вычисление ср. арифметического
        for (int val : ar) {
            Sum += val;
        }
        Sum = Sum / ar.length;
        System.out.println("Среднее арифметическое: " + Sum);
    }
}
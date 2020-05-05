package ievarvaruk.java.proj.javahw5.task_1;

public class Comp implements CompInt {

//
    @Override
    public void compOn() {
        System.out.println("Компьютер включен ");
    }
//
    @Override
    public void compOff() {
        System.out.println("Компьютер выключен ");
    }
//
    @Override
    public void reset() {
        System.out.println("Перезагрузка... ");
    }
}
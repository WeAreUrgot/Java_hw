package ievarvaruk.java.proj.javahw5.task_1;

// Comp -> ComputerImpl (impl = implementation)
public class Comp implements CompInt {

// - это зачем?
    @Override
    public void on() {
        System.out.println("Компьютер включен ");
    }
// - это зачем?
    @Override
    public void off() {
        System.out.println("Компьютер выключен ");
    }
// - это зачем?
    @Override
    public void reset() {
        System.out.println("Перезагрузка... ");
    }
}

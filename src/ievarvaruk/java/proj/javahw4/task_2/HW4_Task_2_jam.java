package ievarvaruk.java.proj.javahw4.task_2;

public class HW4_Task_2_jam {
    private static String msg;

    static {
        msg = "static block";
    }

    {
        msg = "regular init block";
    }

    public HW4_Task_2_jam() {
        msg = "constructor value";
    }

    public String toString() {
        return msg;
    }

}


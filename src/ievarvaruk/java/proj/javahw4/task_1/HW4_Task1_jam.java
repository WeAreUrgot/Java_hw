package ievarvaruk.java.proj.javahw4.task_1;

import java.util.Objects;


    public class HW4_Task1_jam {
        private static String text = "Hello from static";
        private static String name;
        private static Integer age;



        // констурктор без аргументов должен идти первым
        public HW4_Task1_jam() {
            this("Jason", 15);
        }

        public HW4_Task1_jam(String name, Integer age) {
            this.name = name;
            this.age = age;
        }


        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public static String show() {
            return "Name = '" + name + "' Age = '" + age + "'";
        }

        public String showTextvalue() {
            return "Text value = " + text;
        }

        public void setText(String text) {
            this.text = text;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true; // не забывай использовать {} после if
            }
            if (o == null || getClass() != o.getClass()) {
                return false; // не забывай использовать {} после if
            }
            HW4_Task1_jam person = (HW4_Task1_jam) o;
            return Objects.equals(name, person.name) &&
                    Objects.equals(age, person.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

    }

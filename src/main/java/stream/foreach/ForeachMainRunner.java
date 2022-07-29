package stream.foreach;

import java.util.Arrays;

public class ForeachMainRunner {

    public static void main(String[] args) {

        int[] array = {5, 9, 3, 8, 1};

        /**
         *  делаю ссылку на метод println
         */
        Arrays.stream(array).forEach(System.out::println);

        Arrays.stream(array).forEach(el -> {
            el *= 2;
            System.out.print(el + " ");
        });
        System.out.println();
        System.out.println("------------------");
        Arrays.stream(array).forEach(Utils::myMethod);


    }
}

class Utils {

    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("element = " + a);
    }
}

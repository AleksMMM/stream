package stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterRunner {

    public static void main(String[] args) {
        Student st1 = new Student("one", "m", 21, 1, 9.1);
        Student st2 = new Student("two", "w", 26, 6, 9.3);
        Student st3 = new Student("three", "m", 25, 2, 9.3);
        Student st4 = new Student("four", "w", 28, 4, 9.2);
        Student st5 = new Student("five", "m", 22, 5, 9.8);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        List<Student> collect = studentList.stream()
                .filter(s -> s.getAge() >= 25 && s.getAvgGrade() < 9.8).collect(Collectors.toList());

        System.out.println(collect);

    }
}

package stream;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MapStream {

    public static void main(String[] args) {

        Set<String> stringSet = new TreeSet<>();
        stringSet.add("ok");
        stringSet.add("kak dela");
        stringSet.add("privet");
        stringSet.add("poka");

        System.out.println(stringSet);

        Set<Integer> collect = stringSet.stream()
                .map(i -> i.length()).collect(Collectors.toSet());

        System.out.println(collect);
    }
}

package jdk11;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVarTypeInferenceLambda {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");
        String out = list.stream()
                .map((var s) -> s.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(out);
    }
}

package pl.helenium.learning.dropwizard.helloworld;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Decipher {

    public static void main(String[] args) throws IOException {
        Files
                .lines(Paths.get("./feed-consumer"))
                .map(onlyIngridients())
                .forEach(System.out::println);
    }

    private static Function<String, String> onlyIngridients() {
        return line -> Arrays.asList(line.split("[\\s\\.,]")).stream()
                .filter(new IsIngredient())
                .map(String::toLowerCase)
                .collect(joining(" "));
    }

}

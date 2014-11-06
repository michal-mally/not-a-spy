package pl.helenium.learning.dropwizard.helloworld;

import com.google.common.collect.ImmutableSet;

import java.util.Set;
import java.util.function.Predicate;

public class IsIngredient implements Predicate<String> {


    private final Set<String> allIngredients= ImmutableSet.copyOf(new String[]{"jelly","rum","oil","walnut","vanilla","yeast","cheese","eggs","salt","plum","sugar","flour","coconut","sesame","strawberries","almonds","coffee","cocoa","chocolate","butter","cinnamon","lemon","milk","banana","marzipan","hazelnut"});

    @Override
    public boolean test(String s) {
        return allIngredients.contains(s.trim());
    }
}

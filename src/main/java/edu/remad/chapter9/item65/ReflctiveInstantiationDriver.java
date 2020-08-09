package edu.remad.chapter9.item65;

import java.util.List;

public class ReflctiveInstantiationDriver {
    public static void main(String[] args) {
        ReflectiveInstantiation.main(List.of("String").toArray(new String[1]));
    }
}

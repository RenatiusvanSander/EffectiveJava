package edu.remad.chapter9.item65;

import java.util.Date;

public class ReflectionInstantiation {

    public static <T> Class<T> initializeStringReflective() throws ClassNotFoundException {
        Class s = Class.forName("java.lang.String");
        return s;
    }

    public static Class<? extends Date> getClassType() {
        Class<Date> c1 = java.util.Date.class;
        System.out.println( c1 );        // class java.util.Date

        Class<?> c2 = new java.util.Date().getClass();
        // oder Class<? extends Date> c2 = ...

        System.out.println( c2 );        // class java.util.Date

        try {
            Class<?> c3 = Class.forName( "java.util.Date" );
            System.out.println( c3 );      // class java.util.Date
        }
        catch ( ClassNotFoundException e ) { e.printStackTrace(); }

        return c1;
    }
}

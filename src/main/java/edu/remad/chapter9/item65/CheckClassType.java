package edu.remad.chapter9.item65;

import java.util.Observable;
import java.util.Observer;

class CheckClassType
{
    public static void main( String[] args )
    {
        checkClassType( Observer.class );
        checkClassType( Observable.class );
        checkClassType( (new int[2][3][4]).getClass() );
        checkClassType( Integer.TYPE );
    }

    static void checkClassType( Class<?> c )
    {
        if ( c.isArray() )
            System.out.println( c.getName() + " ist ein Feld." );
        else if ( c.isPrimitive() )
            System.out.println( c + " ist ein primitiver Typ.");
        else if ( c.isInterface() )
            System.out.println( c.getName() + " ist ein Interface." );
        else
            System.out.println( c.getName() + " ist eine Klasse." );
    }
}
package oca.chapter.one.interfaces;

interface TestInterface {

    //default methods should have body;
    default void call() {}

    //methods are public and abstract by default
    void called();

    //protected access modifier cannnot be daclre for abstract methods
    void calls();

    //private methods are allowed for java 9 and higher
    private void caller(){}

    //private static methods are now also allowed for java 9 and higher
    private static void callers(){}

}

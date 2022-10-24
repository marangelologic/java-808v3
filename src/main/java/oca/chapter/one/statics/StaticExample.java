package oca.chapter.one.statics;

public class StaticExample {
    //static modifier can be assigned to variables
    //methods
    //inner classes
    //inner interface
    //initialization blocks of a class

    private int one = 1;

    //static variable
    private static final String TEST_STATIC_STRING_VARIABLE = "";

    //static method
    private static String testMethod() {
        return "";
    }

    //a static method cannot directly interact with any instance variables.
    private static int testMethodForInt() {
        //return this.one;
        return 0;
    }

    //private can be assigned to static inner class
    private static class someStaticClass {

    }

    //by default inner interfaces are static
    //you can declare an interface private only if it is an inner interface
    private static interface someStaticInterface {

    }

    //initialization block of a class
    static {

    }
}

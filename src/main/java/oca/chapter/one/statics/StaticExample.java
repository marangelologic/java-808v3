package oca.chapter.one.statics;

public class StaticExample {
    //static modifier can be assigned to variables
    //methods
    //inner classes
    //inner interface
    //initialization blocks of a class

    //static variable
    private static final String TEST_STATIC_STRING_VARIABLE = "";

    //static method
    private static String testMethod() {
        return "";
    }

    //private can be assigned to static inner class
    private static class someStaticClass {

    }

    //by default inner interfaces are static
    //you can declare an interface public only if it is an inner interface
    private static interface someStaticInterface {

    }

    //initialization block of a class
    static {

    }
}

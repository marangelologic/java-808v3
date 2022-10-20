package oca.chapter.one.localVariables;

public class LocalVariables {

    //local variables are variables that are declared inside a method
    //local variables lives start and end on the method
    //local variables, if Objects are still created on heap but its life is stored in stack
    // you cannot use local variables outside the method, or try

    public int testLocalVariables() {

        //final is the only modifier you can assign to a local variable
        final int test = 0;
        //if a local variable is not initialized, you cannot use it in any way
        final int test1;

        //if test1 is still not initialized, uncommenting the next line will result in compile time error
        //int test2 = test1 + 1;

        return 0;
    }
}

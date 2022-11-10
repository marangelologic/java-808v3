package oca.chapter.two.polymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PolyMorphismWithExceptionRules {
    public static void main(String[] args) {
        ParentClass p = new ChildClassExtendsParentClass();
        ChildClassExtendsParentClass c = new ChildClassExtendsParentClass();

        c.someMethodToOverride();
        //if you enable the code below, there will be a compiler error
        //on compile time, the Reference Type is always the one being evaluated not the instance type
        //since the ParentClass is throwing IOException you must also handle the exception if you're calling it
        //this is only applicable for checked exception
        //p.someMethodToOverride();
    }
}

class ParentClass {

    void someMethodToOverride() throws IOException {
    }

    public ParentClass something() throws IOException {
        return null;
    }
}

class ChildClassExtendsParentClass extends ParentClass {


    //for overriding a method, it is okay to not add throws declaration for checked exceptions
    //but make sure the method from the child class does not add a new or broader checked exceptions
    //,but you cannot add a throws Parent of that checked exception
    @Override
    void someMethodToOverride() {
    }

    @Override
    public ParentClass something() throws FileNotFoundException {
        return null;
    }
}

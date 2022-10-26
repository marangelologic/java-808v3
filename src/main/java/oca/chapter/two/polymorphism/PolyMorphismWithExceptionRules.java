package oca.chapter.two.polymorphism;

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
}

class ChildClassExtendsParentClass extends ParentClass{

    @Override
    void someMethodToOverride() {
    }

}


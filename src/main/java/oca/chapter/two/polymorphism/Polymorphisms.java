package oca.chapter.two.polymorphism;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Polymorphisms {
}

class parentPolyMorphism {

    void sampleMethodWithCheckException() throws IOException {}

    //Static methods cannot be overridden
    static void parentStaticMethod() {}

    //final methods cannot be overridden, but can overloaded
    final void finalMethod() {}

    //as seen in this example
    final void finalMethod(String testString) {}

    void sampleCallingSuperMethodFromTheOverridingChild() throws IOException {}
}

class childPloyMorphism extends parentPolyMorphism {

    //In this example we see that it is okay to throw another checked exception on the overridden method
    //if and only if it is fewer/narrower on the Parent overridden method
    //but say for example change IOException to FileNotFound and fileNotFound to IoException
    //there will be a compile-time error
    //but that's only for checked exceptions
    //for runtime exceptions/unchecked, you can throw as many/broader you may like
    //see RuntimeException
    //It is also forbidden to throw a new Checked exception on the overriding method
    @Override
    void sampleMethodWithCheckException() throws FileNotFoundException, RuntimeException {}


    public void sampleCallingSuperMethodFromTheOverridingChild() throws IOException {
        super.sampleCallingSuperMethodFromTheOverridingChild();
    }

}

class AnotherFileException extends FileNotFoundException {

}

interface ParentInterface {
    void sample();
}

class ChildClassThatInheritsFromInterface implements ParentInterface {

    @Override
    public void sample() {

    }
}

package oca.chapter.two.polymorphism;

public class AbstractClass {
}

interface interfaceSample {
    void tryImplementingTHisInsideAnAbstractClass();
}

//you may create a concrete implementation of a method inside an abstract class
//You can even implement a concrete implementation from an abstract class/interface as well
abstract class AbstractSample implements  interfaceSample {

    @Override
    public void tryImplementingTHisInsideAnAbstractClass() {

    }
}

class ChildClassOfAnAbstractClass extends AbstractSample {

}

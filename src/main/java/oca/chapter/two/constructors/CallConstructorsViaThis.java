package oca.chapter.two.constructors;

public class CallConstructorsViaThis {

    public void sample() {
        //yoi cannot call constructors inside a non constructor
        //uncommenting the lines
        //this();
    }


    CallConstructorsViaThis() {

    }

}

class ParentWithoutADefaultCOnstructor {
    ParentWithoutADefaultCOnstructor(int x) {
        System.out.println("ParentWithoutADefaultCOnstructor : " + x);
    }
}

//in the example below, if the parent class created a constructor that have a parameter
// the child is forced to invoked that method on its own constructor
//this will happen all the way to all of the child and grand child classes unless one of them will create a no arg constructor
class ChildWithoutADefaultCOnstructor extends ParentWithoutADefaultCOnstructor {

    ChildWithoutADefaultCOnstructor(int x) {
        super(x);
    }

    ChildWithoutADefaultCOnstructor() {
        super(10);
    }


}

//the class below does not need to create a no args constructor becuase this has been supplied by the JVM,
//since its parent has a no arg constructor
class GrandChildWithoutADefaultCOnstructor extends ChildWithoutADefaultCOnstructor{

}

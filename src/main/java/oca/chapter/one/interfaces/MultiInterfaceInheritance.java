package oca.chapter.one.interfaces;

public class MultiInterfaceInheritance {
}


class firstInterface {
    public void run() {

    }
}

interface secondInterface {
    void run();
}

// in this example, we can have different parent class with the same name as the final implementation
// would still be run method of the child class
class childOfTwoInterfaceWithSameMethodName extends firstInterface implements secondInterface {
    @Override
    public void run() {

    }
}
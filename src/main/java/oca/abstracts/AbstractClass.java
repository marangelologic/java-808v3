package oca.abstracts;

public abstract class AbstractClass {

    abstract void callMe();

    //It is legal to call an abstract method, directly, this will be given an implementation at Runtime;
    public void callCallMeMethod() {
        callMe();
    }
}

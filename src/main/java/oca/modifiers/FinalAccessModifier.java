package oca.modifiers;

public class FinalAccessModifier {

    final void somethingToOverload() {

    }

    //final methods can be overloaded but not overridden
    public void somethingToOverload(String test) {

    }

    public static void main(String[] args) {
        //final classes can be instantiated, abstract classes you cannot.
        FinalClassExample f = new FinalClassExample();
    }
}

final class FinalClassExample {

}


package oca.chapter.two.constructors;

public class OverLoadingConstructors
{
    public static void main(String[] args) {
        ChildOverLoadingConstructor p = new ChildOverLoadingConstructor();
    }
}


class ParentOverLoadingConstructor {

    ParentOverLoadingConstructor(ParentOverLoadingConstructor p) {
        System.out.println("from parent");
    }

    ParentOverLoadingConstructor(ChildOverLoadingConstructor p) {
        System.out.println("from child");
    }

    ParentOverLoadingConstructor() {
        System.out.println("PARENT X");
    }

    @Override
    public String toString() {
        return "PARENT";
    }
}


class ChildOverLoadingConstructor extends ParentOverLoadingConstructor {

    ChildOverLoadingConstructor(ParentOverLoadingConstructor c) {
        super(c);
    }

    ChildOverLoadingConstructor() {
        System.out.println("CHILD X");
    }

    @Override
    public String toString() {
        return "CHILD";
    }
}

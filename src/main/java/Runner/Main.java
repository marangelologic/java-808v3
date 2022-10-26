package Runner;

import oca.chapter.one.inheritance.ChildClass;
import oca.chapter.one.inheritance.ParentClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
        System.out.println("Running.....");
        List<ParentClass> p = new ArrayList<>();
        ParentClass p1 = new ParentClass();
        ChildClass c1 = new ChildClass();
        p.add(p1);
        p.add(c1);

        for(ParentClass px : p) {
            System.out.println(px.getClass());
        }
    }
}



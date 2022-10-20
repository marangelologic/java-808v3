package oca.chapter.one.Enums;

//enums can be public or package defaults if created outside a class
enum INSIDE_OF_A_FILE { TESTA, TESTB, TESTC};

public class Enums {

    //enums inside a class can be private and by default enums are statics
    //each of the enums are almost a static final instance of the enum sampleAsAMember
    //looks like this, "almost", static final SAMPLEASAMEMBER test1 = new SAMPLEASAMEMBER();
    private static enum SAMPLEASAMEMBER { TEST1, TEST2, TEST3};
}

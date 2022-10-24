package oca.chapter.one.Enums;

//enums can be public or package defaults if created outside a class
enum INSIDE_OF_A_FILE { TESTA, TESTB, TESTC};

public class Enums {

    //enums inside a class can be private and by default enums are statics
    //each of the enums are almost a static final instance of the enum sampleAsAMember
    //looks like this, "almost", static final SAMPLEASAMEMBER test1 = new SAMPLEASAMEMBER();
    private static enum SAMPLEASAMEMBER { TEST1, TEST2, TEST3};

}

enum enumTest {

    //in this example, yoi can see that some are integers and some are string arguments;
    MAR(8), ANGELO(0), POGI(34), PALAGI("lagi") {
        //this is a sample of a special method that can be done inside an enum
        //this is what you called, "constant body specific class"
        public int getAge() {
            return 34;
        }
    };
    //SAMPLE("mar"), ANGELO("angelo"), POGI("pogi");

    private int age;
    private String nickName;

    enumTest(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    //you can overload a contructor in an enum.
    //However, you can only assign the value once, you cannot use it again for the same enum value
    enumTest(String nickName) {
        this.nickName = nickName;
    }
}

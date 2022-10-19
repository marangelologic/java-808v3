package oca.imports.statics;


import static java.lang.Integer.MAX_VALUE;

public class TestImportStatic {
    private void testStaticImportsConflict() {
        int x = MAX_VALUE;
        long y = Long.MAX_VALUE;
        // if you remove the Long keyword this will result in compile time error
    }
}

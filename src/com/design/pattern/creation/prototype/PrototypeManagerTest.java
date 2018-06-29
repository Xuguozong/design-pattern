package com.design.pattern.creation.prototype;

import static java.lang.System.out;

public class PrototypeManagerTest {
    public static void main(String[] args){
        PrototypeManager manager = PrototypeManager.getManager();
        OfficeDocument far1 = manager.getOfficeDocument("far");
        far1.display();
        OfficeDocument far2 = manager.getOfficeDocument("far");
        out.println(far1 == far2);

        OfficeDocument srs1 = manager.getOfficeDocument("srs");
        srs1.display();
        OfficeDocument srs2 = manager.getOfficeDocument("srs");
        out.println(srs1 == srs2);
    }
}

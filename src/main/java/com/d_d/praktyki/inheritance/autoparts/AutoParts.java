package com.d_d.praktyki.inheritance.autoparts;

public class AutoParts {
    public static void main(String[] args) {
        ExhaustPart pipe = new ExhaustPart("1010", "rurpol",
                "rura 2000", "2xxx", false);

        Part door = new Part("999", "dorpol",
                "drzwiwaczne drzwi", "sezon 3");

        Tire tire = new Tire("1301541725109571-5172-50712-571", "oponix",
                "opona", "opona", 10.3, 45);

        pipe.showInformation(true);
        door.showInformation(true);
        tire.showInformation(true);
    }
}

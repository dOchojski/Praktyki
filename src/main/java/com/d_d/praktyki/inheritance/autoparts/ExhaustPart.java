package com.d_d.praktyki.inheritance.autoparts;

public class ExhaustPart extends Part {
    private boolean europeanStandard;

    public ExhaustPart(String uid, String manufacturer, String model, String series, boolean europeanStandard) {
        super(uid, manufacturer, model, series);
        this.europeanStandard = europeanStandard;
    }

    @Override
    public void showInformation(boolean newline) {
        super.showInformation(false);
        System.out.printf(", european standard %b", europeanStandard);
        if (newline) System.out.println();
    }

    public boolean isEuropeanStandard() {
        return europeanStandard;
    }

    public void setEuropeanStandard(boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
    }
}

package com.d_d.praktyki.dziedziczenie;

public class ExhaustPart extends Part{

    private boolean emissionStandardCompliant;

    public ExhaustPart(int partNumber, String manufacturer, String model, String series, boolean emissionStandardCompliant) {
        super(partNumber, manufacturer, model, series);
        this.emissionStandardCompliant = emissionStandardCompliant;
    }

    public boolean isEmissionStandardCompliant() {
        return emissionStandardCompliant;
    }

    public void setEmissionStandardCompliant(boolean emissionStandardCompliant) {
        this.emissionStandardCompliant = emissionStandardCompliant;
    }

    @Override
    public String toString() {
        return "Układ wydechowy{" +
                "Europejski standard emisji spalin=" + emissionStandardCompliant +
                "} " + super.toString();
    }
}

package org.cocomo;

public class CostDriver implements InvariantCheck {
    private static final float DRIVER_MIN = 0;
    private static final float DRIVER_MAX = 2;

    private Double value;

    public CostDriver() {}

    public boolean inv() {
        return this.value == null ||  (this.value > DRIVER_MIN && this.value < DRIVER_MAX);
    }

    public void setValue(Double valueIn) throws VDMException {
        this.value = valueIn;
        VDM.invTest(this);
    }

    public Double getValue() {
        return this.value;
    }

}

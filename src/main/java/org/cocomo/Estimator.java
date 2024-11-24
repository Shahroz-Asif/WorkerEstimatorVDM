package org.cocomo;

import java.util.Objects;

public class Estimator implements InvariantCheck {
    private static final float DRIVER_MIN = 0;
    private static final float DRIVER_MAX = 2;
    private static final int DSI_MIN = 0;
    private static final float EAF_MIN = 0;

    private CostDriver CPLX;
    private CostDriver RELY;
    private CostDriver DATA;
    private CostDriver TIME;
    private CostDriver STOR;
    private CostDriver VIRT;
    private CostDriver TURN;
    private CostDriver ACAP;
    private CostDriver AEXP;
    private CostDriver PCAP;
    private CostDriver VEXP;
    private CostDriver LEXP;
    private CostDriver MODP;
    private CostDriver TOOL;
    private CostDriver SCED;
    private Integer DSI;
    private Double previousEAF;
    private Double currentEAF;

    public Estimator() {}

    public static boolean driverInRange(CostDriver val) {
        return val.getValue() > DRIVER_MIN && val.getValue() < DRIVER_MAX;
    }

    public boolean inv() {
        return (
                (this.DSI == null
                        && (this.CPLX == null)
                        && (this.RELY == null)
                        && (this.DATA == null)
                        && (this.TIME == null)
                        && (this.STOR == null)
                        && (this.VIRT == null)
                        && (this.TURN == null)
                        && (this.ACAP == null)
                        && (this.AEXP == null)
                        && (this.PCAP == null)
                        && (this.VEXP == null)
                        && (this.LEXP == null)
                        && (this.MODP == null)
                        && (this.TOOL == null)
                        && (this.SCED == null)
                ) || (
                        (this.DSI != null && this.DSI > DSI_MIN)
                        && (this.previousEAF == null || this.previousEAF >= EAF_MIN)
                        && (this.currentEAF == null || this.currentEAF >= EAF_MIN)
                        && (this.CPLX == null || driverInRange(this.CPLX))
                        && (this.RELY == null || driverInRange(this.RELY))
                        && (this.DATA == null || driverInRange(this.DATA))
                        && (this.TIME == null || driverInRange(this.TIME))
                        && (this.STOR == null || driverInRange(this.STOR))
                        && (this.VIRT == null || driverInRange(this.VIRT))
                        && (this.TURN == null || driverInRange(this.TURN))
                        && (this.ACAP == null || driverInRange(this.ACAP))
                        && (this.AEXP == null || driverInRange(this.AEXP))
                        && (this.PCAP == null || driverInRange(this.PCAP))
                        && (this.VEXP == null || driverInRange(this.VEXP))
                        && (this.LEXP == null || driverInRange(this.LEXP))
                        && (this.MODP == null || driverInRange(this.MODP))
                        && (this.TOOL == null || driverInRange(this.TOOL))
                        && (this.SCED == null || driverInRange(this.SCED))
                )
        );
    }

    Integer getDSI() {
        return this.DSI;
    }

    void setInitialCPLX(double cplxIn) throws VDMException {
        VDM.preTest(this.CPLX == null);
        this.CPLX = new CostDriver();
        try {
            this.CPLX.setValue(cplxIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.CPLX = null;
            throw e;
        }
    }

    void setInitialRELY(double relyIn) throws VDMException {
        VDM.preTest(this.RELY == null);
        this.RELY = new CostDriver();
        try {
            this.RELY.setValue(relyIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.RELY = null;
            throw e;
        }
    }

    void setInitialDATA(double dataIn) throws VDMException {
        VDM.preTest(this.DATA == null);
        this.DATA = new CostDriver();
        try {
            this.DATA.setValue(dataIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.DATA = null;
            throw e;
        }
    }

    void setInitialTIME(double timeIn) throws VDMException {
        VDM.preTest(this.TIME == null);
        this.TIME = new CostDriver();
        try {
            this.TIME.setValue(timeIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.TIME = null;
            throw e;
        }
    }

    void setInitialSTOR(double storIn) throws VDMException {
        VDM.preTest(this.STOR == null);
        this.STOR = new CostDriver();
        try {
            this.STOR.setValue(storIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.STOR = null;
            throw e;
        }
    }

    void setInitialVIRT(double virtIn) throws VDMException {
        VDM.preTest(this.VIRT == null);
        this.VIRT = new CostDriver();
        try {
            this.VIRT.setValue(virtIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.VIRT = null;
            throw e;
        }
    }

    void setInitialTURN(double turnIn) throws VDMException {
        VDM.preTest(this.TURN == null);
        this.TURN = new CostDriver();
        try {
            this.TURN.setValue(turnIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.TURN = null;
            throw e;
        }
    }

    void setInitialACAP(double acapIn) throws VDMException {
        VDM.preTest(this.ACAP == null);
        this.ACAP = new CostDriver();
        try {
            this.ACAP.setValue(acapIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.ACAP = null;
            throw e;
        }
    }

    void setInitialAEXP(double aexpIn) throws VDMException {
        VDM.preTest(this.AEXP == null);
        this.AEXP = new CostDriver();
        try {
            this.AEXP.setValue(aexpIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.AEXP = null;
            throw e;
        }
    }

    void setInitialPCAP(double pcapIn) throws VDMException {
        VDM.preTest(this.PCAP == null);
        this.PCAP = new CostDriver();
        try {
            this.PCAP.setValue(pcapIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.PCAP = null;
            throw e;
        }
    }

    void setInitialVEXP(double vexpIn) throws VDMException {
        VDM.preTest(this.VEXP == null);
        this.VEXP = new CostDriver();
        try {
            this.VEXP.setValue(vexpIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.VEXP = null;
            throw e;
        }
    }

    void setInitialLEXP(double lexpIn) throws VDMException {
        VDM.preTest(this.LEXP == null);
        this.LEXP = new CostDriver();
        try {
            this.LEXP.setValue(lexpIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.LEXP = null;
            throw e;
        }
    }

    void setInitialMODP(double MODPIn) throws VDMException {
        VDM.preTest(this.MODP == null);
        this.MODP = new CostDriver();
        try {
            this.MODP.setValue(MODPIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.MODP = null;
            throw e;
        }
    }

    void setInitialTOOL(double toolIn) throws VDMException {
        VDM.preTest(this.TOOL == null);
        this.TOOL = new CostDriver();
        try {
            this.TOOL.setValue(toolIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.TOOL = null;
            throw e;
        }
    }

    void setInitialSCED(double scedIn) throws VDMException {
        VDM.preTest(this.SCED == null);
        this.SCED = new CostDriver();
        try {
            this.SCED.setValue(scedIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.SCED = null;
            throw e;
        }
    }

    void updateInitialCPLX(double cplxIn) throws VDMException {
        VDM.preTest(this.CPLX != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.CPLX.getValue()) * cplxIn;
        try {
            this.CPLX.setValue(cplxIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.CPLX = null;
            throw e;
        }
    }

    void updateInitialRELY(double relyIn) throws VDMException {
        VDM.preTest(this.RELY != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.RELY.getValue()) * relyIn;
        try {
            this.RELY.setValue(relyIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.RELY = null;
            throw e;
        }
    }

    void updateInitialDATA(double dataIn) throws VDMException {
        VDM.preTest(this.DATA != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.DATA.getValue()) * dataIn;
        try {
            this.DATA.setValue(dataIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.DATA = null;
            throw e;
        }
    }

    void updateInitialTIME(double timeIn) throws VDMException {
        VDM.preTest(this.TIME != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.TIME.getValue()) * timeIn;
        try {
            this.TIME.setValue(timeIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.TIME = null;
            throw e;
        }
    }

    void updateInitialSTOR(double storIn) throws VDMException {
        VDM.preTest(this.STOR != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.STOR.getValue()) * storIn;
        try {
            this.STOR.setValue(storIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.STOR = null;
            throw e;
        }
    }

    void updateInitialVIRT(double virtIn) throws VDMException {
        VDM.preTest(this.VIRT != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.VIRT.getValue()) * virtIn;
        try {
            this.VIRT.setValue(virtIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.VIRT = null;
            throw e;
        }
    }

    void updateInitialTURN(double turnIn) throws VDMException {
        VDM.preTest(this.TURN != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.TURN.getValue()) * turnIn;
        try {
            this.TURN.setValue(turnIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.TURN = null;
            throw e;
        }
    }

    void updateInitialACAP(double acapIn) throws VDMException {
        VDM.preTest(this.ACAP != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.ACAP.getValue()) * acapIn;
        try {
            this.ACAP.setValue(acapIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.ACAP = null;
            throw e;
        }
    }

    void updateInitialAEXP(double aexpIn) throws VDMException {
        VDM.preTest(this.AEXP != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.AEXP.getValue()) * aexpIn;
        try {
            this.AEXP.setValue(aexpIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.AEXP = null;
            throw e;
        }
    }

    void updateInitialPCAP(double pcapIn) throws VDMException {
        VDM.preTest(this.PCAP != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.PCAP.getValue()) * pcapIn;
        try {
            this.PCAP.setValue(pcapIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.PCAP = null;
            throw e;
        }
    }

    void updateInitialVEXP(double vexpIn) throws VDMException {
        VDM.preTest(this.VEXP != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.VEXP.getValue()) * vexpIn;
        try {
            this.VEXP.setValue(vexpIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.VEXP = null;
            throw e;
        }
    }

    void updateInitialLEXP(double lexpIn) throws VDMException {
        VDM.preTest(this.LEXP != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.LEXP.getValue()) * lexpIn;
        try {
            this.LEXP.setValue(lexpIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.LEXP = null;
            throw e;
        }
    }

    void updateInitialMODP(double MODPIn) throws VDMException {
        VDM.preTest(this.MODP != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.MODP.getValue()) * MODPIn;
        try {
            this.MODP.setValue(MODPIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.MODP = null;
            throw e;
        }
    }

    void updateInitialTOOL(double toolIn) throws VDMException {
        VDM.preTest(this.TOOL != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.TOOL.getValue()) * toolIn;
        try {
            this.TOOL.setValue(toolIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.TOOL = null;
            throw e;
        }
    }

    void updateInitialSCED(double scedIn) throws VDMException {
        VDM.preTest(this.SCED != null);
        this.previousEAF = this.currentEAF;
        this.currentEAF = (this.currentEAF / this.SCED.getValue()) * scedIn;
        try {
            this.SCED.setValue(scedIn);
            VDM.invTest(this);
        } catch (VDMException e) {
            this.SCED = null;
            throw e;
        }
    }

    void setDSI(int dsiIn) throws VDMException {
        VDM.preTest(this.DSI == null);
        this.DSI = dsiIn;
        this.currentEAF = 1.0;
        this.previousEAF = 0.0;
        VDM.invTest(this);
    }

    HiringSignal calculateStaffingChange() throws VDMException {
        VDM.preTest(
                this.DSI != null && this.DSI > DSI_MIN
                        && this.CPLX != null && this.RELY != null && this.DATA != null && this.TIME != null
                        && this.STOR != null && this.VIRT != null && this.TURN != null && this.ACAP != null
                        && this.AEXP != null && this.PCAP != null && this.VEXP != null && this.LEXP != null
                        && this.MODP != null && this.TOOL != null && this.SCED != null
        );

        double curr = this.currentEAF;
        if (!Objects.equals(curr, this.previousEAF)) {

            HiringSignal change = (curr - this.previousEAF) > 0 ? HiringSignal.UNDERSTAFFED : HiringSignal.OVERSTAFFED;
            this.previousEAF = this.currentEAF;

            return change;
        }

        return HiringSignal.NO_CHANGE;
    }
}
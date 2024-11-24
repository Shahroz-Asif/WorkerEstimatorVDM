package org.cocomo;

import org.junit.Test;

public class EstimatorTest {
    
    private static int INBOUND_DSI = 25000;
    private static int OUT_OF_BOUND_DSI = -1;
    private static double INBOUND_INITIAL_COST_DRIVER = 1.0;
    private static double OUT_OF_BOUND_INITIAL_COST_DRIVER = -1.0;
    private static double INBOUND_UPDATED_COST_DRIVER = 0.5;
    private static double OUT_OF_BOUND_UPDATED_COST_DRIVER = -0.5;
    private static double INBOUND_LOWER_COST_DRIVER = 0.75;
    private static double INBOUND_HIGHER_COST_DRIVER = 1.25;

    public Estimator createInitialEstimator() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialCPLX(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialRELY(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialDATA(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialTIME(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialSTOR(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialVIRT(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialTURN(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialACAP(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialAEXP(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialPCAP(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialVEXP(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialLEXP(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialMODP(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialTOOL(INBOUND_INITIAL_COST_DRIVER);
        estimator.setInitialSCED(INBOUND_INITIAL_COST_DRIVER);

        return estimator;
    }

    @Test(expected =  VDMException.class)
    public void setOutOfBoundsDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(OUT_OF_BOUND_DSI);
    }

    @Test
    public void setInBoundsDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
    }

    @Test(expected =  VDMException.class)
    public void setInitialCPLXBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialCPLX(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialRELYBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialRELY(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialDATABeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialDATA(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialTIMEBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialTIME(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialSTORBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialSTOR(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialVIRTBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialVIRT(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialTURNBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialTURN(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialACAPBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialACAP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialAEXPBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialAEXP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialPCAPBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialPCAP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialVEXPBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialVEXP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialLEXPBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialLEXP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialMODPBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialMODP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialTOOLBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialTOOL(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void setInitialSCEDBeforeDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setInitialSCED(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundCPLXAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialCPLX(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundRELYAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialRELY(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundDATAAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialDATA(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundTIMEAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTIME(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundSTORAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialSTOR(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundVIRTAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialVIRT(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundTURNAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTURN(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundACAPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialACAP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundAEXPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialAEXP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundPCAPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialPCAP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundVEXPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialVEXP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundLEXPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialLEXP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundMODPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialMODP(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundTOOLAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTOOL(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test
    public void setInitialInboundSCEDAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialSCED(INBOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundCPLXAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialCPLX(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundRELYAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialRELY(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundDATAAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialDATA(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundTIMEAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTIME(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundSTORAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialSTOR(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundVIRTAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialVIRT(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundTURNAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTURN(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundACAPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialACAP(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundAEXPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialAEXP(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundPCAPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialPCAP(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundVEXPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialVEXP(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundLEXPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialLEXP(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundMODPAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialMODP(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundTOOLAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTOOL(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void setInitialOutOfBoundSCEDAfterDSI() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialSCED(OUT_OF_BOUND_INITIAL_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialCPLXBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialCPLX(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialRELYBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialRELY(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialDATABeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialDATA(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialTIMEBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialTIME(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialSTORBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialSTOR(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialVIRTBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialVIRT(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialTURNBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialTURN(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialACAPBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialACAP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialAEXPBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialAEXP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialPCAPBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialPCAP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialVEXPBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialVEXP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialLEXPBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialLEXP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialMODPBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialMODP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialTOOLBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialTOOL(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected =  VDMException.class)
    public void updateInitialSCEDBeforeSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.updateInitialSCED(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundCPLXAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialCPLX(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialCPLX(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundRELYAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialRELY(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialRELY(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundDATAAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialDATA(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialDATA(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundTIMEAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTIME(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialTIME(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundSTORAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialSTOR(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialSTOR(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundVIRTAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialVIRT(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialVIRT(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundTURNAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTURN(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialTURN(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundACAPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialACAP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialACAP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundAEXPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialAEXP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialAEXP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundPCAPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialPCAP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialPCAP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundVEXPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialVEXP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialVEXP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundLEXPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialLEXP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialLEXP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundMODPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialMODP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialMODP(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundTOOLAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTOOL(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialTOOL(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void updateInitialInboundSCEDAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialSCED(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialSCED(INBOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundCPLXAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialCPLX(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialCPLX(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundRELYAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialRELY(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialRELY(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundDATAAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialDATA(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialDATA(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundTIMEAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTIME(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialTIME(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundSTORAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialSTOR(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialSTOR(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundVIRTAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialVIRT(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialVIRT(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundTURNAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTURN(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialTURN(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundACAPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialACAP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialACAP(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundAEXPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialAEXP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialAEXP(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundPCAPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialPCAP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialPCAP(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundVEXPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialVEXP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialVEXP(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundLEXPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialLEXP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialLEXP(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundMODPAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialMODP(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialMODP(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundTOOLAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialTOOL(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialTOOL(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test(expected = VDMException.class)
    public void updateInitialOutOfBoundSCEDAfterSettingInitial() throws VDMException {
        Estimator estimator = new Estimator();
        estimator.setDSI(INBOUND_DSI);
        estimator.setInitialSCED(INBOUND_INITIAL_COST_DRIVER);
        estimator.updateInitialSCED(OUT_OF_BOUND_UPDATED_COST_DRIVER);
    }

    @Test
    public void calculateInitialStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateLowerCPLXUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialCPLX(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerRELYUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialRELY(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerDATAUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialDATA(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerTIMEUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialTIME(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerSTORUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialSTOR(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerVIRTUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialVIRT(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerTURNUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialTURN(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerAEXPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialAEXP(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerACAPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialACAP(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerPCAPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialPCAP(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerVEXPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialVEXP(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerLEXPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialLEXP(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerMODPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialMODP(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerTOOLUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialTOOL(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateLowerSCEDUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialSCED(INBOUND_LOWER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.OVERSTAFFED;
    }

    @Test
    public void calculateHigherCPLXUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialCPLX(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherRELYUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialRELY(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherDATAUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialDATA(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherTIMEUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialTIME(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherSTORUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialSTOR(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherVIRTUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialVIRT(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherTURNUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialTURN(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherAEXPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialAEXP(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherACAPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialACAP(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherPCAPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialPCAP(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherVEXPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialVEXP(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherLEXPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialLEXP(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherMODPUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialMODP(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherTOOLUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialTOOL(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }

    @Test
    public void calculateHigherSCEDUpdatedStaffingChange() throws VDMException {
        Estimator estimator = createInitialEstimator();
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;

        estimator.updateInitialSCED(INBOUND_HIGHER_COST_DRIVER);
        assert estimator.calculateStaffingChange() == HiringSignal.UNDERSTAFFED;
    }
}
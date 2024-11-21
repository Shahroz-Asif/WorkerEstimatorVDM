package org.cocomo;

public class VDM {
    public static void preTest(boolean condition) throws VDMException {
        if (!condition) {
            throw new VDMException("PRECONDITION FAILED!");
        }
    }

    public static void invTest(InvariantCheck invariantInstance) throws VDMException {
        if (!invariantInstance.inv()) {
            throw new VDMException("INVARIANT FAILED!");
        }
    }
}
2
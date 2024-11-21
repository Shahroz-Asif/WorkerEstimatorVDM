package org.cocomo;

import java.io.IOException;
import java.util.Scanner;

public class EstimatorTester {
    public static void main(String[] args) throws IOException, VDMException {
        Scanner scanner = new Scanner(System.in);
        Estimator estimator = new Estimator();

        int choice;
        do {
            System.out.print("""
                    COCOMO Worker Estimator 2.0 (Intermediate)

                    Please select one of the following options:
                    1) View DSI
                    2) Set DSI
                    3) Set Initial Attribute
                    4) Update Initial Attribute
                    5) Calculate Staffing Change
                    6) Exit

                    ❯\s"""
            );

            choice = scanner.nextInt();

            System.out.println();

            try {
                switch (choice) {
                    case 1: {
                        EstimatorTester.optionA(estimator);
                        break;
                    }

                    case 2: {
                        System.out.print("Enter DSI: ");
                        int dsi = scanner.nextInt();
                        EstimatorTester.optionB(estimator, dsi);
                        break;
                    }

                    case 3: {
                        System.out.print("""
                                Select Initial Attribute:
                                1) CPLX
                                2) RELY
                                3) DATA
                                4) TIME
                                5) STOR
                                6) VIRT
                                7) TURN
                                8) ACAP
                                9) AEXP
                                10) PCAP
                                11) VEXP
                                12) LEXP
                                13) MODP
                                14) TOOL
                                15) SCED

                                ❯\s""");

                        int attribute = scanner.nextInt();
                        if (attribute < 1 || attribute > 15) {
                            System.out.println("Invalid Attribute!");
                            break;
                        }

                        System.out.print("Enter value: ");
                        double value = scanner.nextDouble();

                        EstimatorTester.optionC(estimator, attribute, value);
                        break;
                    }

                    case 4: {
                        System.out.print("""
                                Select Initial Attribute:
                                1) CPLX
                                2) RELY
                                3) DATA
                                4) TIME
                                5) STOR
                                6) VIRT
                                7) TURN
                                8) ACAP
                                9) AEXP
                                10) PCAP
                                11) VEXP
                                12) LEXP
                                13) MODP
                                14) TOOL
                                15) SCED

                                ❯\s""");

                        int attribute = scanner.nextInt();
                        if (attribute < 1 || attribute > 15) {
                            System.out.println("Invalid Attribute!");
                            break;
                        }

                        System.out.print("Enter value: ");
                        double value = scanner.nextDouble();

                        EstimatorTester.optionD(estimator, attribute, value);
                        break;
                    }

                    case 5: {
                        EstimatorTester.optionE(estimator);
                        break;
                    }
                }

                System.out.println();
            } catch (VDMException e) {
                e.printStackTrace();
            }
        } while (choice != 6);

    }

    private static void optionA(Estimator estimator) {
        System.out.println("DSI: " + estimator.getDSI());
    }

    private static void optionB(Estimator estimator, int dsi) throws VDMException {
        estimator.setDSI(dsi);
    }

    private static void optionC(Estimator estimator, int attribute, double value) throws VDMException {
        switch (attribute) {
            case 1: {
                estimator.setInitialCPLX(value);
                break;
            }

            case 2: {
                estimator.setInitialRELY(value);
                break;
            }

            case 3: {
                estimator.setInitialDATA(value);
                break;
            }

            case 4: {
                estimator.setInitialTIME(value);
                break;
            }

            case 5: {
                estimator.setInitialSTOR(value);
                break;
            }

            case 6: {
                estimator.setInitialVIRT(value);
                break;
            }

            case 7: {
                estimator.setInitialTURN(value);
                break;
            }

            case 8: {
                estimator.setInitialACAP(value);
                break;
            }

            case 9: {
                estimator.setInitialAEXP(value);
                break;
            }

            case 10: {
                estimator.setInitialPCAP(value);
                break;
            }

            case 11: {
                estimator.setInitialVEXP(value);
                break;
            }

            case 12: {
                estimator.setInitialLEXP(value);
                break;
            }

            case 13: {
                estimator.setInitialMODP(value);
                break;
            }

            case 14: {
                estimator.setInitialTOOL(value);
                break;
            }

            case 15: {
                estimator.setInitialSCED(value);
                break;
            }
        }
    }

    private static void optionD(Estimator estimator, int attribute, double value) throws VDMException {
        switch (attribute) {
            case 1: {
                estimator.updateInitialCPLX(value);
                break;
            }

            case 2: {
                estimator.updateInitialRELY(value);
                break;
            }

            case 3: {
                estimator.updateInitialDATA(value);
                break;
            }

            case 4: {
                estimator.updateInitialTIME(value);
                break;
            }

            case 5: {
                estimator.updateInitialSTOR(value);
                break;
            }

            case 6: {
                estimator.updateInitialVIRT(value);
                break;
            }

            case 7: {
                estimator.updateInitialTURN(value);
                break;
            }

            case 8: {
                estimator.updateInitialACAP(value);
                break;
            }

            case 9: {
                estimator.updateInitialAEXP(value);
                break;
            }

            case 10: {
                estimator.updateInitialPCAP(value);
                break;
            }

            case 11: {
                estimator.updateInitialVEXP(value);
                break;
            }

            case 12: {
                estimator.updateInitialLEXP(value);
                break;
            }

            case 13: {
                estimator.updateInitialMODP(value);
                break;
            }

            case 14: {
                estimator.updateInitialTOOL(value);
                break;
            }

            case 15: {
                estimator.updateInitialSCED(value);
                break;
            }
        }
    }

    private static void optionE(Estimator estimator) throws VDMException {
        HiringSignal signal = estimator.calculateStaffingChange();

        System.out.println(signal);

        switch (signal) {
            case HiringSignal.NO_CHANGE: {
                System.out.println("No Staffing change needed!");
                break;
            }

            case HiringSignal.OVERSTAFFED: {
                System.out.println("Staffing is overstaffed! You need to reduce the number of hires!");
                break;
            }

            case HiringSignal.UNDERSTAFFED: {
                System.out.println("Staffing is understaffed! You need to increase the number of hires!");
                break;
            }
        }
    }

}
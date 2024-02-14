package com.tencent.soter.core.model;

public class SoterExParameters {
    private static final String SOTEREX_PROVIDER_CLASS_NAME = "com.tencent.soter.core.model.SoterExParameterProvider";
    private static final String TAG = "SoterExParameters";
    private static SoterExParameters instance;
    private ISoterExParameters impl = null;

    private SoterExParameters() {
        try {
            this.impl = (ISoterExParameters) Class.forName(SOTEREX_PROVIDER_CLASS_NAME).getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            SLogger.printErrStackTrace(TAG, e, "soter: init ext param failed.");
        }
    }

    public static SoterExParameters getInstance() {
        SoterExParameters soterExParameters;
        SoterExParameters soterExParameters2 = instance;
        if (soterExParameters2 != null) {
            return soterExParameters2;
        }
        synchronized (SoterExParameters.class) {
            if (instance == null) {
                instance = new SoterExParameters();
            }
            soterExParameters = instance;
        }
        return soterExParameters;
    }

    public int[] getFingerprintHardwarePosition() {
        Object param = getParam(ISoterExParameters.FINGERPRINT_HARDWARE_POSITION, (Object) null);
        if (param instanceof int[]) {
            return (int[]) param;
        }
        return null;
    }

    public int getFingerprintType() {
        Object param = getParam(ISoterExParameters.FINGERPRINT_TYPE, 0);
        if (param instanceof Integer) {
            return ((Integer) param).intValue();
        }
        return 0;
    }

    public Object getParam(String str, Object obj) {
        ISoterExParameters iSoterExParameters = this.impl;
        if (iSoterExParameters != null) {
            return iSoterExParameters.getParam(str, obj);
        }
        return null;
    }
}

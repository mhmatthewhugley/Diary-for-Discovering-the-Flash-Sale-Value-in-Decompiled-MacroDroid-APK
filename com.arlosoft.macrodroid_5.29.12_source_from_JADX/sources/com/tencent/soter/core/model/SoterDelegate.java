package com.tencent.soter.core.model;

import androidx.annotation.NonNull;

public class SoterDelegate {
    private static final String TAG = "Soter.SoterDelegate";
    @NonNull
    private static volatile ISoterDelegate sSoterDelegateImp = new ISoterDelegate() {
        private boolean isTriggeredOOM = false;

        public boolean isTriggeredOOM() {
            return this.isTriggeredOOM;
        }

        public void onTriggeredOOM() {
            SLogger.m81940e(SoterDelegate.TAG, "soter: triggered OOM. using default imp, just record the flag", new Object[0]);
            this.isTriggeredOOM = true;
        }

        public void reset() {
            this.isTriggeredOOM = false;
        }
    };

    public interface ISoterDelegate {
        boolean isTriggeredOOM();

        void onTriggeredOOM();

        void reset();
    }

    public static boolean isTriggeredOOM() {
        return sSoterDelegateImp.isTriggeredOOM();
    }

    public static void onTriggerOOM() {
        sSoterDelegateImp.onTriggeredOOM();
    }

    public static void reset() {
        sSoterDelegateImp.reset();
    }

    public static void setImplement(@NonNull ISoterDelegate iSoterDelegate) {
        sSoterDelegateImp = iSoterDelegate;
    }
}

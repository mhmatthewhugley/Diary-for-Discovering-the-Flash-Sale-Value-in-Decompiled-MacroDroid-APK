package com.twofortyfouram.locale.sdk.host.model;

import androidx.annotation.NonNull;
import p276h8.C12406a;

public enum PluginErrorExecute implements IPluginError {
    CONDITION_RESULT_CODE_BAD("Plug-in conditions must return one of the result codes RESULT_SATISFIED, RESULT_UNSATISFIED, or RESULT_UNKNOWN", true);
    
    @NonNull
    private final String mDeveloperExplanation;
    private final boolean mIsFatal;

    private PluginErrorExecute(@NonNull String str, boolean z) {
        C12406a.m83260d(str, "developerExplanation");
        this.mDeveloperExplanation = str;
        this.mIsFatal = z;
    }

    @NonNull
    public String getDeveloperExplanation() {
        return this.mDeveloperExplanation;
    }

    public boolean isFatal() {
        return this.mIsFatal;
    }
}

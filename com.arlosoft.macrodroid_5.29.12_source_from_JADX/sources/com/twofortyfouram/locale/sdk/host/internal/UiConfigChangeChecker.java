package com.twofortyfouram.locale.sdk.host.internal;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import p276h8.C12406a;

public final class UiConfigChangeChecker {
    @NonNull
    private final Configuration mLastConfiguration = new Configuration();
    private int mLastDensity = 0;

    @CheckResult
    public boolean checkNewConfig(@NonNull Resources resources) {
        C12406a.m83260d(resources, "res");
        int updateFrom = this.mLastConfiguration.updateFrom(resources.getConfiguration());
        boolean z = this.mLastDensity != resources.getDisplayMetrics().densityDpi;
        this.mLastDensity = resources.getDisplayMetrics().densityDpi;
        if (z || (updateFrom & 772) != 0) {
            return true;
        }
        return false;
    }
}

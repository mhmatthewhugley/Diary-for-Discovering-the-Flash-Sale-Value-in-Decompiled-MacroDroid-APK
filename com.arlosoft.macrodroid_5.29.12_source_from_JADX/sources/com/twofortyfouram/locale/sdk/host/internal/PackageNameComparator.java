package com.twofortyfouram.locale.sdk.host.internal;

import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Comparator;

final class PackageNameComparator implements Comparator<ResolveInfo>, Serializable {
    private static final long serialVersionUID = -5145288289897584068L;

    PackageNameComparator() {
    }

    public int compare(@NonNull ResolveInfo resolveInfo, @NonNull ResolveInfo resolveInfo2) {
        return resolveInfo.activityInfo.packageName.compareToIgnoreCase(resolveInfo2.activityInfo.packageName);
    }
}

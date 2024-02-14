package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzw extends AppUpdateOptions {

    /* renamed from: a */
    private final int f51167a;

    /* renamed from: b */
    private final boolean f51168b;

    /* synthetic */ zzw(int i, boolean z, zzv zzv) {
        this.f51167a = i;
        this.f51168b = z;
    }

    /* renamed from: a */
    public final boolean mo59543a() {
        return this.f51168b;
    }

    @AppUpdateType
    /* renamed from: b */
    public final int mo59544b() {
        return this.f51167a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppUpdateOptions) {
            AppUpdateOptions appUpdateOptions = (AppUpdateOptions) obj;
            return this.f51167a == appUpdateOptions.mo59544b() && this.f51168b == appUpdateOptions.mo59543a();
        }
    }

    public final int hashCode() {
        return ((this.f51167a ^ 1000003) * 1000003) ^ (true != this.f51168b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f51167a;
        boolean z = this.f51168b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

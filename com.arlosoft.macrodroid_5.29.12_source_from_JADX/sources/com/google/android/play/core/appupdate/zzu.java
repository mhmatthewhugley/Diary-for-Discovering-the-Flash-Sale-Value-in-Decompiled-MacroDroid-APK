package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AppUpdateOptions;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzu extends AppUpdateOptions.Builder {

    /* renamed from: a */
    private int f51164a;

    /* renamed from: b */
    private boolean f51165b;

    /* renamed from: c */
    private byte f51166c;

    zzu() {
    }

    /* renamed from: a */
    public final AppUpdateOptions mo59545a() {
        if (this.f51166c == 3) {
            return new zzw(this.f51164a, this.f51165b, (zzv) null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f51166c & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.f51166c & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final AppUpdateOptions.Builder mo59546b(boolean z) {
        this.f51165b = z;
        this.f51166c = (byte) (this.f51166c | 2);
        return this;
    }

    /* renamed from: c */
    public final AppUpdateOptions.Builder mo59561c(int i) {
        this.f51164a = i;
        this.f51166c = (byte) (this.f51166c | 1);
        return this;
    }
}

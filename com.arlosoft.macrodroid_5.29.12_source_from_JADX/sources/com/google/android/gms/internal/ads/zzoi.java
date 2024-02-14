package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzoi {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zznd f38037a = zznd.f37939c;

    /* renamed from: b */
    final zzoh f38038b = zzoh.f38036a;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public zzok f38039c;

    /* renamed from: b */
    public final zzoi mo47964b(zznd zznd) {
        this.f38037a = zznd;
        return this;
    }

    /* renamed from: c */
    public final zzoi mo47965c(zzng[] zzngArr) {
        this.f38039c = new zzok(zzngArr);
        return this;
    }

    /* renamed from: d */
    public final zzou mo47966d() {
        if (this.f38039c == null) {
            this.f38039c = new zzok(new zzng[0]);
        }
        return new zzou(this, (zzot) null);
    }
}

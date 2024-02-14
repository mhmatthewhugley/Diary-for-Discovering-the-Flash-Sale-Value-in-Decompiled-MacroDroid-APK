package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.play:core@@1.10.3 */
abstract class zzet {
    zzet() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo59678a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract long mo59679b();

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public abstract String mo59680c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo59681d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract boolean mo59682e();

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: f */
    public abstract byte[] mo59684f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo59773g() {
        if (mo59680c() == null) {
            return false;
        }
        return mo59680c().endsWith("/");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo59774h() {
        return mo59678a() == 0;
    }
}

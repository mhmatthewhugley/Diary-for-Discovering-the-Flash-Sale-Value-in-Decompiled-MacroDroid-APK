package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzy {

    /* renamed from: a */
    private final SparseBooleanArray f38950a = new SparseBooleanArray();

    /* renamed from: b */
    private boolean f38951b;

    /* renamed from: a */
    public final zzy mo48419a(int i) {
        zzdd.m47212f(!this.f38951b);
        this.f38950a.append(i, true);
        return this;
    }

    /* renamed from: b */
    public final zzaa mo48420b() {
        zzdd.m47212f(!this.f38951b);
        this.f38951b = true;
        return new zzaa(this.f38950a, (zzz) null);
    }
}

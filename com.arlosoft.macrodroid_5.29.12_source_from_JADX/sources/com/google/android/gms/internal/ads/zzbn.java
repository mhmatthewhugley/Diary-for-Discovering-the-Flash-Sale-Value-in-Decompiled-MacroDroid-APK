package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzbn {

    /* renamed from: a */
    public final Object f27569a;

    /* renamed from: b */
    public final int f27570b;

    /* renamed from: c */
    public final int f27571c;

    /* renamed from: d */
    public final long f27572d;

    /* renamed from: e */
    public final int f27573e;

    protected zzbn(zzbn zzbn) {
        this.f27569a = zzbn.f27569a;
        this.f27570b = zzbn.f27570b;
        this.f27571c = zzbn.f27571c;
        this.f27572d = zzbn.f27572d;
        this.f27573e = zzbn.f27573e;
    }

    public zzbn(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private zzbn(Object obj, int i, int i2, long j, int i3) {
        this.f27569a = obj;
        this.f27570b = i;
        this.f27571c = i2;
        this.f27572d = j;
        this.f27573e = i3;
    }

    /* renamed from: a */
    public final zzbn mo42816a(Object obj) {
        if (this.f27569a.equals(obj)) {
            return this;
        }
        return new zzbn(obj, this.f27570b, this.f27571c, this.f27572d, this.f27573e);
    }

    /* renamed from: b */
    public final boolean mo42817b() {
        return this.f27570b != -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbn)) {
            return false;
        }
        zzbn zzbn = (zzbn) obj;
        return this.f27569a.equals(zzbn.f27569a) && this.f27570b == zzbn.f27570b && this.f27571c == zzbn.f27571c && this.f27572d == zzbn.f27572d && this.f27573e == zzbn.f27573e;
    }

    public final int hashCode() {
        return ((((((((this.f27569a.hashCode() + 527) * 31) + this.f27570b) * 31) + this.f27571c) * 31) + ((int) this.f27572d)) * 31) + this.f27573e;
    }

    public zzbn(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzbn(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}

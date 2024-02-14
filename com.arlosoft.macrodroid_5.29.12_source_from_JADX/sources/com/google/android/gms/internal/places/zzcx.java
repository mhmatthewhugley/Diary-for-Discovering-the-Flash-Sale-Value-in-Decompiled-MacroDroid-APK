package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;

final class zzcx implements zzci {

    /* renamed from: a */
    private final zzck f45351a;

    /* renamed from: b */
    private final String f45352b;

    /* renamed from: c */
    private final Object[] f45353c;

    /* renamed from: d */
    private final int f45354d;

    zzcx(zzck zzck, String str, Object[] objArr) {
        this.f45351a = zzck;
        this.f45352b = str;
        this.f45353c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f45354d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f45354d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo53530a() {
        return (this.f45354d & 2) == 2;
    }

    /* renamed from: b */
    public final zzck mo53531b() {
        return this.f45351a;
    }

    /* renamed from: c */
    public final int mo53532c() {
        return (this.f45354d & 1) == 1 ? zzbc.zze.f45270i : zzbc.zze.f45271j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo53549d() {
        return this.f45352b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Object[] mo53550e() {
        return this.f45353c;
    }
}

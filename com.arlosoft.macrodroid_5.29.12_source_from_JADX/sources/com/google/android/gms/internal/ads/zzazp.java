package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzazp {

    /* renamed from: a */
    private final zzazj[] f26358a = new zzazj[1];

    /* renamed from: b */
    private int f26359b;

    /* renamed from: c */
    private int f26360c;

    /* renamed from: d */
    private int f26361d = 0;

    /* renamed from: e */
    private zzazj[] f26362e = new zzazj[100];

    public zzazp(boolean z, int i) {
    }

    /* renamed from: a */
    public final synchronized int mo42287a() {
        return this.f26360c * 65536;
    }

    /* renamed from: b */
    public final synchronized zzazj mo42288b() {
        zzazj zzazj;
        this.f26360c++;
        int i = this.f26361d;
        if (i > 0) {
            zzazj[] zzazjArr = this.f26362e;
            int i2 = i - 1;
            this.f26361d = i2;
            zzazj = zzazjArr[i2];
            zzazjArr[i2] = null;
        } else {
            zzazj = new zzazj(new byte[65536], 0);
        }
        return zzazj;
    }

    /* renamed from: c */
    public final synchronized void mo42289c(zzazj zzazj) {
        zzazj[] zzazjArr = this.f26358a;
        zzazjArr[0] = zzazj;
        mo42290d(zzazjArr);
    }

    /* renamed from: d */
    public final synchronized void mo42290d(zzazj[] zzazjArr) {
        int i = this.f26361d;
        int i2 = i + r1;
        zzazj[] zzazjArr2 = this.f26362e;
        int length = zzazjArr2.length;
        if (i2 >= length) {
            this.f26362e = (zzazj[]) Arrays.copyOf(zzazjArr2, Math.max(length + length, i2));
        }
        for (zzazj zzazj : zzazjArr) {
            byte[] bArr = zzazj.f26349a;
            zzazj[] zzazjArr3 = this.f26362e;
            int i3 = this.f26361d;
            this.f26361d = i3 + 1;
            zzazjArr3[i3] = zzazj;
        }
        this.f26360c -= zzazjArr.length;
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void mo42291e() {
        mo42292f(0);
    }

    /* renamed from: f */
    public final synchronized void mo42292f(int i) {
        int i2 = this.f26359b;
        this.f26359b = i;
        if (i < i2) {
            mo42293g();
        }
    }

    /* renamed from: g */
    public final synchronized void mo42293g() {
        int max = Math.max(0, zzbar.m42988d(this.f26359b, 65536) - this.f26360c);
        int i = this.f26361d;
        if (max < i) {
            Arrays.fill(this.f26362e, max, i, (Object) null);
            this.f26361d = max;
        }
    }
}

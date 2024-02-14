package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzur implements zzvm {

    /* renamed from: a */
    public final /* synthetic */ zzvr f38640a;

    /* renamed from: b */
    public final /* synthetic */ zzvf f38641b;

    /* renamed from: c */
    public final /* synthetic */ boolean f38642c;

    public /* synthetic */ zzur(zzvr zzvr, zzvf zzvf, boolean z) {
        this.f38640a = zzvr;
        this.f38641b = zzvf;
        this.f38642c = z;
    }

    /* renamed from: a */
    public final List mo48275a(int i, zzcp zzcp, int[] iArr) {
        zzvr zzvr = this.f38640a;
        zzvf zzvf = this.f38641b;
        boolean z = this.f38642c;
        zzuq zzuq = new zzuq(zzvr);
        zzfvk m = zzfvn.m51129m();
        zzcp zzcp2 = zzcp;
        int i2 = 0;
        while (true) {
            int i3 = zzcp2.f29179a;
            if (i2 > 0) {
                return m.mo46430h();
            }
            m.mo46428f(new zzuz(i, zzcp, i2, zzvf, iArr[i2], z, zzuq));
            i2++;
        }
    }
}

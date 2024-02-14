package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzuv implements zzvm {

    /* renamed from: a */
    public final /* synthetic */ zzvf f38647a;

    /* renamed from: b */
    public final /* synthetic */ String f38648b;

    public /* synthetic */ zzuv(zzvf zzvf, String str) {
        this.f38647a = zzvf;
        this.f38648b = str;
    }

    /* renamed from: a */
    public final List mo48275a(int i, zzcp zzcp, int[] iArr) {
        zzvf zzvf = this.f38647a;
        String str = this.f38648b;
        int i2 = zzvr.f38737m;
        zzfvk m = zzfvn.m51129m();
        int i3 = 0;
        while (true) {
            int i4 = zzcp.f29179a;
            if (i3 > 0) {
                return m.mo46430h();
            }
            m.mo46428f(new zzvl(i, zzcp, i3, zzvf, iArr[i3], str));
            i3++;
        }
    }
}

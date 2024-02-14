package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzr;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class zzfg implements zzr {

    /* renamed from: a */
    final /* synthetic */ zzfi f46774a;

    zzfg(zzfi zzfi) {
        this.f46774a = zzfi;
    }

    /* renamed from: a */
    public final void mo51715a(int i, String str, List list, boolean z, boolean z2) {
        zzef zzef;
        int i2 = i - 1;
        if (i2 == 0) {
            zzef = this.f46774a.f46899a.mo55221z().mo55097o();
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzef = this.f46774a.f46899a.mo55221z().mo55102t();
            } else if (i2 != 4) {
                zzef = this.f46774a.f46899a.mo55221z().mo55101s();
            } else if (z) {
                zzef = this.f46774a.f46899a.mo55221z().mo55105w();
            } else if (!z2) {
                zzef = this.f46774a.f46899a.mo55221z().mo55104v();
            } else {
                zzef = this.f46774a.f46899a.mo55221z().mo55103u();
            }
        } else if (z) {
            zzef = this.f46774a.f46899a.mo55221z().mo55100r();
        } else if (!z2) {
            zzef = this.f46774a.f46899a.mo55221z().mo55099q();
        } else {
            zzef = this.f46774a.f46899a.mo55221z().mo55098p();
        }
        int size = list.size();
        if (size == 1) {
            zzef.mo55092b(str, list.get(0));
        } else if (size == 2) {
            zzef.mo55093c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzef.mo55091a(str);
        } else {
            zzef.mo55094d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}

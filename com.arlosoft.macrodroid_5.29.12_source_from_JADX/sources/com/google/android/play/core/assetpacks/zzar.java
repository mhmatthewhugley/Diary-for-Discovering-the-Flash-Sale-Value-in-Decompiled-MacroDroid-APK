package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.zzi;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzar extends zzal {

    /* renamed from: d */
    final int f51221d;

    /* renamed from: f */
    final String f51222f;

    /* renamed from: g */
    final int f51223g;

    /* renamed from: o */
    final /* synthetic */ zzaw f51224o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzar(zzaw zzaw, zzi zzi, int i, String str, int i2) {
        super(zzaw, zzi);
        this.f51224o = zzaw;
        this.f51221d = i;
        this.f51222f = str;
        this.f51223g = i2;
    }

    /* renamed from: g0 */
    public final void mo59600g0(Bundle bundle) {
        this.f51224o.f51236d.mo59822s(this.f51217a);
        int i = bundle.getInt("error_code");
        zzaw.f51231g.mo59806b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f51223g;
        if (i2 > 0) {
            this.f51224o.m70514j(this.f51221d, this.f51222f, i2 - 1);
        }
    }
}

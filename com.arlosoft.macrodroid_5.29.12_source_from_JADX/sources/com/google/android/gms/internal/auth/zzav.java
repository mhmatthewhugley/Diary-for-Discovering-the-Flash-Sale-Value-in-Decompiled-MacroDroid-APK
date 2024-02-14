package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

final class zzav extends zzaj {

    /* renamed from: a */
    private final /* synthetic */ zzau f39175a;

    zzav(zzau zzau) {
        this.f39175a = zzau;
    }

    /* renamed from: t */
    public final void mo48555t(String str) {
        if (str != null) {
            this.f39175a.mo21329l(new zzax(str));
        } else {
            this.f39175a.mo21329l(zzaq.m55780A(new Status(3006)));
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zan extends zabw {

    /* renamed from: a */
    final /* synthetic */ Dialog f3472a;

    /* renamed from: b */
    final /* synthetic */ zao f3473b;

    zan(zao zao, Dialog dialog) {
        this.f3473b = zao;
        this.f3472a = dialog;
    }

    /* renamed from: a */
    public final void mo21450a() {
        this.f3473b.f3475c.m4247o();
        if (this.f3472a.isShowing()) {
            this.f3472a.dismiss();
        }
    }
}

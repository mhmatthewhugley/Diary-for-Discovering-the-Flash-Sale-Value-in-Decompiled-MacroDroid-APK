package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzud */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzud implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzyg f40475a;

    /* renamed from: b */
    final /* synthetic */ zzue f40476b;

    zzud(zzue zzue, zzyg zzyg) {
        this.f40476b = zzue;
        this.f40475a = zzyg;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzabh zzabh = (zzabh) obj;
        if (!TextUtils.isEmpty(zzabh.mo48852e())) {
            this.f40476b.f40478b.mo49991g(new Status(17025), PhoneAuthCredential.m6087q2(zzabh.mo48850c(), zzabh.mo48852e()));
            return;
        }
        this.f40476b.f40479c.m58143o(new zzzy(zzabh.mo48851d(), zzabh.mo48849b(), Long.valueOf(zzabh.mo48848a()), "Bearer"), (String) null, "phone", Boolean.valueOf(zzabh.mo48853f()), (zze) null, this.f40476b.f40478b, this.f40475a);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40475a.mo49911o(str);
    }
}

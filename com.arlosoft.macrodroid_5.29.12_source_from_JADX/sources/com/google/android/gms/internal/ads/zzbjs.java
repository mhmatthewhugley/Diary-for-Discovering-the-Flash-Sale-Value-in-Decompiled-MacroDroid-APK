package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbjs extends zzbjt {

    /* renamed from: a */
    private final zzf f27348a;
    @Nullable

    /* renamed from: c */
    private final String f27349c;

    /* renamed from: d */
    private final String f27350d;

    public zzbjs(zzf zzf, @Nullable String str, String str2) {
        this.f27348a = zzf;
        this.f27349c = str;
        this.f27350d = str2;
    }

    /* renamed from: a */
    public final String mo42692a() {
        return this.f27350d;
    }

    /* renamed from: b */
    public final void mo42693b() {
        this.f27348a.zzb();
    }

    /* renamed from: c */
    public final void mo42694c() {
        this.f27348a.mo20421a();
    }

    /* renamed from: d0 */
    public final void mo42695d0(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.f27348a.mo20422b((View) ObjectWrapper.m5050A1(iObjectWrapper));
        }
    }

    public final String zzb() {
        return this.f27349c;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbub {

    /* renamed from: a */
    private final Object f27778a = new Object();

    /* renamed from: b */
    private final Object f27779b = new Object();

    /* renamed from: c */
    private zzbuk f27780c;

    /* renamed from: d */
    private zzbuk f27781d;

    /* renamed from: c */
    private static final Context m44139c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final zzbuk mo42996a(Context context, zzcgv zzcgv, @Nullable zzfjw zzfjw) {
        zzbuk zzbuk;
        synchronized (this.f27778a) {
            if (this.f27780c == null) {
                this.f27780c = new zzbuk(m44139c(context), zzcgv, (String) zzay.m1924c().mo42663b(zzbjc.f27061a), zzfjw);
            }
            zzbuk = this.f27780c;
        }
        return zzbuk;
    }

    /* renamed from: b */
    public final zzbuk mo42997b(Context context, zzcgv zzcgv, zzfjw zzfjw) {
        zzbuk zzbuk;
        synchronized (this.f27779b) {
            if (this.f27781d == null) {
                this.f27781d = new zzbuk(m44139c(context), zzcgv, (String) zzblb.f27491b.mo42728e(), zzfjw);
            }
            zzbuk = this.f27781d;
        }
        return zzbuk;
    }
}

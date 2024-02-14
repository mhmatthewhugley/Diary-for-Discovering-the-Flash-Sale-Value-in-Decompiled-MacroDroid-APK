package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbel {
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: a */
    public zzbea f26702a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f26703b;

    /* renamed from: c */
    private final Context f26704c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f26705d = new Object();

    zzbel(Context context) {
        this.f26704c = context;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m43230e(zzbel zzbel) {
        synchronized (zzbel.f26705d) {
            zzbea zzbea = zzbel.f26702a;
            if (zzbea != null) {
                zzbea.mo21640b();
                zzbel.f26702a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Future mo42543c(zzbeb zzbeb) {
        zzbef zzbef = new zzbef(this);
        zzbej zzbej = new zzbej(this, zzbeb, zzbef);
        zzbek zzbek = new zzbek(this, zzbef);
        synchronized (this.f26705d) {
            zzbea zzbea = new zzbea(this.f26704c, zzt.m2909v().mo20334b(), zzbej, zzbek);
            this.f26702a = zzbea;
            zzbea.mo21655v();
        }
        return zzbef;
    }
}

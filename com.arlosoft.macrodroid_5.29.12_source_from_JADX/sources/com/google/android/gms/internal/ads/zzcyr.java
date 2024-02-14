package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcyr implements zzdeo, zzddu {

    /* renamed from: a */
    private final Context f31861a;
    @Nullable

    /* renamed from: c */
    private final zzcmp f31862c;

    /* renamed from: d */
    private final zzfdk f31863d;

    /* renamed from: f */
    private final zzcgv f31864f;
    @Nullable

    /* renamed from: g */
    private IObjectWrapper f31865g;

    /* renamed from: o */
    private boolean f31866o;

    public zzcyr(Context context, @Nullable zzcmp zzcmp, zzfdk zzfdk, zzcgv zzcgv) {
        this.f31861a = context;
        this.f31862c = zzcmp;
        this.f31863d = zzfdk;
        this.f31864f = zzcgv;
    }

    /* renamed from: a */
    private final synchronized void m47041a() {
        zzeha zzeha;
        zzehb zzehb;
        if (this.f31863d.f35513U) {
            if (this.f31862c != null) {
                if (zzt.m2888a().mo45294d(this.f31861a)) {
                    zzcgv zzcgv = this.f31864f;
                    String str = zzcgv.f28447c + "." + zzcgv.f28448d;
                    String a = this.f31863d.f35515W.mo45627a();
                    if (this.f31863d.f35515W.mo45628b() == 1) {
                        zzeha = zzeha.VIDEO;
                        zzehb = zzehb.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzeha = zzeha.HTML_DISPLAY;
                        if (this.f31863d.f35529f == 1) {
                            zzehb = zzehb.ONE_PIXEL;
                        } else {
                            zzehb = zzehb.BEGIN_TO_RENDER;
                        }
                    }
                    IObjectWrapper a2 = zzt.m2888a().mo45291a(str, this.f31862c.mo44029S(), "", "javascript", a, zzehb, zzeha, this.f31863d.f35546n0);
                    this.f31865g = a2;
                    zzcmp zzcmp = this.f31862c;
                    if (a2 != null) {
                        zzt.m2888a().mo45293c(this.f31865g, (View) zzcmp);
                        this.f31862c.mo44015F0(this.f31865g);
                        zzt.m2888a().mo45295d0(this.f31865g);
                        this.f31866o = true;
                        this.f31862c.mo42954y("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44390j() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f31866o     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0008
            r3.m47041a()     // Catch:{ all -> 0x0024 }
        L_0x0008:
            com.google.android.gms.internal.ads.zzfdk r0 = r3.f31863d     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.f35513U     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.dynamic.IObjectWrapper r0 = r3.f31865g     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.zzcmp r0 = r3.f31862c     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "onSdkImpression"
            r0.mo42954y(r2, r1)     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)
            return
        L_0x0022:
            monitor-exit(r3)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcyr.mo44390j():void");
    }

    /* renamed from: n */
    public final synchronized void mo44393n() {
        if (!this.f31866o) {
            m47041a();
        }
    }
}

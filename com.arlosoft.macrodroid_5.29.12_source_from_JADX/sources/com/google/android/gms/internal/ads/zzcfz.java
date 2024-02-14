package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcfz {
    @VisibleForTesting

    /* renamed from: a */
    long f28396a = -1;
    @VisibleForTesting

    /* renamed from: b */
    long f28397b = -1;
    @VisibleForTesting

    /* renamed from: c */
    int f28398c = -1;
    @VisibleForTesting

    /* renamed from: d */
    int f28399d = -1;
    @VisibleForTesting

    /* renamed from: e */
    long f28400e = 0;

    /* renamed from: f */
    private final Object f28401f = new Object();
    @VisibleForTesting

    /* renamed from: g */
    final String f28402g;

    /* renamed from: h */
    private final zzg f28403h;
    @VisibleForTesting

    /* renamed from: i */
    int f28404i = 0;
    @VisibleForTesting

    /* renamed from: j */
    int f28405j = 0;

    public zzcfz(String str, zzg zzg) {
        this.f28402g = str;
        this.f28403h = zzg;
    }

    /* renamed from: g */
    private final void m45134g() {
        if (((Boolean) zzbky.f27477a.mo42728e()).booleanValue()) {
            synchronized (this.f28401f) {
                this.f28398c--;
                this.f28399d--;
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo43506a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f28401f) {
            bundle = new Bundle();
            if (!this.f28403h.mo20366e0()) {
                bundle.putString("session_id", this.f28402g);
            }
            bundle.putLong("basets", this.f28397b);
            bundle.putLong("currts", this.f28396a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f28398c);
            bundle.putInt("preqs_in_session", this.f28399d);
            bundle.putLong("time_in_session", this.f28400e);
            bundle.putInt("pclick", this.f28404i);
            bundle.putInt("pimp", this.f28405j);
            Context a = zzcbq.m44809a(context);
            int identifier = a.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                zzcgp.m45228f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z = true;
                    } else {
                        zzcgp.m45228f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zzcgp.m45229g("Fail to fetch AdActivity theme");
                    zzcgp.m45228f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }

    /* renamed from: b */
    public final void mo43507b() {
        synchronized (this.f28401f) {
            this.f28404i++;
        }
    }

    /* renamed from: c */
    public final void mo43508c() {
        synchronized (this.f28401f) {
            this.f28405j++;
        }
    }

    /* renamed from: d */
    public final void mo43509d() {
        m45134g();
    }

    /* renamed from: e */
    public final void mo43510e() {
        m45134g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43511f(com.google.android.gms.ads.internal.client.zzl r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f28401f
            monitor-enter(r0)
            com.google.android.gms.ads.internal.util.zzg r1 = r10.f28403h     // Catch:{ all -> 0x0074 }
            long r1 = r1.mo20363d()     // Catch:{ all -> 0x0074 }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.m2889b()     // Catch:{ all -> 0x0074 }
            long r3 = r3.mo21950a()     // Catch:{ all -> 0x0074 }
            long r5 = r10.f28397b     // Catch:{ all -> 0x0074 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.zzbiu r5 = com.google.android.gms.internal.ads.zzbjc.f26937N0     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.ads.zzbja r6 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x0074 }
            java.lang.Object r5 = r6.mo42663b(r5)     // Catch:{ all -> 0x0074 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0074 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0074 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.f28399d = r1     // Catch:{ all -> 0x0074 }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.ads.internal.util.zzg r1 = r10.f28403h     // Catch:{ all -> 0x0074 }
            int r1 = r1.mo20357a()     // Catch:{ all -> 0x0074 }
            r10.f28399d = r1     // Catch:{ all -> 0x0074 }
        L_0x003b:
            r10.f28397b = r12     // Catch:{ all -> 0x0074 }
            r10.f28396a = r12     // Catch:{ all -> 0x0074 }
            goto L_0x0042
        L_0x0040:
            r10.f28396a = r12     // Catch:{ all -> 0x0074 }
        L_0x0042:
            android.os.Bundle r11 = r11.f1999d     // Catch:{ all -> 0x0074 }
            r12 = 1
            if (r11 == 0) goto L_0x0053
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0074 }
            if (r11 == r12) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x0053:
            int r11 = r10.f28398c     // Catch:{ all -> 0x0074 }
            int r11 = r11 + r12
            r10.f28398c = r11     // Catch:{ all -> 0x0074 }
            int r11 = r10.f28399d     // Catch:{ all -> 0x0074 }
            int r11 = r11 + r12
            r10.f28399d = r11     // Catch:{ all -> 0x0074 }
            if (r11 != 0) goto L_0x0069
            r11 = 0
            r10.f28400e = r11     // Catch:{ all -> 0x0074 }
            com.google.android.gms.ads.internal.util.zzg r11 = r10.f28403h     // Catch:{ all -> 0x0074 }
            r11.mo20378k0(r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0072
        L_0x0069:
            com.google.android.gms.ads.internal.util.zzg r11 = r10.f28403h     // Catch:{ all -> 0x0074 }
            long r11 = r11.mo20359b()     // Catch:{ all -> 0x0074 }
            long r3 = r3 - r11
            r10.f28400e = r3     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x0074:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfz.mo43511f(com.google.android.gms.ads.internal.client.zzl, long):void");
    }
}

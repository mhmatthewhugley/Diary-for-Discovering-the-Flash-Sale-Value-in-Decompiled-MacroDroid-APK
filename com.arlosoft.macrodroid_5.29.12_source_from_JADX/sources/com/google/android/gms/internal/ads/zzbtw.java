package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbtw {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f27767a = new Object();

    /* renamed from: b */
    private final Context f27768b;

    /* renamed from: c */
    private final String f27769c;

    /* renamed from: d */
    private final zzcgv f27770d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: e */
    public final zzfjw f27771e;

    /* renamed from: f */
    private final zzbb f27772f;

    /* renamed from: g */
    private final zzbb f27773g;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: h */
    public zzbtv f27774h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f27775i = 1;

    public zzbtw(Context context, zzcgv zzcgv, String str, zzbb zzbb, zzbb zzbb2, @Nullable zzfjw zzfjw) {
        this.f27769c = str;
        this.f27768b = context.getApplicationContext();
        this.f27770d = zzcgv;
        this.f27771e = zzfjw;
        this.f27772f = zzbb;
        this.f27773g = zzbb2;
    }

    /* renamed from: b */
    public final zzbtq mo42989b(@Nullable zzape zzape) {
        synchronized (this.f27767a) {
            synchronized (this.f27767a) {
                zzbtv zzbtv = this.f27774h;
                if (zzbtv != null && this.f27775i == 0) {
                    zzbtv.mo43584e(new zzbtb(this), zzbtc.f27727a);
                }
            }
            zzbtv zzbtv2 = this.f27774h;
            if (zzbtv2 != null) {
                if (zzbtv2.mo43581a() != -1) {
                    int i = this.f27775i;
                    if (i == 0) {
                        zzbtq f = this.f27774h.mo42985f();
                        return f;
                    } else if (i == 1) {
                        this.f27775i = 2;
                        mo42990d((zzape) null);
                        zzbtq f2 = this.f27774h.mo42985f();
                        return f2;
                    } else {
                        zzbtq f3 = this.f27774h.mo42985f();
                        return f3;
                    }
                }
            }
            this.f27775i = 2;
            zzbtv d = mo42990d((zzape) null);
            this.f27774h = d;
            zzbtq f4 = d.mo42985f();
            return f4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final zzbtv mo42990d(@Nullable zzape zzape) {
        zzfjj a = zzfji.m50258a(this.f27768b, 6);
        a.mo45794c();
        zzbtv zzbtv = new zzbtv(this.f27773g);
        zzchc.f28460e.execute(new zzbtd(this, (zzape) null, zzbtv));
        zzbtv.mo43584e(new zzbtl(this, zzbtv, a), new zzbtm(this, zzbtv, a));
        return zzbtv;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo42991i(com.google.android.gms.internal.ads.zzbtv r4, com.google.android.gms.internal.ads.zzbsr r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f27767a
            monitor-enter(r0)
            int r1 = r4.mo43581a()     // Catch:{ all -> 0x0028 }
            r2 = -1
            if (r1 == r2) goto L_0x0026
            int r1 = r4.mo43581a()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            r4.mo43582c()     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzfzq r4 = com.google.android.gms.internal.ads.zzchc.f28460e     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzbtg r1 = new com.google.android.gms.internal.ads.zzbtg     // Catch:{ all -> 0x0028 }
            r1.<init>(r5)     // Catch:{ all -> 0x0028 }
            r4.execute(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.ads.internal.util.zze.m2645k(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbtw.mo42991i(com.google.android.gms.internal.ads.zzbtv, com.google.android.gms.internal.ads.zzbsr):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo42992j(zzape zzape, zzbtv zzbtv) {
        try {
            zzbsz zzbsz = new zzbsz(this.f27768b, this.f27770d, (zzape) null, (zza) null);
            zzbsz.mo42959e1(new zzbtf(this, zzbtv, zzbsz));
            zzbsz.mo42970L0("/jsLoaded", new zzbth(this, zzbtv, zzbsz));
            zzca zzca = new zzca();
            zzbti zzbti = new zzbti(this, (zzape) null, zzbsz, zzca);
            zzca.mo20339b(zzbti);
            zzbsz.mo42970L0("/requestReload", zzbti);
            if (this.f27769c.endsWith(".js")) {
                zzbsz.mo42962w0(this.f27769c);
            } else if (this.f27769c.startsWith("<html>")) {
                zzbsz.mo42957W(this.f27769c);
            } else {
                zzbsz.mo42963z0(this.f27769c);
            }
            zzs.f2304i.postDelayed(new zzbtk(this, zzbtv, zzbsz), 60000);
        } catch (Throwable th) {
            zzcgp.m45227e("Error creating webview.", th);
            zzt.m2904q().mo43503t(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbtv.mo43582c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo42993k(zzbsr zzbsr) {
        if (zzbsr.mo42960g()) {
            this.f27775i = 1;
        }
    }
}

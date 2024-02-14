package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeas implements zzo, zzcoa {

    /* renamed from: a */
    private final Context f33585a;

    /* renamed from: c */
    private final zzcgv f33586c;

    /* renamed from: d */
    private zzeak f33587d;

    /* renamed from: f */
    private zzcmp f33588f;

    /* renamed from: g */
    private boolean f33589g;

    /* renamed from: o */
    private boolean f33590o;

    /* renamed from: p */
    private long f33591p;
    @Nullable

    /* renamed from: s */
    private zzcy f33592s;

    /* renamed from: z */
    private boolean f33593z;

    zzeas(Context context, zzcgv zzcgv) {
        this.f33585a = context;
        this.f33586c = zzcgv;
    }

    /* renamed from: g */
    private final synchronized boolean m48521g(zzcy zzcy) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26854E7)).booleanValue()) {
            zzcgp.m45229g("Ad inspector had an internal error.");
            try {
                zzcy.mo19987G3(zzffe.m50085d(16, (String) null, (zze) null));
            } catch (RemoteException unused) {
            }
        } else if (this.f33587d == null) {
            zzcgp.m45229g("Ad inspector had an internal error.");
            try {
                zzcy.mo19987G3(zzffe.m50085d(16, (String) null, (zze) null));
            } catch (RemoteException unused2) {
            }
        } else {
            if (!this.f33589g && !this.f33590o) {
                if (zzt.m2889b().mo21950a() >= this.f33591p + ((long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f26884H7)).intValue())) {
                    return true;
                }
            }
            zzcgp.m45229g("Ad inspector cannot be opened because it is already open.");
            try {
                zzcy.mo19987G3(zzffe.m50085d(19, (String) null, (zze) null));
            } catch (RemoteException unused3) {
            }
        }
        return false;
        return false;
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|10|11|12|(1:14)|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0025 */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20180O(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            if (r4 == 0) goto L_0x0012
            java.lang.String r4 = "Ad inspector loaded."
            com.google.android.gms.ads.internal.util.zze.m2645k(r4)     // Catch:{ all -> 0x002e }
            r3.f33589g = r0     // Catch:{ all -> 0x002e }
            java.lang.String r4 = ""
            r3.mo45142f(r4)     // Catch:{ all -> 0x002e }
            monitor-exit(r3)
            return
        L_0x0012:
            java.lang.String r4 = "Ad inspector failed to load."
            com.google.android.gms.internal.ads.zzcgp.m45229g(r4)     // Catch:{ all -> 0x002e }
            com.google.android.gms.ads.internal.client.zzcy r4 = r3.f33592s     // Catch:{ RemoteException -> 0x0025 }
            if (r4 == 0) goto L_0x0025
            r1 = 17
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r1 = com.google.android.gms.internal.ads.zzffe.m50085d(r1, r2, r2)     // Catch:{ RemoteException -> 0x0025 }
            r4.mo19987G3(r1)     // Catch:{ RemoteException -> 0x0025 }
        L_0x0025:
            r3.f33593z = r0     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.zzcmp r4 = r3.f33588f     // Catch:{ all -> 0x002e }
            r4.destroy()     // Catch:{ all -> 0x002e }
            monitor-exit(r3)
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeas.mo20180O(boolean):void");
    }

    /* renamed from: Z8 */
    public final void mo20216Z8() {
    }

    @Nullable
    /* renamed from: a */
    public final Activity mo45138a() {
        zzcmp zzcmp = this.f33588f;
        if (zzcmp == null || zzcmp.mo44037X0()) {
            return null;
        }
        return this.f33588f.mo43756i();
    }

    /* renamed from: b */
    public final void mo20217b() {
    }

    /* renamed from: c */
    public final void mo45139c(zzeak zzeak) {
        this.f33587d = zzeak;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo45140d(String str) {
        JSONObject e = this.f33587d.mo45126e();
        if (!TextUtils.isEmpty(str)) {
            try {
                e.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f33588f.mo42956q("window.inspectorInfo", e.toString());
    }

    /* renamed from: e */
    public final synchronized void mo45141e(zzcy zzcy, zzbpv zzbpv, zzbqg zzbqg) {
        zzcy zzcy2 = zzcy;
        synchronized (this) {
            if (m48521g(zzcy)) {
                try {
                    zzt.m2887B();
                    zzcmp a = zzcnb.m45940a(this.f33585a, zzcoe.m46199a(), "", false, false, (zzape) null, (zzbkb) null, this.f33586c, (zzbjr) null, (zzl) null, (zza) null, zzbep.m43241a(), (zzfdk) null, (zzfdn) null);
                    this.f33588f = a;
                    zzcoc e0 = a.mo44044e0();
                    if (e0 == null) {
                        zzcgp.m45229g("Failed to obtain a web view for the ad inspector");
                        try {
                            zzcy2.mo19987G3(zzffe.m50085d(17, "Failed to obtain a web view for the ad inspector", (zze) null));
                        } catch (RemoteException unused) {
                        }
                    } else {
                        this.f33592s = zzcy2;
                        e0.mo44086I0((com.google.android.gms.ads.internal.client.zza) null, (zzbop) null, (zzo) null, (zzbor) null, (zzz) null, false, (zzbpx) null, (zzb) null, (zzbyg) null, (zzcdq) null, (zzego) null, (zzfkm) null, (zzdxq) null, (zzfir) null, zzbpv, (zzdkn) null, new zzbqm(this.f33585a), zzbqg);
                        e0.mo44085I(this);
                        this.f33588f.loadUrl((String) zzay.m1924c().mo42663b(zzbjc.f26864F7));
                        zzt.m2898k();
                        zzm.m2466a(this.f33585a, new AdOverlayInfoParcel(this, this.f33588f, 1, this.f33586c), true);
                        this.f33591p = zzt.m2889b().mo21950a();
                    }
                } catch (zzcna e) {
                    zzcgp.m45230h("Failed to obtain a web view for the ad inspector", e);
                    try {
                        zzcy2.mo19987G3(zzffe.m50085d(17, "Failed to obtain a web view for the ad inspector", (zze) null));
                    } catch (RemoteException unused2) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo45142f(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f33589g     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r2.f33590o     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            com.google.android.gms.internal.ads.zzfzq r0 = com.google.android.gms.internal.ads.zzchc.f28460e     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.zzear r1 = new com.google.android.gms.internal.ads.zzear     // Catch:{ all -> 0x0018 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0018 }
            r0.execute(r1)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0016:
            monitor-exit(r2)
            return
        L_0x0018:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeas.mo45142f(java.lang.String):void");
    }

    /* renamed from: sb */
    public final void mo20218sb() {
    }

    /* renamed from: t1 */
    public final void mo20219t1() {
    }

    /* renamed from: y */
    public final synchronized void mo20220y(int i) {
        this.f33588f.destroy();
        if (!this.f33593z) {
            com.google.android.gms.ads.internal.util.zze.m2645k("Inspector closed.");
            zzcy zzcy = this.f33592s;
            if (zzcy != null) {
                try {
                    zzcy.mo19987G3((zze) null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f33590o = false;
        this.f33589g = false;
        this.f33591p = 0;
        this.f33593z = false;
        this.f33592s = null;
    }

    public final synchronized void zzb() {
        this.f33590o = true;
        mo45142f("");
    }
}

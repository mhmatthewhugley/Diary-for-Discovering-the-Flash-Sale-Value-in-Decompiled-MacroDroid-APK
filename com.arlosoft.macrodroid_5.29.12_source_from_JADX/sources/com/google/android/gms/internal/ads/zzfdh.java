package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfdh extends zzcbu {

    /* renamed from: a */
    private final zzfcx f35481a;

    /* renamed from: c */
    private final zzfcn f35482c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzfdx f35483d;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public zzduc f35484f;

    /* renamed from: g */
    private boolean f35485g = false;

    public zzfdh(zzfcx zzfcx, zzfcn zzfcn, zzfdx zzfdx) {
        this.f35481a = zzfcx;
        this.f35482c = zzfcn;
        this.f35483d = zzfdx;
    }

    /* renamed from: H */
    private final synchronized boolean m49911H() {
        zzduc zzduc;
        zzduc = this.f35484f;
        return zzduc != null && !zzduc.mo44991k();
    }

    /* renamed from: P5 */
    public final synchronized void mo43300P5(zzcbz zzcbz) throws RemoteException {
        Preconditions.m4483f("loadAd must be called on the main UI thread.");
        String str = zzcbz.f28203c;
        String str2 = (String) zzay.m1924c().mo42663b(zzbjc.f27306y4);
        if (!(str2 == null || str == null)) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                zzt.m2904q().mo43503t(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (m49911H()) {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26811A4)).booleanValue()) {
                return;
            }
        }
        zzfcp zzfcp = new zzfcp((String) null);
        this.f35484f = null;
        this.f35481a.mo45595i(1);
        this.f35481a.mo45412a(zzcbz.f28202a, zzcbz.f28203c, zzfcp, new zzfdf(this));
    }

    /* renamed from: Q3 */
    public final synchronized void mo43301Q3(String str) throws RemoteException {
        Preconditions.m4483f("#008 Must be called on the main UI thread.: setCustomData");
        this.f35483d.f35592b = str;
    }

    @Nullable
    /* renamed from: a */
    public final synchronized zzdh mo43302a() throws RemoteException {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26972Q5)).booleanValue()) {
            return null;
        }
        zzduc zzduc = this.f35484f;
        if (zzduc == null) {
            return null;
        }
        return zzduc.mo44496c();
    }

    /* renamed from: a0 */
    public final synchronized void mo43303a0(String str) throws RemoteException {
        Preconditions.m4483f("setUserId must be called on the main UI thread.");
        this.f35483d.f35591a = str;
    }

    /* renamed from: b */
    public final void mo43304b() throws RemoteException {
        mo43308f1((IObjectWrapper) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.app.Activity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43305c0(@androidx.annotation.Nullable com.google.android.gms.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m4483f(r0)     // Catch:{ all -> 0x0024 }
            com.google.android.gms.internal.ads.zzduc r0 = r2.f35484f     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            if (r3 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.m5050A1(r3)     // Catch:{ all -> 0x0024 }
            boolean r1 = r3 instanceof android.app.Activity     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x0024 }
        L_0x0019:
            com.google.android.gms.internal.ads.zzduc r3 = r2.f35484f     // Catch:{ all -> 0x0024 }
            boolean r1 = r2.f35485g     // Catch:{ all -> 0x0024 }
            r3.mo44994n(r1, r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0022:
            monitor-exit(r2)
            return
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdh.mo43305c0(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    @Nullable
    /* renamed from: d */
    public final synchronized String mo43306d() throws RemoteException {
        zzduc zzduc = this.f35484f;
        if (zzduc == null || zzduc.mo44496c() == null) {
            return null;
        }
        return zzduc.mo44496c().mo19995f();
    }

    /* renamed from: e */
    public final void mo43307e() {
        mo43317y0((IObjectWrapper) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43308f1(com.google.android.gms.dynamic.IObjectWrapper r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m4483f(r0)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.zzfcn r0 = r2.f35482c     // Catch:{ all -> 0x0027 }
            r1 = 0
            r0.mo45588g(r1)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.zzduc r0 = r2.f35484f     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            if (r3 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.m5050A1(r3)     // Catch:{ all -> 0x0027 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0027 }
        L_0x001a:
            com.google.android.gms.internal.ads.zzduc r3 = r2.f35484f     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.zzddz r3 = r3.mo44497d()     // Catch:{ all -> 0x0027 }
            r3.mo44583M0(r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0025:
            monitor-exit(r2)
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdh.mo43308f1(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    /* renamed from: fb */
    public final void mo43309fb(zzcby zzcby) throws RemoteException {
        Preconditions.m4483f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f35482c.mo45585W(zzcby);
    }

    /* renamed from: g7 */
    public final void mo43310g7(zzbw zzbw) {
        Preconditions.m4483f("setAdMetadataListener can only be called from the UI thread.");
        if (zzbw == null) {
            this.f35482c.mo45588g((zzfmr) null);
        } else {
            this.f35482c.mo45588g(new zzfdg(this, zzbw));
        }
    }

    /* renamed from: h */
    public final void mo43311h() {
        mo43316s1((IObjectWrapper) null);
    }

    /* renamed from: k1 */
    public final synchronized void mo43312k1(boolean z) {
        Preconditions.m4483f("setImmersiveMode must be called on the main UI thread.");
        this.f35485g = z;
    }

    /* renamed from: p */
    public final boolean mo43313p() throws RemoteException {
        Preconditions.m4483f("isLoaded must be called on the main UI thread.");
        return m49911H();
    }

    /* renamed from: r */
    public final boolean mo43314r() {
        zzduc zzduc = this.f35484f;
        return zzduc != null && zzduc.mo44993m();
    }

    /* renamed from: s */
    public final synchronized void mo43315s() throws RemoteException {
        mo43305c0((IObjectWrapper) null);
    }

    /* renamed from: s1 */
    public final synchronized void mo43316s1(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.m4483f("resume must be called on the main UI thread.");
        if (this.f35484f != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
            }
            this.f35484f.mo44497d().mo44585Y0(context);
        }
    }

    /* renamed from: y0 */
    public final synchronized void mo43317y0(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.m4483f("pause must be called on the main UI thread.");
        if (this.f35484f != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
            }
            this.f35484f.mo44497d().mo44584W0(context);
        }
    }

    /* renamed from: za */
    public final void mo43318za(zzcbt zzcbt) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f35482c.mo45586b0(zzcbt);
    }

    public final Bundle zzb() {
        Preconditions.m4483f("getAdMetadata can only be called from the UI thread.");
        zzduc zzduc = this.f35484f;
        return zzduc != null ? zzduc.mo44988h() : new Bundle();
    }
}

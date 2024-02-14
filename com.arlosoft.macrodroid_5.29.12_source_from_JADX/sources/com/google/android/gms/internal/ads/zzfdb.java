package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfdb extends zzcck {

    /* renamed from: a */
    private final zzfcx f35464a;

    /* renamed from: c */
    private final zzfcn f35465c;

    /* renamed from: d */
    private final String f35466d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzfdx f35467f;

    /* renamed from: g */
    private final Context f35468g;

    /* renamed from: o */
    private final zzcgv f35469o;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: p */
    public zzduc f35470p;

    /* renamed from: s */
    private boolean f35471s = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26807A0)).booleanValue();

    public zzfdb(@Nullable String str, zzfcx zzfcx, Context context, zzfcn zzfcn, zzfdx zzfdx, zzcgv zzcgv) {
        this.f35466d = str;
        this.f35464a = zzfcx;
        this.f35465c = zzfcn;
        this.f35467f = zzfdx;
        this.f35468g = context;
        this.f35469o = zzcgv;
    }

    /* renamed from: Nb */
    private final synchronized void m49891Nb(zzl zzl, zzccs zzccs, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) zzbkq.f27451l.mo42728e()).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26935M8)).booleanValue()) {
                z = true;
            }
        }
        if (this.f35469o.f28448d < ((Integer) zzay.m1924c().mo42663b(zzbjc.f26945N8)).intValue() || !z) {
            Preconditions.m4483f("#008 Must be called on the main UI thread.");
        }
        this.f35465c.mo45584K(zzccs);
        zzt.m2905r();
        if (zzs.m2753d(this.f35468g)) {
            if (zzl.f1991J == null) {
                zzcgp.m45226d("Failed to load the ad because app ID is missing.");
                this.f35465c.mo44382r(zzffe.m50085d(4, (String) null, (zze) null));
                return;
            }
        }
        if (this.f35470p == null) {
            zzfcp zzfcp = new zzfcp((String) null);
            this.f35464a.mo45595i(i);
            this.f35464a.mo45412a(zzl, this.f35466d, zzfcp, new zzfda(this));
        }
    }

    /* renamed from: B4 */
    public final synchronized void mo20116B4(zzccz zzccz) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzfdx zzfdx = this.f35467f;
        zzfdx.f35591a = zzccz.f28217a;
        zzfdx.f35592b = zzccz.f28218c;
    }

    /* renamed from: Fb */
    public final synchronized void mo20117Fb(zzl zzl, zzccs zzccs) throws RemoteException {
        m49891Nb(zzl, zzccs, 3);
    }

    /* renamed from: K5 */
    public final void mo20118K5(zzcct zzcct) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        this.f35465c.mo45587c0(zzcct);
    }

    /* renamed from: N0 */
    public final synchronized void mo20119N0(boolean z) {
        Preconditions.m4483f("setImmersiveMode must be called on the main UI thread.");
        this.f35471s = z;
    }

    /* renamed from: N8 */
    public final synchronized void mo20120N8(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        if (this.f35470p == null) {
            zzcgp.m45229g("Rewarded can not be shown before loaded");
            this.f35465c.mo44388M0(zzffe.m50085d(9, (String) null, (zze) null));
            return;
        }
        this.f35470p.mo44994n(z, (Activity) ObjectWrapper.m5050A1(iObjectWrapper));
    }

    /* renamed from: Pa */
    public final synchronized void mo20121Pa(IObjectWrapper iObjectWrapper) throws RemoteException {
        mo20120N8(iObjectWrapper, this.f35471s);
    }

    @Nullable
    /* renamed from: a */
    public final zzdh mo20122a() {
        zzduc zzduc;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26972Q5)).booleanValue() && (zzduc = this.f35470p) != null) {
            return zzduc.mo44496c();
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public final synchronized String mo20123b() throws RemoteException {
        zzduc zzduc = this.f35470p;
        if (zzduc == null || zzduc.mo44496c() == null) {
            return null;
        }
        return zzduc.mo44496c().mo19995f();
    }

    @Nullable
    /* renamed from: d */
    public final zzcci mo20124d() {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzduc zzduc = this.f35470p;
        if (zzduc != null) {
            return zzduc.mo44989i();
        }
        return null;
    }

    /* renamed from: eb */
    public final void mo20125eb(zzcco zzcco) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        this.f35465c.mo45590u(zzcco);
    }

    /* renamed from: l */
    public final boolean mo20126l() {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzduc zzduc = this.f35470p;
        return zzduc != null && !zzduc.mo44992l();
    }

    /* renamed from: r7 */
    public final synchronized void mo20127r7(zzl zzl, zzccs zzccs) throws RemoteException {
        m49891Nb(zzl, zzccs, 2);
    }

    /* renamed from: s3 */
    public final void mo20128s3(zzde zzde) {
        Preconditions.m4483f("setOnPaidEventListener must be called on the main UI thread.");
        this.f35465c.mo45589o(zzde);
    }

    /* renamed from: s4 */
    public final void mo20129s4(zzdb zzdb) {
        if (zzdb == null) {
            this.f35465c.mo45588g((zzfmr) null);
        } else {
            this.f35465c.mo45588g(new zzfcz(this, zzdb));
        }
    }

    public final Bundle zzb() {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzduc zzduc = this.f35470p;
        return zzduc != null ? zzduc.mo44988h() : new Bundle();
    }
}

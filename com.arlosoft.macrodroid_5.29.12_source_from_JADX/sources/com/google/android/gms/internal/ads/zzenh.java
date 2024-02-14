package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzenh extends zzbr {

    /* renamed from: a */
    private final Context f34535a;

    /* renamed from: c */
    private final zzbf f34536c;

    /* renamed from: d */
    private final zzfef f34537d;

    /* renamed from: f */
    private final zzcxc f34538f;

    /* renamed from: g */
    private final ViewGroup f34539g;

    public zzenh(Context context, @Nullable zzbf zzbf, zzfef zzfef, zzcxc zzcxc) {
        this.f34535a = context;
        this.f34536c = zzbf;
        this.f34537d = zzfef;
        this.f34538f = zzcxc;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View i = zzcxc.mo44454i();
        zzt.m2905r();
        frameLayout.addView(i, zzs.m2737K());
        frameLayout.setMinimumHeight(mo19929f().f2027d);
        frameLayout.setMinimumWidth(mo19929f().f2030o);
        this.f34539g = frameLayout;
    }

    /* renamed from: D */
    public final void mo19922D() throws RemoteException {
        Preconditions.m4483f("destroy must be called on the main UI thread.");
        this.f34538f.mo44439a();
    }

    /* renamed from: D0 */
    public final void mo19946D0() throws RemoteException {
    }

    /* renamed from: Eb */
    public final void mo19923Eb(boolean z) throws RemoteException {
        zzcgp.m45228f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: F */
    public final void mo19947F() throws RemoteException {
        this.f34538f.mo44458m();
    }

    /* renamed from: I */
    public final void mo19924I() throws RemoteException {
        Preconditions.m4483f("destroy must be called on the main UI thread.");
        this.f34538f.mo44497d().mo44584W0((Context) null);
    }

    /* renamed from: J6 */
    public final void mo19948J6(zzbzl zzbzl) throws RemoteException {
    }

    /* renamed from: M4 */
    public final void mo19925M4(zzw zzw) throws RemoteException {
    }

    /* renamed from: M7 */
    public final void mo19949M7(zzcby zzcby) throws RemoteException {
    }

    /* renamed from: N3 */
    public final void mo19926N3(zzbc zzbc) throws RemoteException {
        zzcgp.m45228f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: Q5 */
    public final boolean mo19950Q5() throws RemoteException {
        return false;
    }

    /* renamed from: T8 */
    public final void mo19951T8(zzbjx zzbjx) throws RemoteException {
        zzcgp.m45228f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: U6 */
    public final void mo19952U6(String str) throws RemoteException {
    }

    /* renamed from: V */
    public final void mo19927V() throws RemoteException {
        Preconditions.m4483f("destroy must be called on the main UI thread.");
        this.f34538f.mo44497d().mo44585Y0((Context) null);
    }

    /* renamed from: a1 */
    public final boolean mo19953a1() throws RemoteException {
        return false;
    }

    /* renamed from: ab */
    public final void mo19954ab(zzbw zzbw) throws RemoteException {
        zzcgp.m45228f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: c3 */
    public final void mo19928c3(zzl zzl, zzbi zzbi) {
    }

    /* renamed from: d */
    public final Bundle mo19955d() throws RemoteException {
        zzcgp.m45228f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    /* renamed from: f */
    public final zzq mo19929f() {
        Preconditions.m4483f("getAdSize must be called on the main UI thread.");
        return zzfej.m50010a(this.f34535a, Collections.singletonList(this.f34538f.mo44456k()));
    }

    /* renamed from: g */
    public final zzbf mo19930g() throws RemoteException {
        return this.f34536c;
    }

    /* renamed from: h */
    public final zzbz mo19931h() throws RemoteException {
        return this.f34537d.f35639n;
    }

    /* renamed from: h6 */
    public final boolean mo19932h6(zzl zzl) throws RemoteException {
        zzcgp.m45228f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    /* renamed from: i */
    public final zzdh mo19933i() {
        return this.f34538f.mo44496c();
    }

    /* renamed from: j */
    public final zzdk mo19934j() throws RemoteException {
        return this.f34538f.mo44455j();
    }

    /* renamed from: l6 */
    public final void mo19956l6(zzcd zzcd) throws RemoteException {
        zzcgp.m45228f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: l9 */
    public final void mo19935l9(zzde zzde) {
        zzcgp.m45228f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: m8 */
    public final void mo19936m8(zzcg zzcg) {
    }

    /* renamed from: n */
    public final IObjectWrapper mo19937n() throws RemoteException {
        return ObjectWrapper.m5051g8(this.f34539g);
    }

    /* renamed from: o7 */
    public final void mo19938o7(zzbz zzbz) throws RemoteException {
        zzeof zzeof = this.f34537d.f35628c;
        if (zzeof != null) {
            zzeof.mo45400y(zzbz);
        }
    }

    /* renamed from: oa */
    public final void mo19939oa(zzq zzq) throws RemoteException {
        Preconditions.m4483f("setAdSize must be called on the main UI thread.");
        zzcxc zzcxc = this.f34538f;
        if (zzcxc != null) {
            zzcxc.mo44459n(this.f34539g, zzq);
        }
    }

    @Nullable
    /* renamed from: p */
    public final String mo19957p() throws RemoteException {
        if (this.f34538f.mo44496c() != null) {
            return this.f34538f.mo44496c().mo19995f();
        }
        return null;
    }

    /* renamed from: q */
    public final String mo19940q() throws RemoteException {
        return this.f34537d.f35631f;
    }

    /* renamed from: q9 */
    public final void mo19941q9(zzbdm zzbdm) throws RemoteException {
    }

    @Nullable
    /* renamed from: r */
    public final String mo19958r() throws RemoteException {
        if (this.f34538f.mo44496c() != null) {
            return this.f34538f.mo44496c().mo19995f();
        }
        return null;
    }

    /* renamed from: s7 */
    public final void mo19959s7(zzbzo zzbzo, String str) throws RemoteException {
    }

    /* renamed from: t8 */
    public final void mo19942t8(IObjectWrapper iObjectWrapper) {
    }

    /* renamed from: v8 */
    public final void mo19960v8(String str) throws RemoteException {
    }

    /* renamed from: w4 */
    public final void mo19961w4(zzdo zzdo) throws RemoteException {
    }

    /* renamed from: xa */
    public final void mo19943xa(zzbf zzbf) throws RemoteException {
        zzcgp.m45228f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: y9 */
    public final void mo19944y9(zzff zzff) throws RemoteException {
        zzcgp.m45228f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: ya */
    public final void mo19945ya(boolean z) throws RemoteException {
    }
}

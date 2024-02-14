package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdsn extends zzbse implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzblp {

    /* renamed from: a */
    private View f32981a;

    /* renamed from: c */
    private zzdk f32982c;

    /* renamed from: d */
    private zzdol f32983d;

    /* renamed from: f */
    private boolean f32984f = false;

    /* renamed from: g */
    private boolean f32985g = false;

    public zzdsn(zzdol zzdol, zzdoq zzdoq) {
        this.f32981a = zzdoq.mo44801N();
        this.f32982c = zzdoq.mo44805R();
        this.f32983d = zzdol;
        if (zzdoq.mo44813Z() != null) {
            zzdoq.mo44813Z().mo44006A0(this);
        }
    }

    /* renamed from: Jb */
    private static final void m48018Jb(zzbsi zzbsi, int i) {
        try {
            zzbsi.mo42947A(i);
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    private final void m48019e() {
        View view = this.f32981a;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f32981a);
            }
        }
    }

    /* renamed from: f */
    private final void m48020f() {
        View view;
        zzdol zzdol = this.f32983d;
        if (zzdol != null && (view = this.f32981a) != null) {
            zzdol.mo44772Q(view, Collections.emptyMap(), Collections.emptyMap(), zzdol.m47659w(this.f32981a));
        }
    }

    /* renamed from: Z9 */
    public final void mo42942Z9(IObjectWrapper iObjectWrapper, zzbsi zzbsi) throws RemoteException {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        if (this.f32984f) {
            zzcgp.m45226d("Instream ad can not be shown after destroy().");
            m48018Jb(zzbsi, 2);
            return;
        }
        View view = this.f32981a;
        if (view == null || this.f32982c == null) {
            zzcgp.m45226d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            m48018Jb(zzbsi, 0);
        } else if (this.f32985g) {
            zzcgp.m45226d("Instream ad should not be used again.");
            m48018Jb(zzbsi, 1);
        } else {
            this.f32985g = true;
            m48019e();
            ((ViewGroup) ObjectWrapper.m5050A1(iObjectWrapper)).addView(this.f32981a, new ViewGroup.LayoutParams(-1, -1));
            zzt.m2913z();
            zzchp.m45262a(this.f32981a, this);
            zzt.m2913z();
            zzchp.m45263b(this.f32981a, this);
            m48020f();
            try {
                zzbsi.mo42948c();
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public final zzbmb mo42943a() {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        if (this.f32984f) {
            zzcgp.m45226d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdol zzdol = this.f32983d;
        if (zzdol == null || zzdol.mo44761C() == null) {
            return null;
        }
        return zzdol.mo44761C().mo44793a();
    }

    /* renamed from: d */
    public final void mo42944d() throws RemoteException {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        m48019e();
        zzdol zzdol = this.f32983d;
        if (zzdol != null) {
            zzdol.mo44439a();
        }
        this.f32983d = null;
        this.f32981a = null;
        this.f32982c = null;
        this.f32984f = true;
    }

    public final void onGlobalLayout() {
        m48020f();
    }

    public final void onScrollChanged() {
        m48020f();
    }

    @Nullable
    public final zzdk zzb() throws RemoteException {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        if (!this.f32984f) {
            return this.f32982c;
        }
        zzcgp.m45226d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        mo42942Z9(iObjectWrapper, new zzdsm(this));
    }
}

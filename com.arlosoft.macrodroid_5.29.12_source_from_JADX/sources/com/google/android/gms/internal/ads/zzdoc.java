package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdoc extends zzbma {

    /* renamed from: a */
    private final zzdoq f32582a;

    /* renamed from: c */
    private IObjectWrapper f32583c;

    public zzdoc(zzdoq zzdoq) {
        this.f32582a = zzdoq;
    }

    /* renamed from: Jb */
    private static float m47643Jb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.m5050A1(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    /* renamed from: X5 */
    public final void mo42757X5(zzbnm zzbnm) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27227q5)).booleanValue() && (this.f32582a.mo44805R() instanceof zzcnl)) {
            ((zzcnl) this.f32582a.mo44805R()).mo44169Pb(zzbnm);
        }
    }

    /* renamed from: b */
    public final float mo42758b() throws RemoteException {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27217p5)).booleanValue()) {
            return 0.0f;
        }
        if (this.f32582a.mo44797J() != 0.0f) {
            return this.f32582a.mo44797J();
        }
        if (this.f32582a.mo44805R() != null) {
            try {
                return this.f32582a.mo44805R().mo19999b();
            } catch (RemoteException e) {
                zzcgp.m45227e("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        } else {
            IObjectWrapper iObjectWrapper = this.f32583c;
            if (iObjectWrapper != null) {
                return m47643Jb(iObjectWrapper);
            }
            zzbme U = this.f32582a.mo44808U();
            if (U == null) {
                return 0.0f;
            }
            float d = (U.mo42744d() == -1 || U.mo42741a() == -1) ? 0.0f : ((float) U.mo42744d()) / ((float) U.mo42741a());
            return d == 0.0f ? m47643Jb(U.mo42743c()) : d;
        }
    }

    /* renamed from: c */
    public final float mo42759c() throws RemoteException {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27227q5)).booleanValue() && this.f32582a.mo44805R() != null) {
            return this.f32582a.mo44805R().mo20000c();
        }
        return 0.0f;
    }

    @Nullable
    /* renamed from: e */
    public final zzdk mo42760e() throws RemoteException {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27227q5)).booleanValue()) {
            return null;
        }
        return this.f32582a.mo44805R();
    }

    /* renamed from: f */
    public final float mo42761f() throws RemoteException {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27227q5)).booleanValue() && this.f32582a.mo44805R() != null) {
            return this.f32582a.mo44805R().mo20001f();
        }
        return 0.0f;
    }

    @Nullable
    /* renamed from: g */
    public final IObjectWrapper mo42753g() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.f32583c;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbme U = this.f32582a.mo44808U();
        if (U == null) {
            return null;
        }
        return U.mo42743c();
    }

    /* renamed from: i */
    public final boolean mo42762i() throws RemoteException {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27227q5)).booleanValue() && this.f32582a.mo44805R() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public final void mo42763i0(IObjectWrapper iObjectWrapper) {
        this.f32583c = iObjectWrapper;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcxf extends zzcxc {

    /* renamed from: i */
    private final Context f31771i;

    /* renamed from: j */
    private final View f31772j;
    @Nullable

    /* renamed from: k */
    private final zzcmp f31773k;

    /* renamed from: l */
    private final zzfdl f31774l;

    /* renamed from: m */
    private final zzczc f31775m;

    /* renamed from: n */
    private final zzdpb f31776n;

    /* renamed from: o */
    private final zzdkp f31777o;

    /* renamed from: p */
    private final zzgxc f31778p;

    /* renamed from: q */
    private final Executor f31779q;

    /* renamed from: r */
    private zzq f31780r;

    zzcxf(zzczd zzczd, Context context, zzfdl zzfdl, View view, @Nullable zzcmp zzcmp, zzczc zzczc, zzdpb zzdpb, zzdkp zzdkp, zzgxc zzgxc, Executor executor) {
        super(zzczd);
        this.f31771i = context;
        this.f31772j = view;
        this.f31773k = zzcmp;
        this.f31774l = zzfdl;
        this.f31775m = zzczc;
        this.f31776n = zzdpb;
        this.f31777o = zzdkp;
        this.f31778p = zzgxc;
        this.f31779q = executor;
    }

    /* renamed from: o */
    public static /* synthetic */ void m46978o(zzcxf zzcxf) {
        zzdpb zzdpb = zzcxf.f31776n;
        if (zzdpb.mo44866e() != null) {
            try {
                zzdpb.mo44866e().mo42825e3((zzbs) zzcxf.f31778p.zzb(), ObjectWrapper.m5051g8(zzcxf.f31771i));
            } catch (RemoteException e) {
                zzcgp.m45227e("RemoteException when notifyAdLoad is called", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo44461b() {
        this.f31779q.execute(new zzcxe(this));
        super.mo44461b();
    }

    /* renamed from: h */
    public final int mo44453h() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26903J6)).booleanValue() && this.f31896b.f35536i0) {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26913K6)).booleanValue()) {
                return 0;
            }
        }
        return this.f31895a.f35590b.f35587b.f35567c;
    }

    /* renamed from: i */
    public final View mo44454i() {
        return this.f31772j;
    }

    @Nullable
    /* renamed from: j */
    public final zzdk mo44455j() {
        try {
            return this.f31775m.zza();
        } catch (zzfek unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final zzfdl mo44456k() {
        zzq zzq = this.f31780r;
        if (zzq != null) {
            return zzfej.m50012c(zzq);
        }
        zzfdk zzfdk = this.f31896b;
        if (zzfdk.f35526d0) {
            for (String str : zzfdk.f35519a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzfdl(this.f31772j.getWidth(), this.f31772j.getHeight(), false);
        }
        return zzfej.m50011b(this.f31896b.f35553s, this.f31774l);
    }

    /* renamed from: l */
    public final zzfdl mo44457l() {
        return this.f31774l;
    }

    /* renamed from: m */
    public final void mo44458m() {
        this.f31777o.zza();
    }

    /* renamed from: n */
    public final void mo44459n(ViewGroup viewGroup, zzq zzq) {
        zzcmp zzcmp;
        if (viewGroup != null && (zzcmp = this.f31773k) != null) {
            zzcmp.mo44057l0(zzcoe.m46201c(zzq));
            viewGroup.setMinimumHeight(zzq.f2027d);
            viewGroup.setMinimumWidth(zzq.f2030o);
            this.f31780r = zzq;
        }
    }
}

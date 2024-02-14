package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzcom;
import com.google.android.gms.internal.ads.zzdpk;
import com.google.android.gms.internal.ads.zzdpm;
import com.google.android.gms.internal.ads.zzdyy;
import com.google.android.gms.internal.ads.zzenj;
import com.google.android.gms.internal.ads.zzeyi;
import com.google.android.gms.internal.ads.zzeyj;
import com.google.android.gms.internal.ads.zzezw;
import com.google.android.gms.internal.ads.zzfbp;
import com.google.android.gms.internal.ads.zzfdd;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class ClientApi extends zzcb {
    /* renamed from: B3 */
    public final zzccl mo19854B3(IObjectWrapper iObjectWrapper, String str, zzbvk zzbvk, int i) {
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        zzfdd x = zzcom.m46233e(context, zzbvk, i).mo44214x();
        x.mo44343b(context);
        x.mo44344o(str);
        return x.mo44342a().zza();
    }

    /* renamed from: D1 */
    public final zzbzc mo19855D1(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.m5050A1(iObjectWrapper);
        AdOverlayInfoParcel l2 = AdOverlayInfoParcel.m2428l2(activity.getIntent());
        if (l2 == null) {
            return new zzt(activity);
        }
        int i = l2.f2053B;
        if (i == 1) {
            return new zzs(activity);
        }
        if (i == 2) {
            return new zzae(activity);
        }
        if (i == 3) {
            return new zzaf(activity);
        }
        if (i == 4) {
            return new zzy(activity, l2);
        }
        if (i != 5) {
            return new zzt(activity);
        }
        return new zzac(activity);
    }

    /* renamed from: E4 */
    public final zzbmi mo19856E4(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdpm((FrameLayout) ObjectWrapper.m5050A1(iObjectWrapper), (FrameLayout) ObjectWrapper.m5050A1(iObjectWrapper2), 223104000);
    }

    /* renamed from: F9 */
    public final zzbs mo19857F9(IObjectWrapper iObjectWrapper, zzq zzq, String str, int i) {
        return new zzs((Context) ObjectWrapper.m5050A1(iObjectWrapper), zzq, str, new zzcgv(223104000, i, true, false));
    }

    /* renamed from: G8 */
    public final zzbs mo19858G8(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbvk zzbvk, int i) {
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        zzeyi u = zzcom.m46233e(context, zzbvk, i).mo44211u();
        u.mo44274o(str);
        u.mo44273b(context);
        zzeyj a = u.mo44272a();
        if (i >= ((Integer) zzay.m1924c().mo42663b(zzbjc.f27226q4)).intValue()) {
            return a.zzb();
        }
        return a.zza();
    }

    /* renamed from: H8 */
    public final zzcfg mo19859H8(IObjectWrapper iObjectWrapper, zzbvk zzbvk, int i) {
        return zzcom.m46233e((Context) ObjectWrapper.m5050A1(iObjectWrapper), zzbvk, i).mo44209s();
    }

    /* renamed from: K1 */
    public final zzbqu mo19860K1(IObjectWrapper iObjectWrapper, zzbvk zzbvk, int i, zzbqr zzbqr) {
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        zzdyy n = zzcom.m46233e(context, zzbvk, i).mo44204n();
        n.mo44319b(context);
        n.mo44320c(zzbqr);
        return n.mo44318a().mo44321d();
    }

    /* renamed from: L0 */
    public final zzcm mo19861L0(IObjectWrapper iObjectWrapper, int i) {
        return zzcom.m46233e((Context) ObjectWrapper.m5050A1(iObjectWrapper), (zzbvk) null, i).mo44196f();
    }

    /* renamed from: O8 */
    public final zzcbv mo19862O8(IObjectWrapper iObjectWrapper, zzbvk zzbvk, int i) {
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        zzfdd x = zzcom.m46233e(context, zzbvk, i).mo44214x();
        x.mo44343b(context);
        return x.mo44342a().zzb();
    }

    /* renamed from: Y7 */
    public final zzbs mo19863Y7(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbvk zzbvk, int i) {
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        zzezw v = zzcom.m46233e(context, zzbvk, i).mo44212v();
        v.mo44298b(context);
        v.mo44297a(zzq);
        v.mo44300t(str);
        return v.mo44299d().zza();
    }

    /* renamed from: ha */
    public final zzbyv mo19864ha(IObjectWrapper iObjectWrapper, zzbvk zzbvk, int i) {
        return zzcom.m46233e((Context) ObjectWrapper.m5050A1(iObjectWrapper), zzbvk, i).mo44206p();
    }

    /* renamed from: lb */
    public final zzbmo mo19865lb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdpk((View) ObjectWrapper.m5050A1(iObjectWrapper), (HashMap) ObjectWrapper.m5050A1(iObjectWrapper2), (HashMap) ObjectWrapper.m5050A1(iObjectWrapper3));
    }

    /* renamed from: p7 */
    public final zzbs mo19866p7(IObjectWrapper iObjectWrapper, zzq zzq, String str, zzbvk zzbvk, int i) {
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        zzfbp w = zzcom.m46233e(context, zzbvk, i).mo44213w();
        w.mo44338b(context);
        w.mo44337a(zzq);
        w.mo44340t(str);
        return w.mo44339d().zza();
    }

    /* renamed from: yb */
    public final zzbo mo19867yb(IObjectWrapper iObjectWrapper, String str, zzbvk zzbvk, int i) {
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        return new zzenj(zzcom.m46233e(context, zzbvk, i), context, str);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbzt {

    /* renamed from: d */
    private static zzcfg f28021d;

    /* renamed from: a */
    private final Context f28022a;

    /* renamed from: b */
    private final AdFormat f28023b;
    @Nullable

    /* renamed from: c */
    private final zzdr f28024c;

    public zzbzt(Context context, AdFormat adFormat, @Nullable zzdr zzdr) {
        this.f28022a = context;
        this.f28023b = adFormat;
        this.f28024c = zzdr;
    }

    @Nullable
    /* renamed from: a */
    public static zzcfg m44740a(Context context) {
        zzcfg zzcfg;
        synchronized (zzbzt.class) {
            if (f28021d == null) {
                f28021d = zzaw.m1916a().mo19883p(context, new zzbvh());
            }
            zzcfg = f28021d;
        }
        return zzcfg;
    }

    /* renamed from: b */
    public final void mo43236b(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzl zzl;
        zzcfg a = m44740a(this.f28022a);
        if (a == null) {
            queryInfoGenerationCallback.mo20678a("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper g8 = ObjectWrapper.m5051g8(this.f28022a);
        zzdr zzdr = this.f28024c;
        if (zzdr == null) {
            zzl = new zzm().mo20149a();
        } else {
            zzl = zzp.f2018a.mo20160a(this.f28022a, zzdr);
        }
        try {
            a.mo20663q5(g8, new zzcfk((String) null, this.f28023b.name(), (zzq) null, zzl), new zzbzs(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.mo20678a("Internal Error.");
        }
    }
}

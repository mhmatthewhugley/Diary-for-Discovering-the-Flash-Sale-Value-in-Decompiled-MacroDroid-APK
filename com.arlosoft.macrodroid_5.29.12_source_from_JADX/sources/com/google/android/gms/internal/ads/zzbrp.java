package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbrp implements zzajw {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile zzbrc f27688a;

    /* renamed from: b */
    private final Context f27689b;

    public zzbrp(Context context) {
        this.f27689b = context;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m44018c(zzbrp zzbrp) {
        if (zzbrp.f27688a != null) {
            zzbrp.f27688a.mo21640b();
            Binder.flushPendingCommands();
        }
    }

    @Nullable
    /* renamed from: a */
    public final zzajz mo20311a(zzakd zzakd) throws zzakm {
        Parcelable.Creator<zzbrd> creator = zzbrd.CREATOR;
        Map n = zzakd.mo20327n();
        int size = n.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : n.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbrd zzbrd = new zzbrd(zzakd.mo41590m(), strArr, strArr2);
        long c = zzt.m2889b().mo21952c();
        try {
            zzchh zzchh = new zzchh();
            this.f27688a = new zzbrc(this.f27689b, zzt.m2909v().mo20334b(), new zzbrn(this, zzchh), new zzbro(this, zzchh));
            this.f27688a.mo21655v();
            zzbrl zzbrl = new zzbrl(this, zzbrd);
            zzfzq zzfzq = zzchc.f28456a;
            zzfzp o = zzfzg.m51420o(zzfzg.m51419n(zzchh, zzbrl, zzfzq), (long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f26850E3)).intValue(), TimeUnit.MILLISECONDS, zzchc.f28459d);
            o.mo43580q(new zzbrm(this), zzfzq);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) o.get();
            long c2 = zzt.m2889b().mo21952c();
            zze.m2645k("Http assets remote cache took " + (c2 - c) + "ms");
            zzbrf zzbrf = (zzbrf) new zzcba(parcelFileDescriptor).mo43270l2(zzbrf.CREATOR);
            if (zzbrf == null) {
                return null;
            }
            if (zzbrf.f27674a) {
                throw new zzakm(zzbrf.f27675c);
            } else if (zzbrf.f27678g.length != zzbrf.f27679o.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbrf.f27678g;
                    if (i >= strArr3.length) {
                        return new zzajz(zzbrf.f27676d, zzbrf.f27677f, (Map) hashMap, zzbrf.f27680p, zzbrf.f27681s);
                    }
                    hashMap.put(strArr3[i], zzbrf.f27679o[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            long c3 = zzt.m2889b().mo21952c();
            zze.m2645k("Http assets remote cache took " + (c3 - c) + "ms");
            return null;
        } catch (Throwable th) {
            long c4 = zzt.m2889b().mo21952c();
            zze.m2645k("Http assets remote cache took " + (c4 - c) + "ms");
            throw th;
        }
    }
}

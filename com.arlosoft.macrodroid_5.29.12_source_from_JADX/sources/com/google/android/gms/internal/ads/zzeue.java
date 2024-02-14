package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeue implements zzeve {

    /* renamed from: a */
    private final zzfzq f34927a;

    /* renamed from: b */
    private final ScheduledExecutorService f34928b;

    /* renamed from: c */
    private final zzenc f34929c;

    /* renamed from: d */
    private final Context f34930d;

    /* renamed from: e */
    private final zzfef f34931e;

    /* renamed from: f */
    private final zzemy f34932f;

    /* renamed from: g */
    private final zzdvl f34933g;

    /* renamed from: h */
    final String f34934h;

    public zzeue(zzfzq zzfzq, ScheduledExecutorService scheduledExecutorService, String str, zzenc zzenc, Context context, zzfef zzfef, zzemy zzemy, zzdvl zzdvl) {
        this.f34927a = zzfzq;
        this.f34928b = scheduledExecutorService;
        this.f34934h = str;
        this.f34929c = zzenc;
        this.f34930d = context;
        this.f34931e = zzfef;
        this.f34932f = zzemy;
        this.f34933g = zzdvl;
    }

    /* renamed from: a */
    public static /* synthetic */ zzfzp m49507a(zzeue zzeue) {
        String str;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27320z8)).booleanValue()) {
            str = zzeue.f34931e.f35631f.toLowerCase(Locale.ROOT);
        } else {
            str = zzeue.f34931e.f35631f;
        }
        Map a = zzeue.f34929c.mo45384a(zzeue.f34934h, str);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfvq) a).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = zzeue.f34931e.f35629d.f1985D;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str2);
            }
            arrayList.add(zzeue.m49508c(str2, list, bundle, true, true));
        }
        for (Map.Entry value : ((zzfvq) zzeue.f34929c.mo45385b()).entrySet()) {
            zzeng zzeng = (zzeng) value.getValue();
            String str3 = zzeng.f34531a;
            Bundle bundle3 = zzeue.f34931e.f35629d.f1985D;
            arrayList.add(zzeue.m49508c(str3, Collections.singletonList(zzeng.f34534d), bundle3 != null ? bundle3.getBundle(str3) : null, zzeng.f34532b, zzeng.f34533c));
        }
        return zzfzg.m51408c(arrayList).mo46623a(new zzeub(arrayList), zzeue.f34927a);
    }

    /* renamed from: c */
    private final zzfyx m49508c(String str, List list, Bundle bundle, boolean z, boolean z2) {
        zzfyx C = zzfyx.m51389C(zzfzg.m51417l(new zzeuc(this, str, list, bundle, z, z2), this.f34927a));
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27243s1)).booleanValue()) {
            C = (zzfyx) zzfzg.m51420o(C, ((Long) zzay.m1924c().mo42663b(zzbjc.f27173l1)).longValue(), TimeUnit.MILLISECONDS, this.f34928b);
        }
        return (zzfyx) zzfzg.m51411f(C, Throwable.class, new zzeud(str), this.f34927a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzfzp mo45471b(String str, List list, Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbxd zzbxd;
        zzbxd b;
        zzchh zzchh = new zzchh();
        if (z2) {
            this.f34932f.mo45381b(str);
            b = this.f34932f.mo45380a(str);
        } else {
            try {
                b = this.f34933g.mo45016b(str);
            } catch (RemoteException e) {
                zzcgp.m45227e("Couldn't create RTB adapter : ", e);
                zzbxd = null;
            }
        }
        zzbxd = b;
        if (zzbxd == null) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27193n1)).booleanValue()) {
                zzenf.m49200Jb(str, zzchh);
            } else {
                throw null;
            }
        } else {
            zzenf zzenf = new zzenf(str, zzbxd, zzchh);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27243s1)).booleanValue()) {
                this.f34928b.schedule(new zzeua(zzenf), ((Long) zzay.m1924c().mo42663b(zzbjc.f27173l1)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                zzbxd.mo43173T9(ObjectWrapper.m5051g8(this.f34930d), this.f34934h, bundle, (Bundle) list.get(0), this.f34931e.f35630e, zzenf);
            } else {
                zzenf.mo45390d();
            }
        }
        return zzchh;
    }

    public final int zza() {
        return 32;
    }

    public final zzfzp zzb() {
        return zzfzg.m51417l(new zzetz(this), this.f34927a);
    }
}

package com.google.android.gms.measurement.internal;

import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzjo extends zzkh {

    /* renamed from: d */
    private final Map f47180d = new HashMap();

    /* renamed from: e */
    public final zzes f47181e;

    /* renamed from: f */
    public final zzes f47182f;

    /* renamed from: g */
    public final zzes f47183g;

    /* renamed from: h */
    public final zzes f47184h;

    /* renamed from: i */
    public final zzes f47185i;

    zzjo(zzkt zzkt) {
        super(zzkt);
        zzew F = this.f46899a.mo55189F();
        F.getClass();
        this.f47181e = new zzes(F, "last_delete_stale", 0);
        zzew F2 = this.f46899a.mo55189F();
        F2.getClass();
        this.f47182f = new zzes(F2, "backoff", 0);
        zzew F3 = this.f46899a.mo55189F();
        F3.getClass();
        this.f47183g = new zzes(F3, "last_upload", 0);
        zzew F4 = this.f46899a.mo55189F();
        F4.getClass();
        this.f47184h = new zzes(F4, "last_upload_attempt", 0);
        zzew F5 = this.f46899a.mo55189F();
        F5.getClass();
        this.f47185i = new zzes(F5, "midnight_offset", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo54913j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @Deprecated
    /* renamed from: k */
    public final Pair mo55468k(String str) {
        zzjn zzjn;
        mo55073e();
        long c = this.f46899a.mo55201a().mo21952c();
        zzjn zzjn2 = (zzjn) this.f47180d.get(str);
        if (zzjn2 != null && c < zzjn2.f47179c) {
            return new Pair(zzjn2.f47177a, Boolean.valueOf(zzjn2.f47178b));
        }
        AdvertisingIdClient.m1819d(true);
        long p = c + this.f46899a.mo55219x().mo54933p(str, zzdu.f46600c);
        try {
            AdvertisingIdClient.Info a = AdvertisingIdClient.m1817a(this.f46899a.mo55202c());
            if (a == null) {
                return new Pair("", Boolean.FALSE);
            }
            String a2 = a.mo19848a();
            if (a2 != null) {
                zzjn = new zzjn(a2, a.mo19849b(), p);
            } else {
                zzjn = new zzjn("", a.mo19849b(), p);
            }
            this.f47180d.put(str, zzjn);
            AdvertisingIdClient.m1819d(false);
            return new Pair(zzjn.f47177a, Boolean.valueOf(zzjn.f47178b));
        } catch (Exception e) {
            this.f46899a.mo55221z().mo55097o().mo55092b("Unable to get advertising id", e);
            zzjn = new zzjn("", false, p);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: l */
    public final Pair mo55469l(String str, zzai zzai) {
        if (zzai.mo54950i(zzah.AD_STORAGE)) {
            return mo55468k(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @Deprecated
    /* renamed from: m */
    public final String mo55470m(String str, boolean z) {
        mo55073e();
        String str2 = z ? (String) mo55468k(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest r = zzlb.m66132r();
        if (r == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r.digest(str2.getBytes()))});
    }
}

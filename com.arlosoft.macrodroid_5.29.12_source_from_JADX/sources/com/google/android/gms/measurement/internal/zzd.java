package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzd extends zze {

    /* renamed from: b */
    private final Map f46542b = new ArrayMap();

    /* renamed from: c */
    private final Map f46543c = new ArrayMap();

    /* renamed from: d */
    private long f46544d;

    public zzd(zzfr zzfr) {
        super(zzfr);
    }

    /* renamed from: f */
    static /* synthetic */ void m65472f(zzd zzd, String str, long j) {
        zzd.mo55073e();
        Preconditions.m4484g(str);
        if (zzd.f46543c.isEmpty()) {
            zzd.f46544d = j;
        }
        Integer num = (Integer) zzd.f46543c.get(str);
        if (num != null) {
            zzd.f46543c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzd.f46543c.size() >= 100) {
            zzd.f46899a.mo55221z().mo55103u().mo55091a("Too many ads visible");
        } else {
            zzd.f46543c.put(str, 1);
            zzd.f46542b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m65473g(zzd zzd, String str, long j) {
        zzd.mo55073e();
        Preconditions.m4484g(str);
        Integer num = (Integer) zzd.f46543c.get(str);
        if (num != null) {
            zzie q = zzd.f46899a.mo55193K().mo55410q(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzd.f46543c.remove(str);
                Long l = (Long) zzd.f46542b.get(str);
                if (l == null) {
                    zzd.f46899a.mo55221z().mo55098p().mo55091a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    zzd.f46542b.remove(str);
                    zzd.m65476n(str, j - longValue, q);
                }
                if (zzd.f46543c.isEmpty()) {
                    long j2 = zzd.f46544d;
                    if (j2 == 0) {
                        zzd.f46899a.mo55221z().mo55098p().mo55091a("First ad exposure time was never set");
                        return;
                    }
                    zzd.m65475m(j - j2, q);
                    zzd.f46544d = 0;
                    return;
                }
                return;
            }
            zzd.f46543c.put(str, Integer.valueOf(intValue));
            return;
        }
        zzd.f46899a.mo55221z().mo55098p().mo55092b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    @WorkerThread
    /* renamed from: m */
    private final void m65475m(long j, zzie zzie) {
        if (zzie == null) {
            this.f46899a.mo55221z().mo55102t().mo55091a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f46899a.mo55221z().mo55102t().mo55092b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zzlb.m66134w(zzie, bundle, true);
            this.f46899a.mo55191I().mo55375s("am", "_xa", bundle);
        }
    }

    @WorkerThread
    /* renamed from: n */
    private final void m65476n(String str, long j, zzie zzie) {
        if (zzie == null) {
            this.f46899a.mo55221z().mo55102t().mo55091a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f46899a.mo55221z().mo55102t().mo55092b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zzlb.m66134w(zzie, bundle, true);
            this.f46899a.mo55191I().mo55375s("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: o */
    public final void m65477o(long j) {
        for (String put : this.f46542b.keySet()) {
            this.f46542b.put(put, Long.valueOf(j));
        }
        if (!this.f46542b.isEmpty()) {
            this.f46544d = j;
        }
    }

    /* renamed from: j */
    public final void mo55034j(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f46899a.mo55221z().mo55098p().mo55091a("Ad unit id must be a non-empty string");
        } else {
            this.f46899a.mo55185B().mo55181x(new zza(this, str, j));
        }
    }

    /* renamed from: k */
    public final void mo55035k(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f46899a.mo55221z().mo55098p().mo55091a("Ad unit id must be a non-empty string");
        } else {
            this.f46899a.mo55185B().mo55181x(new zzb(this, str, j));
        }
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo55036l(long j) {
        zzie q = this.f46899a.mo55193K().mo55410q(false);
        for (String str : this.f46542b.keySet()) {
            m65476n(str, j - ((Long) this.f46542b.get(str)).longValue(), q);
        }
        if (!this.f46542b.isEmpty()) {
            m65475m(j - this.f46544d, q);
        }
        m65477o(j);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdxt implements zzfii {

    /* renamed from: a */
    private final Map f33340a = new HashMap();

    /* renamed from: c */
    private final zzdxl f33341c;

    /* renamed from: d */
    private final Clock f33342d;

    /* renamed from: f */
    private final Map f33343f = new HashMap();

    public zzdxt(zzdxl zzdxl, Set set, Clock clock) {
        this.f33341c = zzdxl;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdxs zzdxs = (zzdxs) it.next();
            this.f33343f.put(zzdxs.f33339c, zzdxs);
        }
        this.f33342d = clock;
    }

    /* renamed from: d */
    private final void m48331d(zzfib zzfib, boolean z) {
        zzfib b = ((zzdxs) this.f33343f.get(zzfib)).f33338b;
        String str = true != z ? "f." : "s.";
        if (this.f33340a.containsKey(b)) {
            this.f33341c.mo45036a().put("label.".concat(((zzdxs) this.f33343f.get(zzfib)).f33337a), str.concat(String.valueOf(Long.toString(this.f33342d.mo21952c() - ((Long) this.f33340a.get(b)).longValue()))));
        }
    }

    /* renamed from: a */
    public final void mo45028a(zzfib zzfib, String str) {
        this.f33340a.put(zzfib, Long.valueOf(this.f33342d.mo21952c()));
    }

    /* renamed from: b */
    public final void mo45029b(zzfib zzfib, String str) {
    }

    /* renamed from: c */
    public final void mo45030c(zzfib zzfib, String str) {
        if (this.f33340a.containsKey(zzfib)) {
            this.f33341c.mo45036a().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.f33342d.mo21952c() - ((Long) this.f33340a.get(zzfib)).longValue()))));
        }
        if (this.f33343f.containsKey(zzfib)) {
            m48331d(zzfib, true);
        }
    }

    /* renamed from: e */
    public final void mo45031e(zzfib zzfib, String str, Throwable th) {
        if (this.f33340a.containsKey(zzfib)) {
            this.f33341c.mo45036a().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.f33342d.mo21952c() - ((Long) this.f33340a.get(zzfib)).longValue()))));
        }
        if (this.f33343f.containsKey(zzfib)) {
            m48331d(zzfib, false);
        }
    }
}

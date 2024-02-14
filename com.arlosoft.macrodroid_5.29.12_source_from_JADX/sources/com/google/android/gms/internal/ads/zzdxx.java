package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzdxx {

    /* renamed from: a */
    protected final String f33350a = ((String) zzbkm.f27412b.mo42728e());

    /* renamed from: b */
    protected final Map f33351b = new HashMap();

    /* renamed from: c */
    protected final Executor f33352c;

    /* renamed from: d */
    protected final zzcgu f33353d;

    /* renamed from: e */
    protected final boolean f33354e;

    /* renamed from: f */
    private final zzfjb f33355f;

    /* renamed from: g */
    private final boolean f33356g;

    /* renamed from: h */
    private final boolean f33357h;

    protected zzdxx(Executor executor, zzcgu zzcgu, zzfjb zzfjb) {
        this.f33352c = executor;
        this.f33353d = zzcgu;
        this.f33354e = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26918L1)).booleanValue();
        this.f33355f = zzfjb;
        this.f33356g = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f26948O1)).booleanValue();
        this.f33357h = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27108e6)).booleanValue();
    }

    /* renamed from: a */
    private final void m48337a(Map map, boolean z) {
        if (!map.isEmpty()) {
            String a = this.f33355f.mo45792a(map);
            zze.m2645k(a);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (!this.f33354e) {
                return;
            }
            if (z && !this.f33356g) {
                return;
            }
            if (!parseBoolean || this.f33357h) {
                this.f33352c.execute(new zzdxw(this, a));
                return;
            }
            return;
        }
        zzcgp.m45224b("Empty paramMap.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo45053b(Map map) {
        return this.f33355f.mo45792a(map);
    }

    /* renamed from: c */
    public final ConcurrentHashMap mo45054c() {
        return new ConcurrentHashMap(this.f33351b);
    }

    /* renamed from: d */
    public final void mo45055d(Map map) {
        m48337a(map, true);
    }

    /* renamed from: e */
    public final void mo45056e(Map map) {
        m48337a(map, false);
    }
}

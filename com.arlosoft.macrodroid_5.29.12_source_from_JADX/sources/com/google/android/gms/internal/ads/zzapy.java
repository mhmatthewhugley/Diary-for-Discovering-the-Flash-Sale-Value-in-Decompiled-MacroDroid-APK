package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.p023dx.rop.code.RegisterSpec;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzapy implements zzfow {

    /* renamed from: a */
    private final zzfmz f25276a;

    /* renamed from: b */
    private final zzfnq f25277b;

    /* renamed from: c */
    private final zzaql f25278c;

    /* renamed from: d */
    private final zzapx f25279d;

    /* renamed from: e */
    private final zzapi f25280e;

    /* renamed from: f */
    private final zzaqn f25281f;

    zzapy(@NonNull zzfmz zzfmz, @NonNull zzfnq zzfnq, @NonNull zzaql zzaql, @NonNull zzapx zzapx, @Nullable zzapi zzapi, @Nullable zzaqn zzaqn) {
        this.f25276a = zzfmz;
        this.f25277b = zzfnq;
        this.f25278c = zzaql;
        this.f25279d = zzapx;
        this.f25280e = zzapi;
        this.f25281f = zzaqn;
    }

    /* renamed from: c */
    private final Map m42096c() {
        HashMap hashMap = new HashMap();
        zzana b = this.f25277b.mo46012b();
        hashMap.put(RegisterSpec.PREFIX, this.f25276a.mo45990b());
        hashMap.put("gms", Boolean.valueOf(this.f25276a.mo45991c()));
        hashMap.put("int", b.mo41738D0());
        hashMap.put("up", Boolean.valueOf(this.f25279d.mo41795a()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    /* renamed from: a */
    public final Map mo41797a() {
        return m42096c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41798b(View view) {
        this.f25278c.mo41827d(view);
    }

    public final Map zza() {
        Map c = m42096c();
        c.put("lts", Long.valueOf(this.f25278c.mo41825a()));
        return c;
    }

    public final Map zzb() {
        Map c = m42096c();
        zzana a = this.f25277b.mo46011a();
        c.put("gai", Boolean.valueOf(this.f25276a.mo45992d()));
        c.put("did", a.mo41737C0());
        c.put("dst", Integer.valueOf(a.mo41742r0() - 1));
        c.put("doo", Boolean.valueOf(a.mo41739o0()));
        zzapi zzapi = this.f25280e;
        if (zzapi != null) {
            c.put("nt", Long.valueOf(zzapi.mo41782a()));
        }
        zzaqn zzaqn = this.f25281f;
        if (zzaqn != null) {
            c.put("vs", Long.valueOf(zzaqn.mo41841c()));
            c.put("vf", Long.valueOf(this.f25281f.mo41840b()));
        }
        return c;
    }
}

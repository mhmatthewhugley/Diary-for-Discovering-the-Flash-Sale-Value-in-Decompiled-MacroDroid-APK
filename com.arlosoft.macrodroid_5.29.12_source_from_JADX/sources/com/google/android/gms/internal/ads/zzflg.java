package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzflg {

    /* renamed from: c */
    private static final zzflg f36047c = new zzflg();

    /* renamed from: a */
    private final ArrayList f36048a = new ArrayList();

    /* renamed from: b */
    private final ArrayList f36049b = new ArrayList();

    private zzflg() {
    }

    /* renamed from: a */
    public static zzflg m50458a() {
        return f36047c;
    }

    /* renamed from: b */
    public final Collection mo45892b() {
        return Collections.unmodifiableCollection(this.f36049b);
    }

    /* renamed from: c */
    public final Collection mo45893c() {
        return Collections.unmodifiableCollection(this.f36048a);
    }

    /* renamed from: d */
    public final void mo45894d(zzfkv zzfkv) {
        this.f36048a.add(zzfkv);
    }

    /* renamed from: e */
    public final void mo45895e(zzfkv zzfkv) {
        boolean g = mo45897g();
        this.f36048a.remove(zzfkv);
        this.f36049b.remove(zzfkv);
        if (g && !mo45897g()) {
            zzflm.m50485b().mo45925f();
        }
    }

    /* renamed from: f */
    public final void mo45896f(zzfkv zzfkv) {
        boolean g = mo45897g();
        this.f36049b.add(zzfkv);
        if (!g) {
            zzflm.m50485b().mo45924e();
        }
    }

    /* renamed from: g */
    public final boolean mo45897g() {
        return this.f36049b.size() > 0;
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzffp {

    /* renamed from: a */
    private final LinkedList f35696a = new LinkedList();

    /* renamed from: b */
    private final int f35697b;

    /* renamed from: c */
    private final int f35698c;

    /* renamed from: d */
    private final zzfgo f35699d;

    public zzffp(int i, int i2) {
        this.f35697b = i;
        this.f35698c = i2;
        this.f35699d = new zzfgo();
    }

    /* renamed from: i */
    private final void m50095i() {
        while (!this.f35696a.isEmpty() && zzt.m2889b().mo21950a() - ((zzffz) this.f35696a.getFirst()).f35731d >= ((long) this.f35698c)) {
            this.f35699d.mo45723g();
            this.f35696a.remove();
        }
    }

    /* renamed from: a */
    public final int mo45679a() {
        return this.f35699d.mo45717a();
    }

    /* renamed from: b */
    public final int mo45680b() {
        m50095i();
        return this.f35696a.size();
    }

    /* renamed from: c */
    public final long mo45681c() {
        return this.f35699d.mo45718b();
    }

    /* renamed from: d */
    public final long mo45682d() {
        return this.f35699d.mo45719c();
    }

    @Nullable
    /* renamed from: e */
    public final zzffz mo45683e() {
        this.f35699d.mo45722f();
        m50095i();
        if (this.f35696a.isEmpty()) {
            return null;
        }
        zzffz zzffz = (zzffz) this.f35696a.remove();
        if (zzffz != null) {
            this.f35699d.mo45724h();
        }
        return zzffz;
    }

    /* renamed from: f */
    public final zzfgn mo45684f() {
        return this.f35699d.mo45720d();
    }

    /* renamed from: g */
    public final String mo45685g() {
        return this.f35699d.mo45721e();
    }

    /* renamed from: h */
    public final boolean mo45686h(zzffz zzffz) {
        this.f35699d.mo45722f();
        m50095i();
        if (this.f35696a.size() == this.f35697b) {
            return false;
        }
        this.f35696a.add(zzffz);
        return true;
    }
}

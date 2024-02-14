package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import p090f5.C7315j;
import p096g5.C7339a;
import p096g5.C7348c;
import p120k4.C7587c;

/* renamed from: com.bumptech.glide.load.engine.r */
/* compiled from: LockedResource */
final class C6705r<Z> implements C7587c<Z>, C7339a.C7345f {

    /* renamed from: g */
    private static final Pools.Pool<C6705r<?>> f15675g = C7339a.m30345d(20, new C6706a());

    /* renamed from: a */
    private final C7348c f15676a = C7348c.m30358a();

    /* renamed from: c */
    private C7587c<Z> f15677c;

    /* renamed from: d */
    private boolean f15678d;

    /* renamed from: f */
    private boolean f15679f;

    /* renamed from: com.bumptech.glide.load.engine.r$a */
    /* compiled from: LockedResource */
    class C6706a implements C7339a.C7343d<C6705r<?>> {
        C6706a() {
        }

        /* renamed from: a */
        public C6705r<?> create() {
            return new C6705r<>();
        }
    }

    C6705r() {
    }

    /* renamed from: a */
    private void m25398a(C7587c<Z> cVar) {
        this.f15679f = false;
        this.f15678d = true;
        this.f15677c = cVar;
    }

    @NonNull
    /* renamed from: c */
    static <Z> C6705r<Z> m25399c(C7587c<Z> cVar) {
        C6705r<Z> rVar = (C6705r) C7315j.m30204d(f15675g.acquire());
        rVar.m25398a(cVar);
        return rVar;
    }

    /* renamed from: d */
    private void m25400d() {
        this.f15677c = null;
        f15675g.release(this);
    }

    @NonNull
    /* renamed from: b */
    public Class<Z> mo33103b() {
        return this.f15677c.mo33103b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo33117e() {
        this.f15676a.mo37326c();
        if (this.f15678d) {
            this.f15678d = false;
            if (this.f15679f) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @NonNull
    public Z get() {
        return this.f15677c.get();
    }

    public int getSize() {
        return this.f15677c.getSize();
    }

    @NonNull
    /* renamed from: i */
    public C7348c mo24547i() {
        return this.f15676a;
    }

    public synchronized void recycle() {
        this.f15676a.mo37326c();
        this.f15679f = true;
        if (!this.f15678d) {
            this.f15677c.recycle();
            m25400d();
        }
    }
}

package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import p090f5.C7315j;
import p102h4.C7380e;
import p120k4.C7587c;

/* renamed from: com.bumptech.glide.load.engine.o */
/* compiled from: EngineResource */
class C6701o<Z> implements C7587c<Z> {

    /* renamed from: a */
    private final boolean f15662a;

    /* renamed from: c */
    private final boolean f15663c;

    /* renamed from: d */
    private final C7587c<Z> f15664d;

    /* renamed from: f */
    private C6702a f15665f;

    /* renamed from: g */
    private C7380e f15666g;

    /* renamed from: o */
    private int f15667o;

    /* renamed from: p */
    private boolean f15668p;

    /* renamed from: com.bumptech.glide.load.engine.o$a */
    /* compiled from: EngineResource */
    interface C6702a {
        /* renamed from: c */
        void mo33066c(C7380e eVar, C6701o<?> oVar);
    }

    C6701o(C7587c<Z> cVar, boolean z, boolean z2) {
        this.f15664d = (C7587c) C7315j.m30204d(cVar);
        this.f15662a = z;
        this.f15663c = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo33102a() {
        if (!this.f15668p) {
            this.f15667o++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @NonNull
    /* renamed from: b */
    public Class<Z> mo33103b() {
        return this.f15664d.mo33103b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C7587c<Z> mo33104c() {
        return this.f15664d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo33105d() {
        return this.f15662a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo33106e() {
        synchronized (this.f15665f) {
            synchronized (this) {
                int i = this.f15667o;
                if (i > 0) {
                    int i2 = i - 1;
                    this.f15667o = i2;
                    if (i2 == 0) {
                        this.f15665f.mo33066c(this.f15666g, this);
                    }
                } else {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo33107f(C7380e eVar, C6702a aVar) {
        this.f15666g = eVar;
        this.f15665f = aVar;
    }

    @NonNull
    public Z get() {
        return this.f15664d.get();
    }

    public int getSize() {
        return this.f15664d.getSize();
    }

    public synchronized void recycle() {
        if (this.f15667o > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f15668p) {
            this.f15668p = true;
            if (this.f15663c) {
                this.f15664d.recycle();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public synchronized String toString() {
        return "EngineResource{isCacheable=" + this.f15662a + ", listener=" + this.f15665f + ", key=" + this.f15666g + ", acquired=" + this.f15667o + ", isRecycled=" + this.f15668p + ", resource=" + this.f15664d + '}';
    }
}

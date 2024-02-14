package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.C6674h;
import com.bumptech.glide.load.engine.C6701o;
import java.util.Map;
import p063b5.C2254g;
import p083e4.C7273e;
import p083e4.C7275g;
import p090f5.C7311f;
import p090f5.C7315j;
import p096g5.C7339a;
import p102h4.C7380e;
import p102h4.C7384g;
import p102h4.C7387j;
import p120k4.C7580a;
import p120k4.C7587c;
import p132m4.C7910a;
import p132m4.C7913b;
import p132m4.C7923h;
import p137n4.C7977a;

/* renamed from: com.bumptech.glide.load.engine.j */
/* compiled from: Engine */
public class C6685j implements C6698l, C7923h.C7924a, C6701o.C6702a {

    /* renamed from: i */
    private static final boolean f15597i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C6703p f15598a;

    /* renamed from: b */
    private final C6700n f15599b;

    /* renamed from: c */
    private final C7923h f15600c;

    /* renamed from: d */
    private final C6688b f15601d;

    /* renamed from: e */
    private final C6709u f15602e;

    /* renamed from: f */
    private final C6690c f15603f;

    /* renamed from: g */
    private final C6686a f15604g;

    /* renamed from: h */
    private final C6661a f15605h;

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.j$a */
    /* compiled from: Engine */
    static class C6686a {

        /* renamed from: a */
        final C6674h.C6679e f15606a;

        /* renamed from: b */
        final Pools.Pool<C6674h<?>> f15607b = C7339a.m30345d(150, new C6687a());

        /* renamed from: c */
        private int f15608c;

        /* renamed from: com.bumptech.glide.load.engine.j$a$a */
        /* compiled from: Engine */
        class C6687a implements C7339a.C7343d<C6674h<?>> {
            C6687a() {
            }

            /* renamed from: a */
            public C6674h<?> create() {
                C6686a aVar = C6686a.this;
                return new C6674h<>(aVar.f15606a, aVar.f15607b);
            }
        }

        C6686a(C6674h.C6679e eVar) {
            this.f15606a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C6674h<R> mo33070a(C7273e eVar, Object obj, C6699m mVar, C7380e eVar2, int i, int i2, Class<?> cls, Class<R> cls2, C7275g gVar, C7580a aVar, Map<Class<?>, C7387j<?>> map, boolean z, boolean z2, boolean z3, C7384g gVar2, C6674h.C6676b<R> bVar) {
            C6674h hVar = (C6674h) C7315j.m30204d(this.f15607b.acquire());
            int i3 = this.f15608c;
            int i4 = i3;
            this.f15608c = i3 + 1;
            return hVar.mo33047r(eVar, obj, mVar, eVar2, i, i2, cls, cls2, gVar, aVar, map, z, z2, z3, gVar2, bVar, i4);
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.j$b */
    /* compiled from: Engine */
    static class C6688b {

        /* renamed from: a */
        final C7977a f15610a;

        /* renamed from: b */
        final C7977a f15611b;

        /* renamed from: c */
        final C7977a f15612c;

        /* renamed from: d */
        final C7977a f15613d;

        /* renamed from: e */
        final C6698l f15614e;

        /* renamed from: f */
        final Pools.Pool<C6692k<?>> f15615f = C7339a.m30345d(150, new C6689a());

        /* renamed from: com.bumptech.glide.load.engine.j$b$a */
        /* compiled from: Engine */
        class C6689a implements C7339a.C7343d<C6692k<?>> {
            C6689a() {
            }

            /* renamed from: a */
            public C6692k<?> create() {
                C6688b bVar = C6688b.this;
                return new C6692k(bVar.f15610a, bVar.f15611b, bVar.f15612c, bVar.f15613d, bVar.f15614e, bVar.f15615f);
            }
        }

        C6688b(C7977a aVar, C7977a aVar2, C7977a aVar3, C7977a aVar4, C6698l lVar) {
            this.f15610a = aVar;
            this.f15611b = aVar2;
            this.f15612c = aVar3;
            this.f15613d = aVar4;
            this.f15614e = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C6692k<R> mo33072a(C7380e eVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C6692k) C7315j.m30204d(this.f15615f.acquire())).mo33081l(eVar, z, z2, z3, z4);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$c */
    /* compiled from: Engine */
    private static class C6690c implements C6674h.C6679e {

        /* renamed from: a */
        private final C7910a.C7911a f15617a;

        /* renamed from: b */
        private volatile C7910a f15618b;

        C6690c(C7910a.C7911a aVar) {
            this.f15617a = aVar;
        }

        /* renamed from: a */
        public C7910a mo33057a() {
            if (this.f15618b == null) {
                synchronized (this) {
                    if (this.f15618b == null) {
                        this.f15618b = this.f15617a.build();
                    }
                    if (this.f15618b == null) {
                        this.f15618b = new C7913b();
                    }
                }
            }
            return this.f15618b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$d */
    /* compiled from: Engine */
    public class C6691d {

        /* renamed from: a */
        private final C6692k<?> f15619a;

        /* renamed from: b */
        private final C2254g f15620b;

        C6691d(C2254g gVar, C6692k<?> kVar) {
            this.f15620b = gVar;
            this.f15619a = kVar;
        }

        /* renamed from: a */
        public void mo33074a() {
            synchronized (C6685j.this) {
                this.f15619a.mo33085r(this.f15620b);
            }
        }
    }

    public C6685j(C7923h hVar, C7910a.C7911a aVar, C7977a aVar2, C7977a aVar3, C7977a aVar4, C7977a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (C6703p) null, (C6700n) null, (C6661a) null, (C6688b) null, (C6686a) null, (C6709u) null, z);
    }

    /* renamed from: e */
    private C6701o<?> m25340e(C7380e eVar) {
        C7587c<?> d = this.f15600c.mo37816d(eVar);
        if (d == null) {
            return null;
        }
        if (d instanceof C6701o) {
            return (C6701o) d;
        }
        return new C6701o<>(d, true, true);
    }

    @Nullable
    /* renamed from: g */
    private C6701o<?> m25341g(C7380e eVar, boolean z) {
        if (!z) {
            return null;
        }
        C6701o<?> e = this.f15605h.mo32998e(eVar);
        if (e != null) {
            e.mo33102a();
        }
        return e;
    }

    /* renamed from: h */
    private C6701o<?> m25342h(C7380e eVar, boolean z) {
        if (!z) {
            return null;
        }
        C6701o<?> e = m25340e(eVar);
        if (e != null) {
            e.mo33102a();
            this.f15605h.mo32994a(eVar, e);
        }
        return e;
    }

    /* renamed from: i */
    private static void m25343i(String str, long j, C7380e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C7311f.m30187a(j));
        sb.append("ms, key: ");
        sb.append(eVar);
    }

    /* renamed from: a */
    public void mo33064a(@NonNull C7587c<?> cVar) {
        this.f15602e.mo33120a(cVar);
    }

    /* renamed from: b */
    public synchronized void mo33065b(C6692k<?> kVar, C7380e eVar) {
        this.f15598a.mo33114d(eVar, kVar);
    }

    /* renamed from: c */
    public synchronized void mo33066c(C7380e eVar, C6701o<?> oVar) {
        this.f15605h.mo32997d(eVar);
        if (oVar.mo33105d()) {
            this.f15600c.mo37815c(eVar, oVar);
        } else {
            this.f15602e.mo33120a(oVar);
        }
    }

    /* renamed from: d */
    public synchronized void mo33067d(C6692k<?> kVar, C7380e eVar, C6701o<?> oVar) {
        if (oVar != null) {
            oVar.mo33107f(eVar, this);
            if (oVar.mo33105d()) {
                this.f15605h.mo32994a(eVar, oVar);
            }
        }
        this.f15598a.mo33114d(eVar, kVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        return null;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <R> com.bumptech.glide.load.engine.C6685j.C6691d mo33068f(p083e4.C7273e r32, java.lang.Object r33, p102h4.C7380e r34, int r35, int r36, java.lang.Class<?> r37, java.lang.Class<R> r38, p083e4.C7275g r39, p120k4.C7580a r40, java.util.Map<java.lang.Class<?>, p102h4.C7387j<?>> r41, boolean r42, boolean r43, p102h4.C7384g r44, boolean r45, boolean r46, boolean r47, boolean r48, p063b5.C2254g r49, java.util.concurrent.Executor r50) {
        /*
            r31 = this;
            r1 = r31
            r0 = r45
            r8 = r49
            r9 = r50
            monitor-enter(r31)
            boolean r10 = f15597i     // Catch:{ all -> 0x00bd }
            if (r10 == 0) goto L_0x0012
            long r2 = p090f5.C7311f.m30188b()     // Catch:{ all -> 0x00bd }
            goto L_0x0014
        L_0x0012:
            r2 = 0
        L_0x0014:
            r11 = r2
            com.bumptech.glide.load.engine.n r13 = r1.f15599b     // Catch:{ all -> 0x00bd }
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r41
            r19 = r37
            r20 = r38
            r21 = r44
            com.bumptech.glide.load.engine.m r13 = r13.mo33101a(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00bd }
            com.bumptech.glide.load.engine.o r2 = r1.m25341g(r13, r0)     // Catch:{ all -> 0x00bd }
            r3 = 0
            if (r2 == 0) goto L_0x0040
            h4.a r0 = p102h4.C7376a.MEMORY_CACHE     // Catch:{ all -> 0x00bd }
            r8.mo24544a(r2, r0)     // Catch:{ all -> 0x00bd }
            if (r10 == 0) goto L_0x003e
            java.lang.String r0 = "Loaded resource from active resources"
            m25343i(r0, r11, r13)     // Catch:{ all -> 0x00bd }
        L_0x003e:
            monitor-exit(r31)
            return r3
        L_0x0040:
            com.bumptech.glide.load.engine.o r2 = r1.m25342h(r13, r0)     // Catch:{ all -> 0x00bd }
            if (r2 == 0) goto L_0x0054
            h4.a r0 = p102h4.C7376a.MEMORY_CACHE     // Catch:{ all -> 0x00bd }
            r8.mo24544a(r2, r0)     // Catch:{ all -> 0x00bd }
            if (r10 == 0) goto L_0x0052
            java.lang.String r0 = "Loaded resource from cache"
            m25343i(r0, r11, r13)     // Catch:{ all -> 0x00bd }
        L_0x0052:
            monitor-exit(r31)
            return r3
        L_0x0054:
            com.bumptech.glide.load.engine.p r2 = r1.f15598a     // Catch:{ all -> 0x00bd }
            r15 = r48
            com.bumptech.glide.load.engine.k r2 = r2.mo33112a(r13, r15)     // Catch:{ all -> 0x00bd }
            if (r2 == 0) goto L_0x006f
            r2.mo33075d(r8, r9)     // Catch:{ all -> 0x00bd }
            if (r10 == 0) goto L_0x0068
            java.lang.String r0 = "Added to existing load"
            m25343i(r0, r11, r13)     // Catch:{ all -> 0x00bd }
        L_0x0068:
            com.bumptech.glide.load.engine.j$d r0 = new com.bumptech.glide.load.engine.j$d     // Catch:{ all -> 0x00bd }
            r0.<init>(r8, r2)     // Catch:{ all -> 0x00bd }
            monitor-exit(r31)
            return r0
        L_0x006f:
            com.bumptech.glide.load.engine.j$b r2 = r1.f15601d     // Catch:{ all -> 0x00bd }
            r3 = r13
            r4 = r45
            r5 = r46
            r6 = r47
            r7 = r48
            com.bumptech.glide.load.engine.k r0 = r2.mo33072a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00bd }
            com.bumptech.glide.load.engine.j$a r14 = r1.f15604g     // Catch:{ all -> 0x00bd }
            r15 = r32
            r16 = r33
            r17 = r13
            r18 = r34
            r19 = r35
            r20 = r36
            r21 = r37
            r22 = r38
            r23 = r39
            r24 = r40
            r25 = r41
            r26 = r42
            r27 = r43
            r28 = r48
            r29 = r44
            r30 = r0
            com.bumptech.glide.load.engine.h r2 = r14.mo33070a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x00bd }
            com.bumptech.glide.load.engine.p r3 = r1.f15598a     // Catch:{ all -> 0x00bd }
            r3.mo33113c(r13, r0)     // Catch:{ all -> 0x00bd }
            r0.mo33075d(r8, r9)     // Catch:{ all -> 0x00bd }
            r0.mo33086s(r2)     // Catch:{ all -> 0x00bd }
            if (r10 == 0) goto L_0x00b6
            java.lang.String r2 = "Started new load"
            m25343i(r2, r11, r13)     // Catch:{ all -> 0x00bd }
        L_0x00b6:
            com.bumptech.glide.load.engine.j$d r2 = new com.bumptech.glide.load.engine.j$d     // Catch:{ all -> 0x00bd }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x00bd }
            monitor-exit(r31)
            return r2
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r31)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C6685j.mo33068f(e4.e, java.lang.Object, h4.e, int, int, java.lang.Class, java.lang.Class, e4.g, k4.a, java.util.Map, boolean, boolean, h4.g, boolean, boolean, boolean, boolean, b5.g, java.util.concurrent.Executor):com.bumptech.glide.load.engine.j$d");
    }

    /* renamed from: j */
    public void mo33069j(C7587c<?> cVar) {
        if (cVar instanceof C6701o) {
            ((C6701o) cVar).mo33106e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @VisibleForTesting
    C6685j(C7923h hVar, C7910a.C7911a aVar, C7977a aVar2, C7977a aVar3, C7977a aVar4, C7977a aVar5, C6703p pVar, C6700n nVar, C6661a aVar6, C6688b bVar, C6686a aVar7, C6709u uVar, boolean z) {
        this.f15600c = hVar;
        C7910a.C7911a aVar8 = aVar;
        C6690c cVar = new C6690c(aVar);
        this.f15603f = cVar;
        C6661a aVar9 = aVar6 == null ? new C6661a(z) : aVar6;
        this.f15605h = aVar9;
        aVar9.mo32999f(this);
        this.f15599b = nVar == null ? new C6700n() : nVar;
        this.f15598a = pVar == null ? new C6703p() : pVar;
        this.f15601d = bVar == null ? new C6688b(aVar2, aVar3, aVar4, aVar5, this) : bVar;
        this.f15604g = aVar7 == null ? new C6686a(cVar) : aVar7;
        this.f15602e = uVar == null ? new C6709u() : uVar;
        hVar.mo37817e(this);
    }
}

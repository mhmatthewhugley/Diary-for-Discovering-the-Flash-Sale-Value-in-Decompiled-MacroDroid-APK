package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.C6674h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p083e4.C7273e;
import p083e4.C7275g;
import p102h4.C7379d;
import p102h4.C7380e;
import p102h4.C7384g;
import p102h4.C7386i;
import p102h4.C7387j;
import p120k4.C7580a;
import p120k4.C7587c;
import p126l4.C7667b;
import p132m4.C7910a;
import p146p4.C8105n;
import p158r4.C8197b;

/* renamed from: com.bumptech.glide.load.engine.g */
/* compiled from: DecodeHelper */
final class C6673g<Transcode> {

    /* renamed from: a */
    private final List<C8105n.C8106a<?>> f15521a = new ArrayList();

    /* renamed from: b */
    private final List<C7380e> f15522b = new ArrayList();

    /* renamed from: c */
    private C7273e f15523c;

    /* renamed from: d */
    private Object f15524d;

    /* renamed from: e */
    private int f15525e;

    /* renamed from: f */
    private int f15526f;

    /* renamed from: g */
    private Class<?> f15527g;

    /* renamed from: h */
    private C6674h.C6679e f15528h;

    /* renamed from: i */
    private C7384g f15529i;

    /* renamed from: j */
    private Map<Class<?>, C7387j<?>> f15530j;

    /* renamed from: k */
    private Class<Transcode> f15531k;

    /* renamed from: l */
    private boolean f15532l;

    /* renamed from: m */
    private boolean f15533m;

    /* renamed from: n */
    private C7380e f15534n;

    /* renamed from: o */
    private C7275g f15535o;

    /* renamed from: p */
    private C7580a f15536p;

    /* renamed from: q */
    private boolean f15537q;

    /* renamed from: r */
    private boolean f15538r;

    C6673g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33017a() {
        this.f15523c = null;
        this.f15524d = null;
        this.f15534n = null;
        this.f15527g = null;
        this.f15531k = null;
        this.f15529i = null;
        this.f15535o = null;
        this.f15530j = null;
        this.f15536p = null;
        this.f15521a.clear();
        this.f15532l = false;
        this.f15522b.clear();
        this.f15533m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C7667b mo33018b() {
        return this.f15523c.mo37159b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C7380e> mo33019c() {
        if (!this.f15533m) {
            this.f15533m = true;
            this.f15522b.clear();
            List<C8105n.C8106a<?>> g = mo33023g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C8105n.C8106a aVar = g.get(i);
                if (!this.f15522b.contains(aVar.f19707a)) {
                    this.f15522b.add(aVar.f19707a);
                }
                for (int i2 = 0; i2 < aVar.f19708b.size(); i2++) {
                    if (!this.f15522b.contains(aVar.f19708b.get(i2))) {
                        this.f15522b.add(aVar.f19708b.get(i2));
                    }
                }
            }
        }
        return this.f15522b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C7910a mo33020d() {
        return this.f15528h.mo33057a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C7580a mo33021e() {
        return this.f15536p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo33022f() {
        return this.f15526f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<C8105n.C8106a<?>> mo33023g() {
        if (!this.f15532l) {
            this.f15532l = true;
            this.f15521a.clear();
            List i = this.f15523c.mo37165h().mo32966i(this.f15524d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8105n.C8106a b = ((C8105n) i.get(i2)).mo38074b(this.f15524d, this.f15525e, this.f15526f, this.f15529i);
                if (b != null) {
                    this.f15521a.add(b);
                }
            }
        }
        return this.f15521a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <Data> C6704q<Data, ?, Transcode> mo33024h(Class<Data> cls) {
        return this.f15523c.mo37165h().mo32965h(cls, this.f15527g, this.f15531k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Class<?> mo33025i() {
        return this.f15524d.getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<C8105n<File, ?>> mo33026j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f15523c.mo37165h().mo32966i(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C7384g mo33027k() {
        return this.f15529i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C7275g mo33028l() {
        return this.f15535o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Class<?>> mo33029m() {
        return this.f15523c.mo37165h().mo32967j(this.f15524d.getClass(), this.f15527g, this.f15531k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public <Z> C7386i<Z> mo33030n(C7587c<Z> cVar) {
        return this.f15523c.mo37165h().mo32968k(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C7380e mo33031o() {
        return this.f15534n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public <X> C7379d<X> mo33032p(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f15523c.mo37165h().mo32970m(x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Class<?> mo33033q() {
        return this.f15531k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public <Z> C7387j<Z> mo33034r(Class<Z> cls) {
        C7387j<Z> jVar = this.f15530j.get(cls);
        if (jVar == null) {
            Iterator<Map.Entry<Class<?>, C7387j<?>>> it = this.f15530j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    jVar = (C7387j) next.getValue();
                    break;
                }
            }
        }
        if (jVar != null) {
            return jVar;
        }
        if (!this.f15530j.isEmpty() || !this.f15537q) {
            return C8197b.m34012c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo33035s() {
        return this.f15525e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo33036t(Class<?> cls) {
        return mo33024h(cls) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public <R> void mo33037u(C7273e eVar, Object obj, C7380e eVar2, int i, int i2, C7580a aVar, Class<?> cls, Class<R> cls2, C7275g gVar, C7384g gVar2, Map<Class<?>, C7387j<?>> map, boolean z, boolean z2, C6674h.C6679e eVar3) {
        this.f15523c = eVar;
        this.f15524d = obj;
        this.f15534n = eVar2;
        this.f15525e = i;
        this.f15526f = i2;
        this.f15536p = aVar;
        this.f15527g = cls;
        this.f15528h = eVar3;
        this.f15531k = cls2;
        this.f15535o = gVar;
        this.f15529i = gVar2;
        this.f15530j = map;
        this.f15537q = z;
        this.f15538r = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo33038v(C7587c<?> cVar) {
        return this.f15523c.mo37165h().mo32971n(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo33039w() {
        return this.f15538r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo33040x(C7380e eVar) {
        List<C8105n.C8106a<?>> g = mo33023g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f19707a.equals(eVar)) {
                return true;
            }
        }
        return false;
    }
}

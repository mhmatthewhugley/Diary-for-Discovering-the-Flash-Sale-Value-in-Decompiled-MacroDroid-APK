package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.C6671f;
import java.io.File;
import java.util.List;
import p102h4.C7376a;
import p102h4.C7380e;
import p108i4.C7401d;
import p146p4.C8105n;

/* renamed from: com.bumptech.glide.load.engine.s */
/* compiled from: ResourceCacheGenerator */
class C6707s implements C6671f, C7401d.C7402a<Object> {

    /* renamed from: A */
    private C6708t f15680A;

    /* renamed from: a */
    private final C6671f.C6672a f15681a;

    /* renamed from: c */
    private final C6673g<?> f15682c;

    /* renamed from: d */
    private int f15683d;

    /* renamed from: f */
    private int f15684f = -1;

    /* renamed from: g */
    private C7380e f15685g;

    /* renamed from: o */
    private List<C8105n<File, ?>> f15686o;

    /* renamed from: p */
    private int f15687p;

    /* renamed from: s */
    private volatile C8105n.C8106a<?> f15688s;

    /* renamed from: z */
    private File f15689z;

    C6707s(C6673g<?> gVar, C6671f.C6672a aVar) {
        this.f15682c = gVar;
        this.f15681a = aVar;
    }

    /* renamed from: b */
    private boolean m25405b() {
        return this.f15687p < this.f15686o.size();
    }

    /* renamed from: a */
    public boolean mo33005a() {
        List<C7380e> c = this.f15682c.mo33019c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.f15682c.mo33029m();
        if (!m.isEmpty()) {
            while (true) {
                if (this.f15686o == null || !m25405b()) {
                    int i = this.f15684f + 1;
                    this.f15684f = i;
                    if (i >= m.size()) {
                        int i2 = this.f15683d + 1;
                        this.f15683d = i2;
                        if (i2 >= c.size()) {
                            return false;
                        }
                        this.f15684f = 0;
                    }
                    C7380e eVar = c.get(this.f15683d);
                    Class cls = m.get(this.f15684f);
                    C7380e eVar2 = eVar;
                    this.f15680A = new C6708t(this.f15682c.mo33018b(), eVar2, this.f15682c.mo33031o(), this.f15682c.mo33035s(), this.f15682c.mo33022f(), this.f15682c.mo33034r(cls), cls, this.f15682c.mo33027k());
                    File b = this.f15682c.mo33020d().mo37807b(this.f15680A);
                    this.f15689z = b;
                    if (b != null) {
                        this.f15685g = eVar;
                        this.f15686o = this.f15682c.mo33026j(b);
                        this.f15687p = 0;
                    }
                } else {
                    this.f15688s = null;
                    while (!z && m25405b()) {
                        List<C8105n<File, ?>> list = this.f15686o;
                        int i3 = this.f15687p;
                        this.f15687p = i3 + 1;
                        this.f15688s = list.get(i3).mo38074b(this.f15689z, this.f15682c.mo33035s(), this.f15682c.mo33022f(), this.f15682c.mo33027k());
                        if (this.f15688s != null && this.f15682c.mo33036t(this.f15688s.f19709c.mo37430a())) {
                            this.f15688s.f19709c.mo37440f(this.f15682c.mo33028l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f15682c.mo33033q())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f15682c.mo33025i() + " to " + this.f15682c.mo33033q());
        }
    }

    /* renamed from: c */
    public void mo33006c(@NonNull Exception exc) {
        this.f15681a.mo33014b(this.f15680A, exc, this.f15688s.f19709c, C7376a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        C8105n.C8106a<?> aVar = this.f15688s;
        if (aVar != null) {
            aVar.f19709c.cancel();
        }
    }

    /* renamed from: e */
    public void mo33008e(Object obj) {
        this.f15681a.mo33016f(this.f15685g, obj, this.f15688s.f19709c, C7376a.RESOURCE_DISK_CACHE, this.f15680A);
    }
}

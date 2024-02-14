package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.C6671f;
import java.io.File;
import java.util.List;
import p102h4.C7376a;
import p102h4.C7380e;
import p108i4.C7401d;
import p146p4.C8105n;

/* renamed from: com.bumptech.glide.load.engine.c */
/* compiled from: DataCacheGenerator */
class C6668c implements C6671f, C7401d.C7402a<Object> {

    /* renamed from: a */
    private final List<C7380e> f15507a;

    /* renamed from: c */
    private final C6673g<?> f15508c;

    /* renamed from: d */
    private final C6671f.C6672a f15509d;

    /* renamed from: f */
    private int f15510f;

    /* renamed from: g */
    private C7380e f15511g;

    /* renamed from: o */
    private List<C8105n<File, ?>> f15512o;

    /* renamed from: p */
    private int f15513p;

    /* renamed from: s */
    private volatile C8105n.C8106a<?> f15514s;

    /* renamed from: z */
    private File f15515z;

    C6668c(C6673g<?> gVar, C6671f.C6672a aVar) {
        this(gVar.mo33019c(), gVar, aVar);
    }

    /* renamed from: b */
    private boolean m25259b() {
        return this.f15513p < this.f15512o.size();
    }

    /* renamed from: a */
    public boolean mo33005a() {
        while (true) {
            boolean z = false;
            if (this.f15512o == null || !m25259b()) {
                int i = this.f15510f + 1;
                this.f15510f = i;
                if (i >= this.f15507a.size()) {
                    return false;
                }
                C7380e eVar = this.f15507a.get(this.f15510f);
                File b = this.f15508c.mo33020d().mo37807b(new C6669d(eVar, this.f15508c.mo33031o()));
                this.f15515z = b;
                if (b != null) {
                    this.f15511g = eVar;
                    this.f15512o = this.f15508c.mo33026j(b);
                    this.f15513p = 0;
                }
            } else {
                this.f15514s = null;
                while (!z && m25259b()) {
                    List<C8105n<File, ?>> list = this.f15512o;
                    int i2 = this.f15513p;
                    this.f15513p = i2 + 1;
                    this.f15514s = list.get(i2).mo38074b(this.f15515z, this.f15508c.mo33035s(), this.f15508c.mo33022f(), this.f15508c.mo33027k());
                    if (this.f15514s != null && this.f15508c.mo33036t(this.f15514s.f19709c.mo37430a())) {
                        this.f15514s.f19709c.mo37440f(this.f15508c.mo33028l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    /* renamed from: c */
    public void mo33006c(@NonNull Exception exc) {
        this.f15509d.mo33014b(this.f15511g, exc, this.f15514s.f19709c, C7376a.DATA_DISK_CACHE);
    }

    public void cancel() {
        C8105n.C8106a<?> aVar = this.f15514s;
        if (aVar != null) {
            aVar.f19709c.cancel();
        }
    }

    /* renamed from: e */
    public void mo33008e(Object obj) {
        this.f15509d.mo33016f(this.f15511g, obj, this.f15514s.f19709c, C7376a.DATA_DISK_CACHE, this.f15511g);
    }

    C6668c(List<C7380e> list, C6673g<?> gVar, C6671f.C6672a aVar) {
        this.f15510f = -1;
        this.f15507a = list;
        this.f15508c = gVar;
        this.f15509d = aVar;
    }
}

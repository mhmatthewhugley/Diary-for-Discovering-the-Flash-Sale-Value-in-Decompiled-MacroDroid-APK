package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.C6671f;
import java.util.Collections;
import java.util.List;
import p090f5.C7311f;
import p102h4.C7376a;
import p102h4.C7379d;
import p102h4.C7380e;
import p108i4.C7401d;
import p120k4.C7580a;
import p146p4.C8105n;

/* renamed from: com.bumptech.glide.load.engine.v */
/* compiled from: SourceGenerator */
class C6711v implements C6671f, C7401d.C7402a<Object>, C6671f.C6672a {

    /* renamed from: a */
    private final C6673g<?> f15701a;

    /* renamed from: c */
    private final C6671f.C6672a f15702c;

    /* renamed from: d */
    private int f15703d;

    /* renamed from: f */
    private C6668c f15704f;

    /* renamed from: g */
    private Object f15705g;

    /* renamed from: o */
    private volatile C8105n.C8106a<?> f15706o;

    /* renamed from: p */
    private C6669d f15707p;

    C6711v(C6673g<?> gVar, C6671f.C6672a aVar) {
        this.f15701a = gVar;
        this.f15702c = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    private void m25412g(Object obj) {
        long b = C7311f.m30188b();
        try {
            C7379d<X> p = this.f15701a.mo33032p(obj);
            C6670e eVar = new C6670e(p, obj, this.f15701a.mo33027k());
            this.f15707p = new C6669d(this.f15706o.f19707a, this.f15701a.mo33031o());
            this.f15701a.mo33020d().mo37806a(this.f15707p, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(this.f15707p);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(p);
                sb.append(", duration: ");
                sb.append(C7311f.m30187a(b));
            }
            this.f15706o.f19709c.mo37435b();
            this.f15704f = new C6668c(Collections.singletonList(this.f15706o.f19707a), this.f15701a, this);
        } catch (Throwable th) {
            this.f15706o.f19709c.mo37435b();
            throw th;
        }
    }

    /* renamed from: h */
    private boolean m25413h() {
        return this.f15703d < this.f15701a.mo33023g().size();
    }

    /* renamed from: a */
    public boolean mo33005a() {
        Object obj = this.f15705g;
        if (obj != null) {
            this.f15705g = null;
            m25412g(obj);
        }
        C6668c cVar = this.f15704f;
        if (cVar != null && cVar.mo33005a()) {
            return true;
        }
        this.f15704f = null;
        this.f15706o = null;
        boolean z = false;
        while (!z && m25413h()) {
            List<C8105n.C8106a<?>> g = this.f15701a.mo33023g();
            int i = this.f15703d;
            this.f15703d = i + 1;
            this.f15706o = g.get(i);
            if (this.f15706o != null && (this.f15701a.mo33021e().mo37657c(this.f15706o.f19709c.mo37438d()) || this.f15701a.mo33036t(this.f15706o.f19709c.mo37430a()))) {
                this.f15706o.f19709c.mo37440f(this.f15701a.mo33028l(), this);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo33014b(C7380e eVar, Exception exc, C7401d<?> dVar, C7376a aVar) {
        this.f15702c.mo33014b(eVar, exc, dVar, this.f15706o.f19709c.mo37438d());
    }

    /* renamed from: c */
    public void mo33006c(@NonNull Exception exc) {
        this.f15702c.mo33014b(this.f15707p, exc, this.f15706o.f19709c, this.f15706o.f19709c.mo37438d());
    }

    public void cancel() {
        C8105n.C8106a<?> aVar = this.f15706o;
        if (aVar != null) {
            aVar.f19709c.cancel();
        }
    }

    /* renamed from: d */
    public void mo33015d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public void mo33008e(Object obj) {
        C7580a e = this.f15701a.mo33021e();
        if (obj == null || !e.mo37657c(this.f15706o.f19709c.mo37438d())) {
            this.f15702c.mo33016f(this.f15706o.f19707a, obj, this.f15706o.f19709c, this.f15706o.f19709c.mo37438d(), this.f15707p);
            return;
        }
        this.f15705g = obj;
        this.f15702c.mo33015d();
    }

    /* renamed from: f */
    public void mo33016f(C7380e eVar, Object obj, C7401d<?> dVar, C7376a aVar, C7380e eVar2) {
        this.f15702c.mo33016f(eVar, obj, dVar, this.f15706o.f19709c.mo37438d(), eVar);
    }
}

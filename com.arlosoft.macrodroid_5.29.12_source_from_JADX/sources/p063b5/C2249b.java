package p063b5;

import androidx.annotation.Nullable;

/* renamed from: b5.b */
/* compiled from: ErrorRequestCoordinator */
public final class C2249b implements C2251d, C2250c {
    @Nullable

    /* renamed from: a */
    private final C2251d f6911a;

    /* renamed from: c */
    private C2250c f6912c;

    /* renamed from: d */
    private C2250c f6913d;

    public C2249b(@Nullable C2251d dVar) {
        this.f6911a = dVar;
    }

    /* renamed from: l */
    private boolean m9214l(C2250c cVar) {
        return cVar.equals(this.f6912c) || (this.f6912c.mo24532f() && cVar.equals(this.f6913d));
    }

    /* renamed from: m */
    private boolean m9215m() {
        C2251d dVar = this.f6911a;
        return dVar == null || dVar.mo24534h(this);
    }

    /* renamed from: n */
    private boolean m9216n() {
        C2251d dVar = this.f6911a;
        return dVar == null || dVar.mo24527b(this);
    }

    /* renamed from: o */
    private boolean m9217o() {
        C2251d dVar = this.f6911a;
        return dVar == null || dVar.mo24539k(this);
    }

    /* renamed from: p */
    private boolean m9218p() {
        C2251d dVar = this.f6911a;
        return dVar != null && dVar.mo24526a();
    }

    /* renamed from: a */
    public boolean mo24526a() {
        return m9218p() || mo24528c();
    }

    /* renamed from: b */
    public boolean mo24527b(C2250c cVar) {
        return m9216n() && m9214l(cVar);
    }

    /* renamed from: c */
    public boolean mo24528c() {
        return (this.f6912c.mo24532f() ? this.f6913d : this.f6912c).mo24528c();
    }

    public void clear() {
        this.f6912c.clear();
        if (this.f6913d.isRunning()) {
            this.f6913d.clear();
        }
    }

    /* renamed from: d */
    public void mo24530d(C2250c cVar) {
        C2251d dVar = this.f6911a;
        if (dVar != null) {
            dVar.mo24530d(this);
        }
    }

    /* renamed from: e */
    public boolean mo24531e(C2250c cVar) {
        if (!(cVar instanceof C2249b)) {
            return false;
        }
        C2249b bVar = (C2249b) cVar;
        if (!this.f6912c.mo24531e(bVar.f6912c) || !this.f6913d.mo24531e(bVar.f6913d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo24532f() {
        return this.f6912c.mo24532f() && this.f6913d.mo24532f();
    }

    /* renamed from: g */
    public boolean mo24533g() {
        return (this.f6912c.mo24532f() ? this.f6913d : this.f6912c).mo24533g();
    }

    /* renamed from: h */
    public boolean mo24534h(C2250c cVar) {
        return m9215m() && m9214l(cVar);
    }

    /* renamed from: i */
    public void mo24535i(C2250c cVar) {
        if (cVar.equals(this.f6913d)) {
            C2251d dVar = this.f6911a;
            if (dVar != null) {
                dVar.mo24535i(this);
            }
        } else if (!this.f6913d.isRunning()) {
            this.f6913d.mo24538j();
        }
    }

    public boolean isComplete() {
        return (this.f6912c.mo24532f() ? this.f6913d : this.f6912c).isComplete();
    }

    public boolean isRunning() {
        return (this.f6912c.mo24532f() ? this.f6913d : this.f6912c).isRunning();
    }

    /* renamed from: j */
    public void mo24538j() {
        if (!this.f6912c.isRunning()) {
            this.f6912c.mo24538j();
        }
    }

    /* renamed from: k */
    public boolean mo24539k(C2250c cVar) {
        return m9217o() && m9214l(cVar);
    }

    /* renamed from: q */
    public void mo24540q(C2250c cVar, C2250c cVar2) {
        this.f6912c = cVar;
        this.f6913d = cVar2;
    }

    public void recycle() {
        this.f6912c.recycle();
        this.f6913d.recycle();
    }
}

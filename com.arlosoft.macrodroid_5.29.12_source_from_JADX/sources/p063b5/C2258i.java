package p063b5;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: b5.i */
/* compiled from: ThumbnailRequestCoordinator */
public class C2258i implements C2251d, C2250c {
    @Nullable

    /* renamed from: a */
    private final C2251d f6951a;

    /* renamed from: c */
    private C2250c f6952c;

    /* renamed from: d */
    private C2250c f6953d;

    /* renamed from: f */
    private boolean f6954f;

    @VisibleForTesting
    C2258i() {
        this((C2251d) null);
    }

    /* renamed from: l */
    private boolean m9280l() {
        C2251d dVar = this.f6951a;
        return dVar == null || dVar.mo24534h(this);
    }

    /* renamed from: m */
    private boolean m9281m() {
        C2251d dVar = this.f6951a;
        return dVar == null || dVar.mo24527b(this);
    }

    /* renamed from: n */
    private boolean m9282n() {
        C2251d dVar = this.f6951a;
        return dVar == null || dVar.mo24539k(this);
    }

    /* renamed from: o */
    private boolean m9283o() {
        C2251d dVar = this.f6951a;
        return dVar != null && dVar.mo24526a();
    }

    /* renamed from: a */
    public boolean mo24526a() {
        return m9283o() || mo24528c();
    }

    /* renamed from: b */
    public boolean mo24527b(C2250c cVar) {
        return m9281m() && cVar.equals(this.f6952c) && !mo24526a();
    }

    /* renamed from: c */
    public boolean mo24528c() {
        return this.f6952c.mo24528c() || this.f6953d.mo24528c();
    }

    public void clear() {
        this.f6954f = false;
        this.f6953d.clear();
        this.f6952c.clear();
    }

    /* renamed from: d */
    public void mo24530d(C2250c cVar) {
        if (!cVar.equals(this.f6953d)) {
            C2251d dVar = this.f6951a;
            if (dVar != null) {
                dVar.mo24530d(this);
            }
            if (!this.f6953d.isComplete()) {
                this.f6953d.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24531e(p063b5.C2250c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof p063b5.C2258i
            r1 = 0
            if (r0 == 0) goto L_0x0028
            b5.i r4 = (p063b5.C2258i) r4
            b5.c r0 = r3.f6952c
            if (r0 != 0) goto L_0x0010
            b5.c r0 = r4.f6952c
            if (r0 != 0) goto L_0x0028
            goto L_0x0018
        L_0x0010:
            b5.c r2 = r4.f6952c
            boolean r0 = r0.mo24531e(r2)
            if (r0 == 0) goto L_0x0028
        L_0x0018:
            b5.c r0 = r3.f6953d
            b5.c r4 = r4.f6953d
            if (r0 != 0) goto L_0x0021
            if (r4 != 0) goto L_0x0028
            goto L_0x0027
        L_0x0021:
            boolean r4 = r0.mo24531e(r4)
            if (r4 == 0) goto L_0x0028
        L_0x0027:
            r1 = 1
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p063b5.C2258i.mo24531e(b5.c):boolean");
    }

    /* renamed from: f */
    public boolean mo24532f() {
        return this.f6952c.mo24532f();
    }

    /* renamed from: g */
    public boolean mo24533g() {
        return this.f6952c.mo24533g();
    }

    /* renamed from: h */
    public boolean mo24534h(C2250c cVar) {
        return m9280l() && cVar.equals(this.f6952c);
    }

    /* renamed from: i */
    public void mo24535i(C2250c cVar) {
        C2251d dVar;
        if (cVar.equals(this.f6952c) && (dVar = this.f6951a) != null) {
            dVar.mo24535i(this);
        }
    }

    public boolean isComplete() {
        return this.f6952c.isComplete() || this.f6953d.isComplete();
    }

    public boolean isRunning() {
        return this.f6952c.isRunning();
    }

    /* renamed from: j */
    public void mo24538j() {
        this.f6954f = true;
        if (!this.f6952c.isComplete() && !this.f6953d.isRunning()) {
            this.f6953d.mo24538j();
        }
        if (this.f6954f && !this.f6952c.isRunning()) {
            this.f6952c.mo24538j();
        }
    }

    /* renamed from: k */
    public boolean mo24539k(C2250c cVar) {
        return m9282n() && (cVar.equals(this.f6952c) || !this.f6952c.mo24528c());
    }

    /* renamed from: p */
    public void mo24550p(C2250c cVar, C2250c cVar2) {
        this.f6952c = cVar;
        this.f6953d = cVar2;
    }

    public void recycle() {
        this.f6952c.recycle();
        this.f6953d.recycle();
    }

    public C2258i(@Nullable C2251d dVar) {
        this.f6951a = dVar;
    }
}

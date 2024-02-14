package p316l9;

import java.util.ArrayList;
import java.util.List;
import p316l9.C15608g;
import p334n9.C15762b;

/* renamed from: l9.b */
/* compiled from: AbstractExpandableItem */
public abstract class C15603b<VH extends C15762b, S extends C15608g> extends C15604c<VH> implements C15606e<VH, S> {

    /* renamed from: f */
    protected boolean f64868f = false;

    /* renamed from: g */
    protected List<S> f64869g;

    /* renamed from: c */
    public boolean mo74943c() {
        return this.f64868f;
    }

    /* renamed from: e */
    public int mo74944e() {
        return 0;
    }

    /* renamed from: i */
    public void mo74945i(boolean z) {
        this.f64868f = z;
    }

    /* renamed from: n */
    public final List<S> mo74946n() {
        return this.f64869g;
    }

    /* renamed from: w */
    public C15603b mo74947w(S s) {
        if (this.f64869g == null) {
            this.f64869g = new ArrayList();
        }
        this.f64869g.add(s);
        return this;
    }

    /* renamed from: x */
    public final int mo74948x() {
        List<S> list = this.f64869g;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}

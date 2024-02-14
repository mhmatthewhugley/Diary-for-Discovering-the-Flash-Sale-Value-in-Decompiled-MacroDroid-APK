package p316l9;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import p286i9.C12454b;

/* renamed from: l9.c */
/* compiled from: AbstractFlexibleItem */
public abstract class C15604c<VH extends RecyclerView.ViewHolder> implements C15608g<VH> {

    /* renamed from: a */
    protected boolean f64870a = true;

    /* renamed from: b */
    protected boolean f64871b = false;

    /* renamed from: c */
    protected boolean f64872c = true;

    /* renamed from: d */
    protected boolean f64873d = true;

    /* renamed from: e */
    protected boolean f64874e = true;

    /* renamed from: a */
    public boolean mo74949a() {
        return this.f64874e;
    }

    /* renamed from: b */
    public boolean mo74950b() {
        return this.f64873d;
    }

    /* renamed from: d */
    public boolean mo74951d() {
        return this.f64871b;
    }

    /* renamed from: f */
    public void mo74952f(C12454b<C15608g> bVar, VH vh, int i) {
    }

    /* renamed from: h */
    public boolean mo74953h(C15608g gVar) {
        return true;
    }

    public boolean isEnabled() {
        return this.f64870a;
    }

    /* renamed from: l */
    public abstract int mo29471l();

    /* renamed from: m */
    public void mo74955m(C12454b<C15608g> bVar, VH vh, int i) {
    }

    /* renamed from: o */
    public void mo74956o(boolean z) {
        this.f64871b = z;
    }

    /* renamed from: p */
    public void mo74957p(boolean z) {
        this.f64873d = z;
    }

    /* renamed from: r */
    public boolean mo74958r() {
        return this.f64872c;
    }

    /* renamed from: t */
    public int mo74959t() {
        return mo29471l();
    }

    /* renamed from: u */
    public void mo74960u(boolean z) {
        this.f64872c = z;
    }

    /* renamed from: v */
    public void mo74961v(C12454b<C15608g> bVar, VH vh, int i) {
    }
}

package p012b0;

/* renamed from: b0.d */
/* compiled from: ScaleXY */
public class C1400d {

    /* renamed from: a */
    private float f740a;

    /* renamed from: b */
    private float f741b;

    public C1400d(float f, float f2) {
        this.f740a = f;
        this.f741b = f2;
    }

    /* renamed from: a */
    public boolean mo16821a(float f, float f2) {
        return this.f740a == f && this.f741b == f2;
    }

    /* renamed from: b */
    public float mo16822b() {
        return this.f740a;
    }

    /* renamed from: c */
    public float mo16823c() {
        return this.f741b;
    }

    /* renamed from: d */
    public void mo16824d(float f, float f2) {
        this.f740a = f;
        this.f741b = f2;
    }

    public String toString() {
        return mo16822b() + "x" + mo16823c();
    }

    public C1400d() {
        this(1.0f, 1.0f);
    }
}

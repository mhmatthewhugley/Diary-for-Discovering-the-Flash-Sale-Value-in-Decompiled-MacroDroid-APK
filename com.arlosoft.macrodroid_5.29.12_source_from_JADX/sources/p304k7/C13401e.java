package p304k7;

import android.view.animation.Interpolator;

/* renamed from: k7.e */
/* compiled from: Keyframe */
public abstract class C13401e implements Cloneable {

    /* renamed from: a */
    float f61435a;

    /* renamed from: c */
    Class f61436c;

    /* renamed from: d */
    private Interpolator f61437d = null;

    /* renamed from: f */
    boolean f61438f = false;

    /* renamed from: e */
    public static C13401e m85790e(float f) {
        return new C13402a(f);
    }

    /* renamed from: f */
    public static C13401e m85791f(float f, float f2) {
        return new C13402a(f, f2);
    }

    /* renamed from: a */
    public abstract C13401e clone();

    /* renamed from: b */
    public float mo70821b() {
        return this.f61435a;
    }

    /* renamed from: c */
    public Interpolator mo70822c() {
        return this.f61437d;
    }

    /* renamed from: d */
    public abstract Object mo70824d();

    /* renamed from: g */
    public void mo70825g(Interpolator interpolator) {
        this.f61437d = interpolator;
    }

    /* renamed from: k7.e$a */
    /* compiled from: Keyframe */
    static class C13402a extends C13401e {

        /* renamed from: g */
        float f61439g;

        C13402a(float f, float f2) {
            this.f61435a = f;
            this.f61439g = f2;
            this.f61436c = Float.TYPE;
            this.f61438f = true;
        }

        /* renamed from: d */
        public Object mo70824d() {
            return Float.valueOf(this.f61439g);
        }

        /* renamed from: h */
        public C13402a clone() {
            C13402a aVar = new C13402a(mo70821b(), this.f61439g);
            aVar.mo70825g(mo70822c());
            return aVar;
        }

        /* renamed from: k */
        public float mo70827k() {
            return this.f61439g;
        }

        C13402a(float f) {
            this.f61435a = f;
            this.f61436c = Float.TYPE;
        }
    }
}

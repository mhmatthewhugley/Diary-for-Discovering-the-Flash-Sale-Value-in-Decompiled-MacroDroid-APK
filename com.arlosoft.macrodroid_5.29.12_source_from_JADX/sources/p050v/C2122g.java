package p050v;

import p049u.C2105d;
import p049u.C2109h;

/* renamed from: v.g */
/* compiled from: Mask */
public class C2122g {

    /* renamed from: a */
    private final C2123a f6573a;

    /* renamed from: b */
    private final C2109h f6574b;

    /* renamed from: c */
    private final C2105d f6575c;

    /* renamed from: d */
    private final boolean f6576d;

    /* renamed from: v.g$a */
    /* compiled from: Mask */
    public enum C2123a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public C2122g(C2123a aVar, C2109h hVar, C2105d dVar, boolean z) {
        this.f6573a = aVar;
        this.f6574b = hVar;
        this.f6575c = dVar;
        this.f6576d = z;
    }

    /* renamed from: a */
    public C2123a mo24274a() {
        return this.f6573a;
    }

    /* renamed from: b */
    public C2109h mo24275b() {
        return this.f6574b;
    }

    /* renamed from: c */
    public C2105d mo24276c() {
        return this.f6575c;
    }

    /* renamed from: d */
    public boolean mo24277d() {
        return this.f6576d;
    }
}

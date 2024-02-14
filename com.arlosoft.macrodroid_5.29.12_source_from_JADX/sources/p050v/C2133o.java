package p050v;

import com.airbnb.lottie.C1472f;
import p045q.C2049c;
import p045q.C2065q;
import p049u.C2109h;
import p051w.C2140a;

/* renamed from: v.o */
/* compiled from: ShapePath */
public class C2133o implements C2117b {

    /* renamed from: a */
    private final String f6626a;

    /* renamed from: b */
    private final int f6627b;

    /* renamed from: c */
    private final C2109h f6628c;

    /* renamed from: d */
    private final boolean f6629d;

    public C2133o(String str, int i, C2109h hVar, boolean z) {
        this.f6626a = str;
        this.f6627b = i;
        this.f6628c = hVar;
        this.f6629d = z;
    }

    /* renamed from: a */
    public C2049c mo24233a(C1472f fVar, C2140a aVar) {
        return new C2065q(fVar, aVar, this);
    }

    /* renamed from: b */
    public String mo24318b() {
        return this.f6626a;
    }

    /* renamed from: c */
    public C2109h mo24319c() {
        return this.f6628c;
    }

    /* renamed from: d */
    public boolean mo24320d() {
        return this.f6629d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f6626a + ", index=" + this.f6627b + '}';
    }
}

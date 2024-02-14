package p054y;

import com.airbnb.lottie.C1463d;
import java.io.IOException;
import java.util.List;
import p001a0.C0010h;
import p012b0.C1397a;
import p049u.C2102a;
import p049u.C2103b;
import p049u.C2104c;
import p049u.C2105d;
import p049u.C2107f;
import p049u.C2108g;
import p049u.C2109h;
import p049u.C2111j;
import p055z.C2205c;

/* renamed from: y.d */
/* compiled from: AnimatableValueParser */
public class C2171d {
    /* renamed from: a */
    private static <T> List<C1397a<T>> m8961a(C2205c cVar, float f, C1463d dVar, C2184j0<T> j0Var) throws IOException {
        return C2193r.m9013a(cVar, dVar, f, j0Var, false);
    }

    /* renamed from: b */
    private static <T> List<C1397a<T>> m8962b(C2205c cVar, C1463d dVar, C2184j0<T> j0Var) throws IOException {
        return C2193r.m9013a(cVar, dVar, 1.0f, j0Var, false);
    }

    /* renamed from: c */
    static C2102a m8963c(C2205c cVar, C1463d dVar) throws IOException {
        return new C2102a(m8962b(cVar, dVar, C2175f.f6784a));
    }

    /* renamed from: d */
    static C2111j m8964d(C2205c cVar, C1463d dVar) throws IOException {
        return new C2111j(m8962b(cVar, dVar, C2179h.f6788a));
    }

    /* renamed from: e */
    public static C2103b m8965e(C2205c cVar, C1463d dVar) throws IOException {
        return m8966f(cVar, dVar, true);
    }

    /* renamed from: f */
    public static C2103b m8966f(C2205c cVar, C1463d dVar, boolean z) throws IOException {
        return new C2103b(m8961a(cVar, z ? C0010h.m75e() : 1.0f, dVar, C2181i.f6792a));
    }

    /* renamed from: g */
    static C2104c m8967g(C2205c cVar, C1463d dVar, int i) throws IOException {
        return new C2104c(m8962b(cVar, dVar, new C2186l(i)));
    }

    /* renamed from: h */
    static C2105d m8968h(C2205c cVar, C1463d dVar) throws IOException {
        return new C2105d(m8962b(cVar, dVar, C2189o.f6803a));
    }

    /* renamed from: i */
    static C2107f m8969i(C2205c cVar, C1463d dVar) throws IOException {
        return new C2107f(C2193r.m9013a(cVar, dVar, C0010h.m75e(), C2201y.f6821a, true));
    }

    /* renamed from: j */
    static C2108g m8970j(C2205c cVar, C1463d dVar) throws IOException {
        return new C2108g(m8962b(cVar, dVar, C2170c0.f6779a));
    }

    /* renamed from: k */
    static C2109h m8971k(C2205c cVar, C1463d dVar) throws IOException {
        return new C2109h(m8961a(cVar, C0010h.m75e(), dVar, C2172d0.f6780a));
    }
}

package retrofit2;

import java.util.Objects;
import okhttp3.C15915d0;
import okhttp3.C15919e0;

/* renamed from: retrofit2.s */
/* compiled from: Response */
public final class C17300s<T> {

    /* renamed from: a */
    private final C15915d0 f68951a;

    /* renamed from: b */
    private final T f68952b;

    /* renamed from: c */
    private final C15919e0 f68953c;

    private C17300s(C15915d0 d0Var, T t, C15919e0 e0Var) {
        this.f68951a = d0Var;
        this.f68952b = t;
        this.f68953c = e0Var;
    }

    /* renamed from: c */
    public static <T> C17300s<T> m100972c(C15919e0 e0Var, C15915d0 d0Var) {
        Objects.requireNonNull(e0Var, "body == null");
        Objects.requireNonNull(d0Var, "rawResponse == null");
        if (!d0Var.mo75965J0()) {
            return new C17300s<>(d0Var, (Object) null, e0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: g */
    public static <T> C17300s<T> m100973g(T t, C15915d0 d0Var) {
        Objects.requireNonNull(d0Var, "rawResponse == null");
        if (d0Var.mo75965J0()) {
            return new C17300s<>(d0Var, t, (C15919e0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public T mo80592a() {
        return this.f68952b;
    }

    /* renamed from: b */
    public int mo80593b() {
        return this.f68951a.mo75971g();
    }

    /* renamed from: d */
    public C15919e0 mo80594d() {
        return this.f68953c;
    }

    /* renamed from: e */
    public boolean mo80595e() {
        return this.f68951a.mo75965J0();
    }

    /* renamed from: f */
    public String mo80596f() {
        return this.f68951a.mo75977r();
    }

    public String toString() {
        return this.f68951a.toString();
    }
}

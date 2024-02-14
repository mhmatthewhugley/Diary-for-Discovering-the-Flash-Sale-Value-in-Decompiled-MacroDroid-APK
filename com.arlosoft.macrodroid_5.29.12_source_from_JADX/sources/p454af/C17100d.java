package p454af;

import java.util.Objects;
import retrofit2.C17300s;

/* renamed from: af.d */
/* compiled from: Result */
public final class C17100d<T> {

    /* renamed from: a */
    private final C17300s<T> f68666a;

    /* renamed from: b */
    private final Throwable f68667b;

    private C17100d(C17300s<T> sVar, Throwable th) {
        this.f68666a = sVar;
        this.f68667b = th;
    }

    /* renamed from: a */
    public static <T> C17100d<T> m100571a(Throwable th) {
        Objects.requireNonNull(th, "error == null");
        return new C17100d<>((C17300s) null, th);
    }

    /* renamed from: b */
    public static <T> C17100d<T> m100572b(C17300s<T> sVar) {
        Objects.requireNonNull(sVar, "response == null");
        return new C17100d<>(sVar, (Throwable) null);
    }
}

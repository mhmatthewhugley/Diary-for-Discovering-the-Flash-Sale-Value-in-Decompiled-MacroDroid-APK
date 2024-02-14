package p102h4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import p090f5.C7315j;

/* renamed from: h4.f */
/* compiled from: Option */
public final class C7381f<T> {

    /* renamed from: e */
    private static final C7383b<Object> f18045e = new C7382a();

    /* renamed from: a */
    private final T f18046a;

    /* renamed from: b */
    private final C7383b<T> f18047b;

    /* renamed from: c */
    private final String f18048c;

    /* renamed from: d */
    private volatile byte[] f18049d;

    /* renamed from: h4.f$a */
    /* compiled from: Option */
    class C7382a implements C7383b<Object> {
        C7382a() {
        }

        /* renamed from: a */
        public void mo37378a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    /* renamed from: h4.f$b */
    /* compiled from: Option */
    public interface C7383b<T> {
        /* renamed from: a */
        void mo37378a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    private C7381f(@NonNull String str, @Nullable T t, @NonNull C7383b<T> bVar) {
        this.f18048c = C7315j.m30202b(str);
        this.f18046a = t;
        this.f18047b = (C7383b) C7315j.m30204d(bVar);
    }

    @NonNull
    /* renamed from: a */
    public static <T> C7381f<T> m30481a(@NonNull String str, @Nullable T t, @NonNull C7383b<T> bVar) {
        return new C7381f<>(str, t, bVar);
    }

    @NonNull
    /* renamed from: b */
    private static <T> C7383b<T> m30482b() {
        return f18045e;
    }

    @NonNull
    /* renamed from: d */
    private byte[] m30483d() {
        if (this.f18049d == null) {
            this.f18049d = this.f18048c.getBytes(C7380e.f18044a);
        }
        return this.f18049d;
    }

    @NonNull
    /* renamed from: e */
    public static <T> C7381f<T> m30484e(@NonNull String str) {
        return new C7381f<>(str, (Object) null, m30482b());
    }

    @NonNull
    /* renamed from: f */
    public static <T> C7381f<T> m30485f(@NonNull String str, @NonNull T t) {
        return new C7381f<>(str, t, m30482b());
    }

    @Nullable
    /* renamed from: c */
    public T mo37373c() {
        return this.f18046a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7381f) {
            return this.f18048c.equals(((C7381f) obj).f18048c);
        }
        return false;
    }

    /* renamed from: g */
    public void mo37375g(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.f18047b.mo37378a(m30483d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f18048c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f18048c + '\'' + '}';
    }
}

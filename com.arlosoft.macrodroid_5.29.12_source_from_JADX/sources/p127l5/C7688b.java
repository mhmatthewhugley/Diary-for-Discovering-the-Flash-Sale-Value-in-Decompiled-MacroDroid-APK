package p127l5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: l5.b */
/* compiled from: Resource */
public final class C7688b<T> {

    /* renamed from: a */
    private final C7689c f18624a;

    /* renamed from: b */
    private final T f18625b;

    /* renamed from: c */
    private final Exception f18626c;

    /* renamed from: d */
    private boolean f18627d;

    private C7688b(C7689c cVar, T t, Exception exc) {
        this.f18624a = cVar;
        this.f18625b = t;
        this.f18626c = exc;
    }

    @NonNull
    /* renamed from: a */
    public static <T> C7688b<T> m32058a(@NonNull Exception exc) {
        return new C7688b<>(C7689c.FAILURE, (Object) null, exc);
    }

    @NonNull
    /* renamed from: b */
    public static <T> C7688b<T> m32059b() {
        return new C7688b<>(C7689c.LOADING, (Object) null, (Exception) null);
    }

    @NonNull
    /* renamed from: c */
    public static <T> C7688b<T> m32060c(@NonNull T t) {
        return new C7688b<>(C7689c.SUCCESS, t, (Exception) null);
    }

    @Nullable
    /* renamed from: d */
    public final Exception mo37732d() {
        this.f18627d = true;
        return this.f18626c;
    }

    @NonNull
    /* renamed from: e */
    public C7689c mo37733e() {
        return this.f18624a;
    }

    public boolean equals(Object obj) {
        T t;
        if (this == obj) {
            return true;
        }
        if (obj == null || C7688b.class != obj.getClass()) {
            return false;
        }
        C7688b bVar = (C7688b) obj;
        if (this.f18624a == bVar.f18624a && ((t = this.f18625b) != null ? t.equals(bVar.f18625b) : bVar.f18625b == null)) {
            Exception exc = this.f18626c;
            Exception exc2 = bVar.f18626c;
            if (exc == null) {
                if (exc2 == null) {
                    return true;
                }
            } else if (exc.equals(exc2)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public T mo37735f() {
        this.f18627d = true;
        return this.f18625b;
    }

    /* renamed from: g */
    public boolean mo37736g() {
        return this.f18627d;
    }

    public int hashCode() {
        int hashCode = this.f18624a.hashCode() * 31;
        T t = this.f18625b;
        int i = 0;
        int hashCode2 = (hashCode + (t == null ? 0 : t.hashCode())) * 31;
        Exception exc = this.f18626c;
        if (exc != null) {
            i = exc.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "Resource{mState=" + this.f18624a + ", mValue=" + this.f18625b + ", mException=" + this.f18626c + '}';
    }
}

package p102h4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.security.MessageDigest;
import p090f5.C7305b;

/* renamed from: h4.g */
/* compiled from: Options */
public final class C7384g implements C7380e {

    /* renamed from: b */
    private final ArrayMap<C7381f<?>, Object> f18050b = new C7305b();

    /* renamed from: f */
    private static <T> void m30490f(@NonNull C7381f<T> fVar, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        fVar.mo37375g(obj, messageDigest);
    }

    /* renamed from: b */
    public void mo33009b(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.f18050b.size(); i++) {
            m30490f(this.f18050b.keyAt(i), this.f18050b.valueAt(i), messageDigest);
        }
    }

    @Nullable
    /* renamed from: c */
    public <T> T mo37379c(@NonNull C7381f<T> fVar) {
        return this.f18050b.containsKey(fVar) ? this.f18050b.get(fVar) : fVar.mo37373c();
    }

    /* renamed from: d */
    public void mo37380d(@NonNull C7384g gVar) {
        this.f18050b.putAll(gVar.f18050b);
    }

    @NonNull
    /* renamed from: e */
    public <T> C7384g mo37381e(@NonNull C7381f<T> fVar, @NonNull T t) {
        this.f18050b.put(fVar, t);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7384g) {
            return this.f18050b.equals(((C7384g) obj).f18050b);
        }
        return false;
    }

    public int hashCode() {
        return this.f18050b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f18050b + '}';
    }
}

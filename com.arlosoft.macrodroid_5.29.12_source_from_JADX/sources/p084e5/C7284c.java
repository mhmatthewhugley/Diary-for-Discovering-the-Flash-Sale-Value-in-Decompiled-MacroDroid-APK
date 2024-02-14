package p084e5;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p090f5.C7315j;
import p102h4.C7380e;

/* renamed from: e5.c */
/* compiled from: ObjectKey */
public final class C7284c implements C7380e {

    /* renamed from: b */
    private final Object f17794b;

    public C7284c(@NonNull Object obj) {
        this.f17794b = C7315j.m30204d(obj);
    }

    /* renamed from: b */
    public void mo33009b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f17794b.toString().getBytes(C7380e.f18044a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7284c) {
            return this.f17794b.equals(((C7284c) obj).f17794b);
        }
        return false;
    }

    public int hashCode() {
        return this.f17794b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f17794b + '}';
    }
}

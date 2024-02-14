package p090f5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: f5.i */
/* compiled from: MultiClassKey */
public class C7314i {

    /* renamed from: a */
    private Class<?> f17893a;

    /* renamed from: b */
    private Class<?> f17894b;

    /* renamed from: c */
    private Class<?> f17895c;

    public C7314i() {
    }

    /* renamed from: a */
    public void mo37267a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f17893a = cls;
        this.f17894b = cls2;
        this.f17895c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7314i iVar = (C7314i) obj;
        return this.f17893a.equals(iVar.f17893a) && this.f17894b.equals(iVar.f17894b) && C7316k.m30208c(this.f17895c, iVar.f17895c);
    }

    public int hashCode() {
        int hashCode = ((this.f17893a.hashCode() * 31) + this.f17894b.hashCode()) * 31;
        Class<?> cls = this.f17895c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f17893a + ", second=" + this.f17894b + '}';
    }

    public C7314i(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        mo37267a(cls, cls2, cls3);
    }
}

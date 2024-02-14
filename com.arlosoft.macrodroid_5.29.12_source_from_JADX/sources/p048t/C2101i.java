package p048t;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: t.i */
/* compiled from: MutablePair */
public class C2101i<T> {
    @Nullable

    /* renamed from: a */
    T f6521a;
    @Nullable

    /* renamed from: b */
    T f6522b;

    /* renamed from: a */
    private static boolean m8669a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void mo24224b(T t, T t2) {
        this.f6521a = t;
        this.f6522b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!m8669a(pair.first, this.f6521a) || !m8669a(pair.second, this.f6522b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.f6521a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f6522b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f6521a) + " " + String.valueOf(this.f6522b) + "}";
    }
}

package p380rb;

import kotlin.jvm.internal.C13706o;

/* renamed from: rb.a */
/* compiled from: DeprecationInfo.kt */
public abstract class C16375a implements Comparable<C16375a> {
    /* renamed from: b */
    public int compareTo(C16375a aVar) {
        C13706o.m87929f(aVar, "other");
        int compareTo = mo72757d().compareTo(aVar.mo72757d());
        if (compareTo != 0 || mo79061e() || !aVar.mo79061e()) {
            return compareTo;
        }
        return 1;
    }

    /* renamed from: d */
    public abstract C16376b mo72757d();

    /* renamed from: e */
    public abstract boolean mo79061e();
}

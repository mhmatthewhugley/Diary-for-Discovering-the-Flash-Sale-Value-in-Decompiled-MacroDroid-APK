package p227ce;

import java.io.Serializable;
import p245de.C12019e;
import p400td.C16622a;

/* renamed from: ce.c */
/* compiled from: Equals */
public class C11218c implements C16622a<Object>, C11217b, Serializable {
    private final Object wanted;

    public C11218c(Object obj) {
        this.wanted = obj;
    }

    /* renamed from: b */
    private String m75270b(Object obj) {
        return C12019e.m82470b(obj);
    }

    /* renamed from: a */
    public String mo62571a() {
        return "(" + this.wanted.getClass().getSimpleName() + ") " + m75270b(this.wanted);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo62572c() {
        return this.wanted;
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C11218c cVar = (C11218c) obj;
        Object obj2 = this.wanted;
        if ((obj2 != null || cVar.wanted != null) && (obj2 == null || !obj2.equals(cVar.wanted))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return m75270b(this.wanted);
    }
}

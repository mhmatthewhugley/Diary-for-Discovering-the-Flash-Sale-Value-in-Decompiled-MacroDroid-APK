package p292io.reactivex.internal.util;

import p216ba.C11116g;
import p329me.C15738c;
import p414v9.C16741n;

/* renamed from: io.reactivex.internal.util.a */
/* compiled from: AppendOnlyLinkedArrayList */
public class C13214a<T> {

    /* renamed from: a */
    final int f61105a;

    /* renamed from: b */
    final Object[] f61106b;

    /* renamed from: c */
    Object[] f61107c;

    /* renamed from: d */
    int f61108d;

    /* renamed from: io.reactivex.internal.util.a$a */
    /* compiled from: AppendOnlyLinkedArrayList */
    public interface C13215a<T> extends C11116g<T> {
        boolean test(T t);
    }

    public C13214a(int i) {
        this.f61105a = i;
        Object[] objArr = new Object[(i + 1)];
        this.f61106b = objArr;
        this.f61107c = objArr;
    }

    /* renamed from: a */
    public <U> boolean mo70039a(C15738c<? super U> cVar) {
        Object[] objArr = this.f61106b;
        int i = this.f61105a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C13224i.m85555d(objArr2, cVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: b */
    public <U> boolean mo70040b(C16741n<? super U> nVar) {
        Object[] objArr = this.f61106b;
        int i = this.f61105a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C13224i.m85556e(objArr2, nVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70041c(T r4) {
        /*
            r3 = this;
            int r0 = r3.f61105a
            int r1 = r3.f61108d
            if (r1 != r0) goto L_0x0011
            int r1 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r3.f61107c
            r2[r0] = r1
            r3.f61107c = r1
            r1 = 0
        L_0x0011:
            java.lang.Object[] r0 = r3.f61107c
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f61108d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p292io.reactivex.internal.util.C13214a.mo70041c(java.lang.Object):void");
    }

    /* renamed from: d */
    public void mo70042d(C13215a<? super T> aVar) {
        int i = this.f61105a;
        for (Object[] objArr = this.f61106b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.test(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public void mo70043e(T t) {
        this.f61106b[0] = t;
    }
}

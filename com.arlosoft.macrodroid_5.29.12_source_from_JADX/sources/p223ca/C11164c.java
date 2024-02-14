package p223ca;

import p251ea.C12180d;
import p414v9.C16729c;
import p414v9.C16741n;
import p414v9.C16748q;

/* renamed from: ca.c */
/* compiled from: EmptyDisposable */
public enum C11164c implements C12180d<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: b */
    public static void m74933b(C16729c cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    /* renamed from: e */
    public static void m74934e(C16741n<?> nVar) {
        nVar.onSubscribe(INSTANCE);
        nVar.onComplete();
    }

    /* renamed from: f */
    public static void m74935f(Throwable th, C16729c cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    /* renamed from: g */
    public static void m74936g(Throwable th, C16741n<?> nVar) {
        nVar.onSubscribe(INSTANCE);
        nVar.onError(th);
    }

    /* renamed from: i */
    public static void m74937i(Throwable th, C16748q<?> qVar) {
        qVar.onSubscribe(INSTANCE);
        qVar.onError(th);
    }

    public void clear() {
    }

    /* renamed from: d */
    public int mo62364d(int i) {
        return i & 2;
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() throws Exception {
        return null;
    }
}

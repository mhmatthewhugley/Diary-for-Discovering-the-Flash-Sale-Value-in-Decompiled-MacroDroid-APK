package p292io.reactivex.internal.subscriptions;

import p251ea.C12182f;
import p329me.C15738c;

/* renamed from: io.reactivex.internal.subscriptions.c */
/* compiled from: EmptySubscription */
public enum C13210c implements C12182f<Object> {
    INSTANCE;

    /* renamed from: b */
    public static void m85515b(C15738c<?> cVar) {
        cVar.mo68760a(INSTANCE);
        cVar.onComplete();
    }

    /* renamed from: e */
    public static void m85516e(Throwable th, C15738c<?> cVar) {
        cVar.mo68760a(INSTANCE);
        cVar.onError(th);
    }

    public void cancel() {
    }

    public void clear() {
    }

    /* renamed from: d */
    public int mo62364d(int i) {
        return i & 2;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() {
        return null;
    }

    public void request(long j) {
        C13213f.m85529j(j);
    }

    public String toString() {
        return "EmptySubscription";
    }
}

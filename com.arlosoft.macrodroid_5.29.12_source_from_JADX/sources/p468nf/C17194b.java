package p468nf;

import p463if.C17175a;

/* renamed from: nf.b */
/* compiled from: RxJavaErrorHandler */
public abstract class C17194b {
    @Deprecated
    /* renamed from: a */
    public void mo80482a(Throwable th) {
    }

    /* renamed from: b */
    public final String mo80483b(Object obj) {
        try {
            return mo80484c(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName() + ".errorRendering";
        } catch (Throwable th) {
            C17175a.m100684d(th);
            return obj.getClass().getName() + ".errorRendering";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo80484c(Object obj) throws InterruptedException {
        return null;
    }
}

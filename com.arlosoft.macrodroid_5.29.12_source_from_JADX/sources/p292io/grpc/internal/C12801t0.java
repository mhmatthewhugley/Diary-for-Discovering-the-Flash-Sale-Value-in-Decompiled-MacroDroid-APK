package p292io.grpc.internal;

import java.util.HashSet;

/* renamed from: io.grpc.internal.t0 */
/* compiled from: InUseStateAggregator */
public abstract class C12801t0<T> {

    /* renamed from: a */
    private final HashSet<T> f60192a = new HashSet<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo69302a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo69303b();

    /* renamed from: c */
    public final boolean mo69556c() {
        return !this.f60192a.isEmpty();
    }

    /* renamed from: d */
    public final void mo69557d(T t, boolean z) {
        int size = this.f60192a.size();
        if (z) {
            this.f60192a.add(t);
            if (size == 0) {
                mo69302a();
            }
        } else if (this.f60192a.remove(t) && size == 1) {
            mo69303b();
        }
    }
}

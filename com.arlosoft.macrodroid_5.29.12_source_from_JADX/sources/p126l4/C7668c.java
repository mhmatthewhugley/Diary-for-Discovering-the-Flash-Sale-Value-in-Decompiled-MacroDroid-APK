package p126l4;

import java.util.Queue;
import p090f5.C7316k;
import p126l4.C7682l;

/* renamed from: l4.c */
/* compiled from: BaseKeyPool */
abstract class C7668c<T extends C7682l> {

    /* renamed from: a */
    private final Queue<T> f18581a = C7316k.m30210e(20);

    C7668c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo37687a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public T mo37688b() {
        T t = (C7682l) this.f18581a.poll();
        return t == null ? mo37687a() : t;
    }

    /* renamed from: c */
    public void mo37689c(T t) {
        if (this.f18581a.size() < 20) {
            this.f18581a.offer(t);
        }
    }
}

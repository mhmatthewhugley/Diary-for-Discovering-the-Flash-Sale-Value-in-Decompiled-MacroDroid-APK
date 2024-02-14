package p292io.grpc.internal;

import p292io.grpc.internal.C12617c2;

/* renamed from: io.grpc.internal.d2 */
/* compiled from: SharedResourcePool */
public final class C12664d2<T> implements C12733l1<T> {

    /* renamed from: a */
    private final C12617c2.C12621d<T> f59844a;

    private C12664d2(C12617c2.C12621d<T> dVar) {
        this.f59844a = dVar;
    }

    /* renamed from: c */
    public static <T> C12664d2<T> m84108c(C12617c2.C12621d<T> dVar) {
        return new C12664d2<>(dVar);
    }

    /* renamed from: a */
    public T mo69356a() {
        return C12617c2.m83941d(this.f59844a);
    }

    /* renamed from: b */
    public T mo69357b(Object obj) {
        C12617c2.m83942f(this.f59844a, obj);
        return null;
    }
}

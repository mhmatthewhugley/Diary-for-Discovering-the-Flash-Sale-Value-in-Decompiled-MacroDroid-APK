package p012b0;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p046r.C2068a;

/* renamed from: b0.c */
/* compiled from: LottieValueCallback */
public class C1399c<T> {

    /* renamed from: a */
    private final C1398b<T> f737a;
    @Nullable

    /* renamed from: b */
    private C2068a<?, ?> f738b;
    @Nullable

    /* renamed from: c */
    protected T f739c;

    public C1399c() {
        this.f737a = new C1398b<>();
        this.f739c = null;
    }

    @Nullable
    /* renamed from: a */
    public T mo16818a(C1398b<T> bVar) {
        return this.f739c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: b */
    public final T mo16819b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return mo16818a(this.f737a.mo16817a(f, f2, t, t2, f3, f4, f5));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public final void mo16820c(@Nullable C2068a<?, ?> aVar) {
        this.f738b = aVar;
    }

    public C1399c(@Nullable T t) {
        this.f737a = new C1398b<>();
        this.f739c = t;
    }
}

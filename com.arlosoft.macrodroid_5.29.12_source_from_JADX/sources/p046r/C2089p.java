package p046r;

import androidx.annotation.Nullable;
import java.util.Collections;
import p012b0.C1397a;
import p012b0.C1398b;
import p012b0.C1399c;

/* renamed from: r.p */
/* compiled from: ValueCallbackKeyframeAnimation */
public class C2089p<K, A> extends C2068a<K, A> {

    /* renamed from: i */
    private final C1398b<A> f6472i;

    /* renamed from: j */
    private final A f6473j;

    public C2089p(C1399c<A> cVar) {
        this(cVar, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo24144c() {
        return 1.0f;
    }

    /* renamed from: h */
    public A mo24148h() {
        C1399c<A> cVar = this.f6428e;
        A a = this.f6473j;
        return cVar.mo16819b(0.0f, 0.0f, a, a, mo24147f(), mo24147f(), mo24147f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public A mo24149i(C1397a<K> aVar, float f) {
        return mo24148h();
    }

    /* renamed from: k */
    public void mo24151k() {
        if (this.f6428e != null) {
            super.mo24151k();
        }
    }

    /* renamed from: m */
    public void mo24153m(float f) {
        this.f6427d = f;
    }

    public C2089p(C1399c<A> cVar, @Nullable A a) {
        super(Collections.emptyList());
        this.f6472i = new C1398b<>();
        mo24154n(cVar);
        this.f6473j = a;
    }
}
